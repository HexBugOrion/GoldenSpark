package net.timeworndevs.golden_spark.common;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.timeworndevs.golden_spark.Main;

public class CommonItemGroups {

    //private static final ResourceKey<CreativeModeTab> GS_MAIN = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(Main.MODID, "gs_main"));

    public static void init() {
        //Registry.register(Registries.CREATIVE_MODE_TAB, GS_MAIN, FabricItemGroup.builder().displayName(Component.translatable("gs.main")).icon(() -> new ItemStack(CommonItems.GS_ICON)).entries(((context, entries) -> {
            //entries.add(CommonItems.SPIRESTEEL_INGOT);
            //entries.add(CommonItems.SPIRESTEEL_BLOCK);
            //entries.add(CommonItems.PARTIAL_SCRAP_SPIRESTEEL);
            //entries.add(CommonItems.SPIRESTEEL_PLATING);
            //entries.add(CommonItems.TONITRIUM_INGOT);
            //entries.add(CommonItems.TONITRIUM_BLOCK);
            //entries.add(CommonItems.TONITRIUM_PLATING);
            //entries.add(CommonItems.STORMGLASS);
            //entries.add(CommonItems.MAGNET_COIL);
            //entries.add(GSItems.ENDLESS_SOURCE);
        //})).build());
    }
}
