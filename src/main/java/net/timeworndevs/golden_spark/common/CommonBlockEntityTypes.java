package net.timeworndevs.golden_spark.common;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.timeworndevs.golden_spark.Main;
import net.timeworndevs.golden_spark.block_entity.EndlessSourceBlockEntity;

public class CommonBlockEntityTypes {

    //This BlockEntity type is for a creative power cell
    public static BlockEntityType<EndlessSourceBlockEntity> ENDLESS_SOURCE_TYPE;

    public static void init() {
        ENDLESS_SOURCE_TYPE = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Main.MODID, "endless_source_entity"), FabricBlockEntityTypeBuilder.create(EndlessSourceBlockEntity::new, CommonBlocks.ENDLESS_SOURCE).build());
    }

}
