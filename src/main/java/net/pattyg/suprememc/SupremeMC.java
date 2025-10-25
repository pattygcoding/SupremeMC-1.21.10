package net.pattyg.suprememc;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.pattyg.suprememc.init.InItItems;
import net.pattyg.suprememc.init.InItCreativeModeTabs;

@Mod(SupremeMC.MOD_ID)
public final class SupremeMC {
    public static final String MOD_ID = "suprememc";

    public SupremeMC(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();

        // Register the Deferred Registers to the mod event bus
        InItItems.ITEMS.register(modBusGroup);
        InItCreativeModeTabs.CREATIVE_MODE_TABS.register(modBusGroup);
    }

}
