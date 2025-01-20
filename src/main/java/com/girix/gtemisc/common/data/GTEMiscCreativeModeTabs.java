package com.girix.gtemisc.common.data;

import com.girix.gtemisc.GiriTechMisc;
import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import static com.girix.gtemisc.GiriTechMisc.GTEMISC_REGISTRATE;

public class GTEMiscCreativeModeTabs {
    public static RegistryEntry<CreativeModeTab> GTE_MISC = GTEMISC_REGISTRATE.defaultCreativeTab(GiriTechMisc.MOD_ID,
            builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(GiriTechMisc.MOD_ID, GTEMISC_REGISTRATE))
                    .title(Component.literal("GiriTech Energies: Misc"))
                    .icon(GTEMiscItems.TEST_SCREWDRIVER_CAST::asStack)
                    .build())
            .register();
    static {
        GTEMISC_REGISTRATE.creativeModeTab(() -> GTEMiscCreativeModeTabs.GTE_MISC);
    }
    public static void init() {}
}
