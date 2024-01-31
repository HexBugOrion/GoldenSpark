package net.timeworndevs.golden_spark.common;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.timeworndevs.golden_spark.Main;

public class CommonItemGroups {

    private static final RegistryKey<ItemGroup> GS_MAIN = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Main.MODID, "gs_main"));

    public static void init() {
        Registry.register(Registries.ITEM_GROUP, GS_MAIN, FabricItemGroup.builder().displayName(Text.translatable("gs.main")).icon(() -> new ItemStack(CommonItems.GS_ICON)).entries(((context, entries) -> {
            entries.add(CommonItems.SPIRESTEEL_INGOT);
            entries.add(CommonItems.SPIRESTEEL_BLOCK);
            entries.add(CommonItems.PARTIAL_SCRAP_SPIRESTEEL);
            entries.add(CommonItems.SPIRESTEEL_PLATING);
            entries.add(CommonItems.TONITRIUM_INGOT);
            entries.add(CommonItems.TONITRIUM_BLOCK);
            entries.add(CommonItems.TONITRIUM_PLATING);
            entries.add(CommonItems.STORMGLASS);
            entries.add(CommonItems.MAGNET_COIL);
            //entries.add(GSItems.ENDLESS_SOURCE);
        })).build());
    }
}
