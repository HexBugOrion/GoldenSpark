package net.timeworndevs.golden_spark.block_entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.BlockPatternBuilder;
import net.minecraft.command.argument.BlockPredicateArgumentType;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.predicate.BlockPredicate;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.timeworndevs.golden_spark.IMultiblockController;
import net.timeworndevs.golden_spark.init.GSBlockEntityTypes;

import java.util.Objects;

import static net.minecraft.block.Blocks.*;

public class SimpleMultiblockControllerBlockEntity extends BlockEntity implements IMultiblockController {
    public static final BlockPattern PATTERN = BlockPatternBuilder.start()
            .aisle(" D ", "DGD", " D ")
            .aisle("   ", " @ ", "   ")
            .where('D', pos -> pos.getBlockState() == GLASS.getDefaultState())
            .where('G', pos -> pos.getBlockState() == GOLD_BLOCK.getDefaultState())
            .where('@', pos -> (Object)pos.getBlockEntity() instanceof BlockEntity entity && pos.getBlockPos().equals(entity.getPos()))
            .build();
    boolean assembled = false;

    public SimpleMultiblockControllerBlockEntity(BlockPos pos, BlockState state) {
        super(GSBlockEntityTypes.SIMPLE_MULTIBLOCK_CONTROLLER_TYPE, pos, state);
    }

    @Override
    public ActionResult tryAssemble(ItemUsageContext context) {
        if (assembled) {
            disassemble();
            return ActionResult.SUCCESS;
        }
        final var result = PATTERN.searchAround(world, pos);
        if (result == null) {
            if (context.getPlayer() instanceof ServerPlayerEntity server) server.sendMessage(MutableText.of(new LiteralTextContent("Invalid multiblock")).formatted(Formatting.RED), true);
            return ActionResult.FAIL;
        };
        final var entityPos = result.getFrontTopLeft().add(-1, 0, -1);
        assert world != null && world.getBlockEntity(entityPos) == this;
        assembled = true;
        markDirty();
        return ActionResult.SUCCESS;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        assembled = nbt.getBoolean("Assembled");
        super.readNbt(nbt);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        nbt.putBoolean("Assembled", assembled);
        super.writeNbt(nbt);
    }

    private void disassemble() {
        assembled = false;
        markDirty();
        // more will be added as needed
    }
}