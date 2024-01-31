package net.timeworndevs.golden_spark.block_entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.timeworndevs.golden_spark.common.CommonBlockEntityTypes;
import team.reborn.energy.api.base.SimpleEnergyStorage;

public class EndlessSourceBlockEntity extends BlockEntity {
    public EndlessSourceBlockEntity( BlockPos pos, BlockState state) {
        super(CommonBlockEntityTypes.ENDLESS_SOURCE_TYPE, pos, state);
    }

    public final SimpleEnergyStorage energyStorage = new SimpleEnergyStorage(100000000, 100000000, 100000000) {
        @Override
        protected void onFinalCommit() {
            markDirty();
        }
    };

    public void tick() {
        if (!world.isClient && energyStorage.amount >=10) {
            energyStorage.amount -= 10;
            markDirty();
        }
    }
}
