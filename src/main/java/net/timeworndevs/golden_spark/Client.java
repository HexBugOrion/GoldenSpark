package net.timeworndevs.golden_spark;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.timeworndevs.golden_spark.common.CommonBlocks;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

    }

    public static void addBlockRendering() {
        RenderType translucent = RenderType.translucent();

        BlockRenderLayerMap.INSTANCE.putBlocks(translucent, CommonBlocks.STORMGLASS);
    }
}
