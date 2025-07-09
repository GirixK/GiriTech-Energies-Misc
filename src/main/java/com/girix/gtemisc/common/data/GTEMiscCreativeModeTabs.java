package com.girix.gtemisc.common.data;

import com.girix.gtemisc.GTEMiscConfig;
import com.girix.gtemisc.GiriTechMisc;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;

import com.gregtechceu.gtceu.common.data.GTItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import com.tterrag.registrate.util.entry.RegistryEntry;

import static com.girix.gtemisc.GiriTechMisc.GTEMISC_REGISTRATE;

public class GTEMiscCreativeModeTabs {

    public static RegistryEntry<CreativeModeTab> GTE_MISC = GTEMISC_REGISTRATE.defaultCreativeTab(GiriTechMisc.MOD_ID,
            builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(GiriTechMisc.MOD_ID, GTEMISC_REGISTRATE))
                    .title(Component.literal("GiriTech Energies: Misc"))
                    .icon(() -> (GTEMiscConfig.INSTANCE.features.enableSingleUseTools) ?
                            GTEMiscMachines.TOOL_CASTING_MACHINE[GTValues.HV].asStack() : GTItems.SHAPE_EMPTY.asStack())
                    .build())
            .register();
    static {
        GTEMISC_REGISTRATE.creativeModeTab(() -> GTEMiscCreativeModeTabs.GTE_MISC);
    }

    public static void init() {}
}
