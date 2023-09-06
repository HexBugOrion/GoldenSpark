package net.timeworndevs.golden_spark;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.MutableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import org.jetbrains.annotations.Contract;

import java.util.List;

public abstract class AbstractMultiblockController<C> extends BlockEntity implements IMultiblockController {
    boolean isAssembled = false;

    @Override
    public void readNbt(NbtCompound nbt) {
        isAssembled = nbt.getBoolean("Assembled");
        super.readNbt(nbt);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        nbt.putBoolean("Assembled", isAssembled);
        super.writeNbt(nbt);
    }

    @Contract(pure = true)
    protected abstract List<PatternInfo<C>> getPatternInfo();
    protected static class PatternInfo<C> {
        final BlockPattern pattern;
        final Vec3i entityPosition;
        final C context;

        public PatternInfo(BlockPattern pattern, Vec3i entityPosition, C context) {
            this.pattern = pattern;
            this.entityPosition = entityPosition;
            this.context = context;
        }
    }

    public AbstractMultiblockController(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public ActionResult tryAssemble(ItemUsageContext context) {
        assert world != null;
        if (isAssembled) {
            disassemble();
            return ActionResult.SUCCESS;
        }
        for (var pattern: getPatternInfo()) {
            final var result = pattern.pattern.searchAround(world, pos);
            if (result != null) {
                final var entityPos = result.getFrontTopLeft().add(pattern.entityPosition);
                assert world.getBlockEntity(entityPos) == this;
                assemble(pattern.context);
                markDirty();
                return ActionResult.SUCCESS;
            }
        }
        if (context.getPlayer() instanceof ServerPlayerEntity server)
            server.sendMessage(MutableText.of(new LiteralTextContent("Invalid multiblock")).formatted(Formatting.RED), true);
        return ActionResult.FAIL;
    }

    void assemble(C context) {
        isAssembled = true;
        markDirty();
    }
    void disassemble() {
        isAssembled = false;
        markDirty();
    }
}
