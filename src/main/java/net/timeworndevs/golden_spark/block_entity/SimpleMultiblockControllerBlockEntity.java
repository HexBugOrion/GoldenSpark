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
import net.minecraft.util.math.Vec3i;
import net.timeworndevs.golden_spark.AbstractMultiblockController;
import net.timeworndevs.golden_spark.IMultiblockController;
import net.timeworndevs.golden_spark.init.GSBlockEntityTypes;

import java.util.List;
import java.util.Objects;

import static net.minecraft.block.Blocks.*;

public class SimpleMultiblockControllerBlockEntity extends AbstractMultiblockController<Void> {
    public static final List<PatternInfo<Void>> PATTERNS = List.of(
            new PatternInfo<>(
                    BlockPatternBuilder.start()
                        .aisle(" D ", "DGD", " D ")
                        .aisle("   ", " @ ", "   ")
                        .where('D', pos -> pos.getBlockState() == GLASS.getDefaultState())
                        .where('G', pos -> pos.getBlockState() == GOLD_BLOCK.getDefaultState())
                        .where('@', pos -> (Object)pos.getBlockEntity() instanceof BlockEntity entity && pos.getBlockPos().equals(entity.getPos()))
                        .build(),
                    new Vec3i(-1, 0, -1),
                    null
            )
    );


    boolean assembled = false;

    public SimpleMultiblockControllerBlockEntity(BlockPos pos, BlockState state) {
        super(GSBlockEntityTypes.SIMPLE_MULTIBLOCK_CONTROLLER_TYPE, pos, state);
    }

    @Override
    protected List<PatternInfo<Void>> getPatternInfo() {
        return PATTERNS;
    }
}