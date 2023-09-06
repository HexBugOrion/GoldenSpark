package net.timeworndevs.golden_spark;

import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public interface IMultiblockController {
    ActionResult tryAssemble(ItemUsageContext context);
}
