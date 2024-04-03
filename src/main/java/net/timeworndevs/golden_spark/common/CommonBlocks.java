package net.timeworndevs.golden_spark.common;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.timeworndevs.golden_spark.init.GSRegistry;

public class CommonBlocks {

    //Resource blocks
    //public static final Block PARTIAL_SCRAP_SPIRESTEEL = new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F));
    //public static final Block SPIRESTEEL_BLOCK = new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F));
    //public static final Block TONITRIUM_BLOCK = new Block(FabricBlockSettings.of().mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.NETHERITE).requiresTool().strength(5.0F, 6.0F));
    //public static final GlassBlock STORMGLASS = new GlassBlock(FabricBlockSettings.of().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.GLASS).requiresTool().strength(0.3f).nonOpaque());

    public static Block PARTIAL_SCRAP_SPIRESTEEL;
    public static Block SPIRESTEEL_BLOCK;
    public static Block TONITRIUM_BLOCK;
    public static Block STORMGLASS;

    //Machine component blocks
    //public static final PillarBlock MAGNET_COIL = new PillarBlock(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.NETHERITE).requiresTool().strength(5.0F, 6.0F));
    //public static final Block SPIRESTEEL_PLATING = new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F));
    //public static final Block TONITRIUM_PLATING = new Block(FabricBlockSettings.of().mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.NETHERITE).requiresTool().strength(5.0F, 6.0F));
    //public static final Block TEMP_IO = new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F));
    //public static final Block TEMP_POWER_IO = new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F));
    //Misc blocks
    //public static final EndlessSourceBlock ENDLESS_SOURCE = new EndlessSourceBlock(FabricBlockSettings.of().mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.COPPER).luminance(state -> 14));
    //public static final Block BOYKISSER = new Block(FabricBlockSettings.of().mapColor(MapColor.WHITE));

    public static Block MAGNET_COIL;
    public static Block SPIRESTEEL_PLATING;
    public static Block TONITRIUM_PLATING;
    public static Block TEMP_IO;
    public static Block TEMP_POWER_IO;

    public static void init() {
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "partial_scrap_spiresteel"), PARTIAL_SCRAP_SPIRESTEEL);
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "spiresteel_block"), SPIRESTEEL_BLOCK);
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "tonitrium_block"), TONITRIUM_BLOCK);
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "stormglass"), STORMGLASS);
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "magnet_coil"), MAGNET_COIL);
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "spiresteel_plating"), SPIRESTEEL_PLATING);
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "tonitrium_plating"), TONITRIUM_PLATING);
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "temp_io"), TEMP_IO);
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "temp_power_io"), TEMP_POWER_IO);
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "endless_source"), ENDLESS_SOURCE);
        //Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "boykisser"), BOYKISSER);

        PARTIAL_SCRAP_SPIRESTEEL = GSRegistry.register("partial_scrap_spiresteel", new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(SoundType.COPPER).requiresTool().strength(5.0F, 6.0F)));
        SPIRESTEEL_BLOCK = GSRegistry.register("spiresteel_block", new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(SoundType.COPPER).requiresTool().strength(5.0F, 6.0F)));
        TONITRIUM_BLOCK = GSRegistry.register("tonitrium_block", new Block(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_CYAN).sounds(SoundType.NETHERITE_BLOCK).requiresTool().strength(5.0F, 6.0F)));
        STORMGLASS = GSRegistry.register("stormglass", new GlassBlock(FabricBlockSettings.of().mapColor(MapColor.COLOR_CYAN).sounds(SoundType.GLASS).requiresTool().strength(0.3f).nonOpaque()));

        MAGNET_COIL = GSRegistry.register("magnet_coil", new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(SoundType.NETHERITE_BLOCK).requiresTool().strength(5.0F, 6.0F)));
        SPIRESTEEL_PLATING = GSRegistry.register("spiresteel_plating", new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(SoundType.COPPER).requiresTool().strength(5.0F, 6.0F)));
        TONITRIUM_PLATING = GSRegistry.register("tonitrium_plating", new Block(FabricBlockSettings.of().mapColor(MapColor.TERRACOTTA_CYAN).requiresTool().strength(5.0F,6.0F)));
        TEMP_IO = GSRegistry.register("temp_io", new Block(FabricBlockSettings.of()));
        TEMP_POWER_IO = GSRegistry.register("temp_power_io", new Block(FabricBlockSettings.of()));

        clientBlockRendering();
    }

    public static void clientBlockRendering() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.translucent(), STORMGLASS);
    }

}
