package net.timeworndevs.golden_spark.init;

import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.timeworndevs.golden_spark.GSMain;

public class GSItems {

    public static final Item GS_ICON = new Item(new Item.Settings());
    public static final Item SPIRESTEEL_INGOT = new Item(new Item.Settings());
    public static final Item TONITRIUM_INGOT = new Item(new Item.Settings());
    public static final Item SPIRESTEEL_SCRAPS = new Item(new Item.Settings());

    public static final BlockItem SPIRESTEEL_BLOCK = new BlockItem(GSBlocks.SPIRESTEEL_BLOCK, new Item.Settings());
    public static final BlockItem PARTIAL_SCRAP_SPIRESTEEL = new BlockItem(GSBlocks.PARTIAL_SCRAP_SPIRESTEEL, new Item.Settings());
    public static final BlockItem TONITRIUM_BLOCK = new BlockItem(GSBlocks.TONITRIUM_BLOCK, new Item.Settings());
    public static final BlockItem STORMGLASS = new BlockItem(GSBlocks.STORMGLASS, new Item.Settings());

    public static final BlockItem MAGNET_COIL = new BlockItem(GSBlocks.MAGNET_COIL, new Item.Settings());
    public static final BlockItem SPIRESTEEL_PLATING = new BlockItem(GSBlocks.SPIRESTEEL_PLATING, new Item.Settings());
    public static final BlockItem TONITRIUM_PLATING = new BlockItem(GSBlocks.TONITRIUM_PLATING, new Item.Settings());
    public static final BlockItem TEMP_IO = new BlockItem(GSBlocks.TEMP_IO, new Item.Settings());
    public static final BlockItem TEMP_POWER_IO = new BlockItem(GSBlocks.TEMP_POWER_IO, new Item.Settings());


    public static final BlockItem ENDLESS_SOURCE = new BlockItem(GSBlocks.ENDLESS_SOURCE, new Item.Settings());
    public static final BlockItem BOYKISSER = new BlockItem(GSBlocks.BOYKISSER, new Item.Settings());

    public static void init() {
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "butter_spark"), GS_ICON);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "spiresteel_scraps"), SPIRESTEEL_SCRAPS);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "spiresteel_ingot"), SPIRESTEEL_INGOT);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "tonitrium_ingot"), TONITRIUM_INGOT);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "partial_scrap_spiresteel"), PARTIAL_SCRAP_SPIRESTEEL);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "spiresteel_block"), SPIRESTEEL_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "tonitrium_block"), TONITRIUM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "stormglass"), STORMGLASS);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "magnet_coil"), MAGNET_COIL);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "spiresteel_plating"), SPIRESTEEL_PLATING);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "tonitrium_plating"), TONITRIUM_PLATING);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "temp_io"), TEMP_IO);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "temp_power_io"), TEMP_POWER_IO);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "endless_source"), ENDLESS_SOURCE);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "boykisser"), BOYKISSER);
    }
}
