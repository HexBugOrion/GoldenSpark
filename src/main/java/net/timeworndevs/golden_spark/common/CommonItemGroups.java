package net.timeworndevs.golden_spark.common;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.timeworndevs.golden_spark.Main;

public class CommonItemGroups {

    private static final ResourceKey<CreativeModeTab> GS_MAIN = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(Main.MODID, "gs_main"));

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, GS_MAIN, FabricItemGroup.builder().title(Component.translatable("gs.main")).icon(() -> new ItemStack(CommonItems.GS_ICON)).displayItems(((context, entries) -> {
            entries.accept(CommonItems.PARTIAL_SCRAP_SPIRESTEEL);
            //entries.accept(CommonItems.SPIRESTEEL_SCRAPS);
            entries.accept(CommonItems.SPIRESTEEL_INGOT);
            entries.accept(CommonItems.SPIRESTEEL_BLOCK);
            entries.accept(CommonItems.SPIRESTEEL_PLATING);
            entries.accept(CommonItems.TONITRIUM_INGOT);
            entries.accept(CommonItems.TONITRIUM_BLOCK);
            entries.accept(CommonItems.TONITRIUM_PLATING);
            entries.accept(CommonItems.STOMRGLASS);
            entries.accept(CommonItems.MAGNET_COIL);
        })).build());
    }
}
