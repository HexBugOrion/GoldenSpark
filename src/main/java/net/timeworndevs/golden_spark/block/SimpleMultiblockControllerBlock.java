package net.timeworndevs.golden_spark.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.BlockPos;
import net.timeworndevs.golden_spark.block_entity.SimpleMultiblockControllerBlockEntity;
import org.jetbrains.annotations.Nullable;

public class SimpleMultiblockControllerBlock extends BlockWithEntity {
    public static final Block INSTANCE = new SimpleMultiblockControllerBlock(FabricBlockSettings.create());
    public static final BlockItem ITEM = new BlockItem(INSTANCE, new FabricItemSettings());

    private SimpleMultiblockControllerBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SimpleMultiblockControllerBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
