package net.timeworndevs.golden_spark.init;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.timeworndevs.golden_spark.GSMain;
import net.timeworndevs.golden_spark.IMultiblockController;
import net.timeworndevs.golden_spark.block.SimpleMultiblockControllerBlock;

public class GSItems {

    public static final Item GS_ICON = new Item(new Item.Settings());
    public static final Item SPIREMETAL_INGOT = new Item(new Item.Settings());
    public static final Item TONITRIUM_INGOT = new Item(new Item.Settings());
    public static final Item SPIREMETAL_SCRAPS = new Item(new Item.Settings());
    public static final Item COGSPANNER = new Item(new FabricItemSettings().maxCount(1)) {
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            final var entity = context.getWorld().getBlockEntity(context.getBlockPos());
            if (entity instanceof IMultiblockController controller) {
                return controller.tryAssemble(context);
            } else {
                return ActionResult.FAIL;
            }
        }

        @Override
        public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
            var mapBuilder = ImmutableMultimap.<EntityAttribute, EntityAttributeModifier>builder();
            if (slot == EquipmentSlot.MAINHAND) {
                mapBuilder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Cogspanner attack damage increase", 1.5, EntityAttributeModifier.Operation.ADDITION));
            }
            return mapBuilder.build();
        }
    };

    public static final BlockItem SPIREMETAL_BLOCK = new BlockItem(GSBlocks.SPIREMETAL_BLOCK, new Item.Settings());
    public static final BlockItem SCRAP_SPIREMETAL = new BlockItem(GSBlocks.SCRAP_SPIREMETAL, new Item.Settings());
    public static final BlockItem TONITRIUM_BLOCK = new BlockItem(GSBlocks.TONITRIUM_BLOCK, new Item.Settings());
    public static final BlockItem STORMGLASS = new BlockItem(GSBlocks.STORMGLASS, new Item.Settings());

    public static final BlockItem MAGNET_COIL = new BlockItem(GSBlocks.MAGNET_COIL, new Item.Settings());
    public static final BlockItem SPIREMETAL_PLATING = new BlockItem(GSBlocks.SPIREMETAL_PLATING, new Item.Settings());
    public static final BlockItem TONITRIUM_PLATING = new BlockItem(GSBlocks.TONITRIUM_PLATING, new Item.Settings());
    public static final BlockItem TEMP_IO = new BlockItem(GSBlocks.TEMP_IO, new Item.Settings());
    public static final BlockItem TEMP_POWER_IO = new BlockItem(GSBlocks.TEMP_POWER_IO, new Item.Settings());


    public static final BlockItem ENDLESS_SOURCE = new BlockItem(GSBlocks.ENDLESS_SOURCE, new Item.Settings());
    public static final BlockItem BOYKISSER = new BlockItem(GSBlocks.BOYKISSER, new Item.Settings());

    public static void init() {
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "cogspanner"), COGSPANNER);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "butter_spark"), GS_ICON);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "spiremetal_scraps"), SPIREMETAL_SCRAPS);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "spiremetal_ingot"), SPIREMETAL_INGOT);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "tonitrium_ingot"), TONITRIUM_INGOT);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "scrap_spiremetal"), SCRAP_SPIREMETAL);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "spiremetal_block"), SPIREMETAL_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "tonitrium_block"), TONITRIUM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "stormglass"), STORMGLASS);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "magnet_coil"), MAGNET_COIL);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "spiremetal_plating"), SPIREMETAL_PLATING);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "tonitrium_plating"), TONITRIUM_PLATING);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "temp_io"), TEMP_IO);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "temp_power_io"), TEMP_POWER_IO);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "endless_source"), ENDLESS_SOURCE);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "simple_multiblock_controller"), SimpleMultiblockControllerBlock.ITEM);
        Registry.register(Registries.ITEM, new Identifier(GSMain.MODID, "boykisser"), BOYKISSER);
    }
}
