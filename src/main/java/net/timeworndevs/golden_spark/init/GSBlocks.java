package net.timeworndevs.golden_spark.init;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.timeworndevs.golden_spark.GSMain;
import net.timeworndevs.golden_spark.block.EndlessSourceBlock;
import net.timeworndevs.golden_spark.block.SimpleMultiblockControllerBlock;

public class GSBlocks {

    //Resource blocks
    public static final Block SCRAP_SPIREMETAL = new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F));
    public static final Block SPIREMETAL_BLOCK = new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F));
    public static final Block TONITRIUM_BLOCK = new Block(FabricBlockSettings.of().mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.NETHERITE).requiresTool().strength(5.0F, 6.0F));
    public static final GlassBlock STORMGLASS = new GlassBlock(FabricBlockSettings.of().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.GLASS).requiresTool().strength(0.3f).nonOpaque());

    //Machine component blocks
    public static final PillarBlock MAGNET_COIL = new PillarBlock(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.NETHERITE).requiresTool().strength(5.0F, 6.0F));
    public static final Block SPIREMETAL_PLATING = new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F));
    public static final Block TONITRIUM_PLATING = new Block(FabricBlockSettings.of().mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.NETHERITE).requiresTool().strength(5.0F, 6.0F));
    public static final Block TEMP_IO = new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F));
    public static final Block TEMP_POWER_IO = new Block(FabricBlockSettings.of().mapColor(MapColor.GOLD).sounds(BlockSoundGroup.COPPER).requiresTool().strength(5.0F, 6.0F));
    //Misc blocks
    public static final EndlessSourceBlock ENDLESS_SOURCE = new EndlessSourceBlock(FabricBlockSettings.of().mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.COPPER).luminance(state -> 14));
    public static final Block BOYKISSER = new Block(FabricBlockSettings.of().mapColor(MapColor.WHITE));

    public static void init() {
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "scrap_spiremetal"), SCRAP_SPIREMETAL);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "spiremetal_block"), SPIREMETAL_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "tonitrium_block"), TONITRIUM_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "stormglass"), STORMGLASS);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "magnet_coil"), MAGNET_COIL);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "spiremetal_plating"), SPIREMETAL_PLATING);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "tonitrium_plating"), TONITRIUM_PLATING);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "temp_io"), TEMP_IO);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "temp_power_io"), TEMP_POWER_IO);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "endless_source"), ENDLESS_SOURCE);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "simple_multiblock_controller"), SimpleMultiblockControllerBlock.INSTANCE);
        Registry.register(Registries.BLOCK, new Identifier(GSMain.MODID, "boykisser"), BOYKISSER);

        clientBlockRendering();
    }

    public static void clientBlockRendering() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), STORMGLASS);
    }

}
