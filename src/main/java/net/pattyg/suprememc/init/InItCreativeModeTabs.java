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

    public static final RegistryObject<CreativeModeTab> SUPREMEMC_TAB = CREATIVE_MODE_TABS.register("suprememc_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.suprememc.suprememc_tab"))
            .icon(() -> new ItemStack(InItItems.RUBY.get()))
            .displayItems((parameters, output) -> {
                output.accept(InItItems.RUBY.get());
            })
            .build());
}
