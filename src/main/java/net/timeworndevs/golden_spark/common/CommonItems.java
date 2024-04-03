package net.timeworndevs.golden_spark.common;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.timeworndevs.golden_spark.Main;
import net.timeworndevs.golden_spark.init.GSRegistry;

public class CommonItems {

    public static Item GS_ICON;
    public static Item SPIRESTEEL_INGOT;
    public static Item TONITRIUM_INGOT;
    public static Item SPIRESTEEL_SCRAPS;

    public static BlockItem SPIRESTEEL_BLOCK;
    public static BlockItem PARTIAL_SCRAP_SPIRESTEEL;
    public static BlockItem TONITRIUM_BLOCK;
    public static BlockItem STOMRGLASS;

    public static BlockItem MAGNET_COIL;
    public static BlockItem SPIRESTEEL_PLATING;
    public static BlockItem TONITRIUM_PLATING;
    public static BlockItem TEMP_IO;
    public static BlockItem TEMP_POWER_IO;

    //public static final BlockItem ENDLESS_SOURCE = new BlockItem(CommonBlocks.ENDLESS_SOURCE, new Item.Properties());
    //public static final BlockItem BOYKISSER = new BlockItem(CommonBlocks.BOYKISSER, new Item.Properties());

    public static void init() {
        GS_ICON = GSRegistry.register("butter_spark", new Item(new Item.Properties()));
        SPIRESTEEL_INGOT = GSRegistry.register("spiresteel_ingot", new Item(new Item.Properties()));
        TONITRIUM_INGOT = GSRegistry.register("tonitrium_ingot", new Item(new Item.Properties()));
        SPIRESTEEL_SCRAPS = GSRegistry.register("spiresteel_scraps", new Item(new Item.Properties()));

        SPIRESTEEL_BLOCK = GSRegistry.register("spiresteel_block", new BlockItem(CommonBlocks.SPIRESTEEL_BLOCK, new Item.Properties()));
        PARTIAL_SCRAP_SPIRESTEEL = GSRegistry.register("partial_scrap_spiresteel", new BlockItem(CommonBlocks.PARTIAL_SCRAP_SPIRESTEEL, new Item.Properties()));
        TONITRIUM_BLOCK = GSRegistry.register("tonitrium_block", new BlockItem(CommonBlocks.TONITRIUM_BLOCK, new Item.Properties()));
        STOMRGLASS = GSRegistry.register("stormglass", new BlockItem(CommonBlocks.STORMGLASS, new Item.Properties()));

        MAGNET_COIL = GSRegistry.register("magnet_coil", new BlockItem(CommonBlocks.MAGNET_COIL, new Item.Properties()));
        SPIRESTEEL_PLATING = GSRegistry.register("spiresteel_plating", new BlockItem(CommonBlocks.SPIRESTEEL_PLATING, new Item.Properties()));
        TONITRIUM_PLATING = GSRegistry.register("tonitrium_plating", new BlockItem(CommonBlocks.TONITRIUM_PLATING, new Item.Properties()));
        TEMP_IO = GSRegistry.register("temp_io", new BlockItem(CommonBlocks.TEMP_IO, new Item.Properties()));
        TEMP_POWER_IO = GSRegistry.register("temp_power_io", new BlockItem(CommonBlocks.TEMP_POWER_IO, new Item.Properties()));
    }

    public static void addItemGroups() {

    }
}
