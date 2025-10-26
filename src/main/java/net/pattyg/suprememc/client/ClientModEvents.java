package net.pattyg.suprememc.client;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.pattyg.suprememc.SupremeMC;
import net.pattyg.suprememc.init.InItBlocks;

@Mod.EventBusSubscriber(modid = SupremeMC.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            // Register all colored slime blocks to use translucent render layer
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.RED_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.ORANGE_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.YELLOW_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.LIME_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.GREEN_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.CYAN_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.LIGHT_BLUE_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.BLUE_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.PURPLE_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.MAGENTA_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.PINK_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.BROWN_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.WHITE_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.LIGHT_GRAY_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
            ItemBlockRenderTypes.setRenderLayer(InItBlocks.BLACK_SLIME_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        });
    }
}