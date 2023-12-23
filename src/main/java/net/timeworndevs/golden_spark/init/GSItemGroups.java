package net.timeworndevs.golden_spark.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.timeworndevs.golden_spark.GSMain;

public class GSItemGroups {

    private static final RegistryKey<ItemGroup> GS_MAIN = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GSMain.MODID, "gs_main"));

    public static void init() {
        Registry.register(Registries.ITEM_GROUP, GS_MAIN, FabricItemGroup.builder().displayName(Text.translatable("gs.main")).icon(() -> new ItemStack(GSItems.GS_ICON)).entries(((context, entries) -> {
            entries.add(GSItems.SPIRESTEEL_INGOT);
            entries.add(GSItems.SPIRESTEEL_BLOCK);
            entries.add(GSItems.SCRAP_SPIRESTEEL);
            entries.add(GSItems.SPIRESTEEL_PLATING);
            entries.add(GSItems.TONITRIUM_INGOT);
            entries.add(GSItems.TONITRIUM_BLOCK);
            entries.add(GSItems.TONITRIUM_PLATING);
            entries.add(GSItems.STORMGLASS);
            entries.add(GSItems.MAGNET_COIL);
            //entries.add(GSItems.ENDLESS_SOURCE);
        })).build());
    }
}
