package net.pattyg.suprememc.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pattyg.suprememc.SupremeMC;

public class InItCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SupremeMC.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SUPREME_MC_TAB = CREATIVE_MODE_TABS.register("suprememc_tab",
        () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(InItBlocks.LOGO_BLOCK.get()))
                .title(Component.translatable("creativetab.suprememc.suprememc_tab"))
                .displayItems((parameters, output) -> {
                    output.accept(InItBlocks.LOGO_BLOCK.get());
                    // Mineral Blocks
                    output.accept(InItBlocks.RUBY_BLOCK.get());
                    output.accept(InItBlocks.AQUAMARINE_BLOCK.get());
                    output.accept(InItBlocks.BURNING_DIAMOND_BLOCK.get());
                    
                    // Glow blocks - all 15 variants
                    output.accept(InItBlocks.RED_GLOW_BLOCK.get());
                    output.accept(InItBlocks.ORANGE_GLOW_BLOCK.get());
                    output.accept(InItBlocks.YELLOW_GLOW_BLOCK.get());
                    output.accept(InItBlocks.LIME_GLOW_BLOCK.get());
                    output.accept(InItBlocks.GREEN_GLOW_BLOCK.get());
                    output.accept(InItBlocks.CYAN_GLOW_BLOCK.get());
                    output.accept(InItBlocks.LIGHT_BLUE_GLOW_BLOCK.get());
                    output.accept(InItBlocks.BLUE_GLOW_BLOCK.get());
                    output.accept(InItBlocks.PURPLE_GLOW_BLOCK.get());
                    output.accept(InItBlocks.MAGENTA_GLOW_BLOCK.get());
                    output.accept(InItBlocks.PINK_GLOW_BLOCK.get());
                    output.accept(InItBlocks.BROWN_GLOW_BLOCK.get());
                    output.accept(InItBlocks.WHITE_GLOW_BLOCK.get());
                    output.accept(InItBlocks.LIGHT_GRAY_GLOW_BLOCK.get());
                    output.accept(InItBlocks.BLACK_GLOW_BLOCK.get());
                    
                    // Slime blocks - all 15 variants
                    output.accept(InItBlocks.RED_SLIME_BLOCK.get());
                    output.accept(InItBlocks.ORANGE_SLIME_BLOCK.get());
                    output.accept(InItBlocks.YELLOW_SLIME_BLOCK.get());
                    output.accept(InItBlocks.LIME_SLIME_BLOCK.get());
                    output.accept(InItBlocks.GREEN_SLIME_BLOCK.get());
                    output.accept(InItBlocks.CYAN_SLIME_BLOCK.get());
                    output.accept(InItBlocks.LIGHT_BLUE_SLIME_BLOCK.get());
                    output.accept(InItBlocks.BLUE_SLIME_BLOCK.get());
                    output.accept(InItBlocks.PURPLE_SLIME_BLOCK.get());
                    output.accept(InItBlocks.MAGENTA_SLIME_BLOCK.get());
                    output.accept(InItBlocks.PINK_SLIME_BLOCK.get());
                    output.accept(InItBlocks.BROWN_SLIME_BLOCK.get());
                    output.accept(InItBlocks.WHITE_SLIME_BLOCK.get());
                    output.accept(InItBlocks.LIGHT_GRAY_SLIME_BLOCK.get());
                    output.accept(InItBlocks.BLACK_SLIME_BLOCK.get());

                    // Items
                    output.accept(InItItems.RUBY.get());
                    output.accept(InItItems.AQUAMARINE.get());
                    output.accept(InItItems.BURNING_DIAMOND.get());
                })
                .build());
}
