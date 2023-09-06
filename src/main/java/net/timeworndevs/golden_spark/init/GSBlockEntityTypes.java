package net.timeworndevs.golden_spark.init;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.timeworndevs.golden_spark.GSMain;
import net.timeworndevs.golden_spark.block.SimpleMultiblockControllerBlock;
import net.timeworndevs.golden_spark.block_entity.EndlessSourceBlockEntity;
import net.timeworndevs.golden_spark.block_entity.SimpleMultiblockControllerBlockEntity;
import team.reborn.energy.api.base.SimpleEnergyStorage;

public class GSBlockEntityTypes {

    //This BlockEntity type is for a creative power cell
    public static BlockEntityType<EndlessSourceBlockEntity> ENDLESS_SOURCE_TYPE;
    public static BlockEntityType<?> SIMPLE_MULTIBLOCK_CONTROLLER_TYPE = FabricBlockEntityTypeBuilder.create(SimpleMultiblockControllerBlockEntity::new, SimpleMultiblockControllerBlock.INSTANCE).build();

    public static void init() {
        ENDLESS_SOURCE_TYPE = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(GSMain.MODID, "endless_source_entity"), FabricBlockEntityTypeBuilder.create(EndlessSourceBlockEntity::new, GSBlocks.ENDLESS_SOURCE).build());
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(GSMain.MODID, "simple_multiblock_controller"), SIMPLE_MULTIBLOCK_CONTROLLER_TYPE);
    }

}
