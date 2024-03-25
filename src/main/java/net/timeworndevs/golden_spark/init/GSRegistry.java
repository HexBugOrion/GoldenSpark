package net.timeworndevs.golden_spark.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.timeworndevs.golden_spark.Main;

public class GSRegistry {

    public static <I extends Item> I register(String name, I item) {
        if(item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, blockItem);
        }
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Main.MODID, name), item);
    }

    public static <B extends Block> B register(String name, B block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Main.MODID, name), block);
    }
}
