package com.girix.gtemisc.common.data;

import com.girix.gtemisc.common.machine.FlightPylonMachine;
import com.girix.gtemisc.config.GTEMiscConfig;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.SimpleTieredMachine;
import com.gregtechceu.gtceu.api.recipe.OverclockingLogic;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;
import com.gregtechceu.gtceu.common.mui.GTSingleblockMachinePanels;

import static com.girix.gtemisc.GiriTechMisc.GTEMISC_REGISTRATE;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.*;

public class GTEMiscMachines {

    static {
        GTEMISC_REGISTRATE.creativeModeTab(() -> GTEMiscCreativeModeTabs.GTE_MISC);
    }

    public static final MachineDefinition[] TOOL_CASTING_MACHINE;
    public static final MachineDefinition[] FLIGHT_PYLON;

    static {
        if (GTEMiscConfig.INSTANCE.features.enableSingleUseTools) {
            TOOL_CASTING_MACHINE = registerTieredMachines(GTEMISC_REGISTRATE, "tool_casting_machine",
                    (holder, tier) -> new SimpleTieredMachine(holder, tier, defaultTankSizeFunction), (tier, builder) -> builder
                            .recipeType(GTEMiscRecipeTypes.TOOL_CASTING_RECIPES)
                            .recipeModifier(GTRecipeModifiers.ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK))
                            .ui(GTSingleblockMachinePanels.GENERAL_MACHINE)
                            .langValue("%s Tool Casting Machine %s".formatted(VLVH[tier], VLVT[tier]))
                            .rotationState(RotationState.NON_Y_AXIS)
                            .workableTieredHullModel(GTCEu.id("block/machines/fluid_solidifier"))
                            .register(),
                    GTValues.tiersBetween(MV, EV));
        } else {
            TOOL_CASTING_MACHINE = null;
        }

        if (GTEMiscConfig.INSTANCE.features.enableFlightPylon) {
            FLIGHT_PYLON = registerTieredMachines(GTEMISC_REGISTRATE, "flight_pylon",
                    FlightPylonMachine::new, (tier, builder) -> builder
                            .langValue("%s MagLev Pylon %s".formatted(VLVH[tier], VLVT[tier]))
                            .rotationState(RotationState.NON_Y_AXIS)
                            .workableTieredHullModel(GTCEu.id("block/machines/macerator"))
                            .register(),
                    GTValues.tiersBetween(MV, UV));
        } else {
            FLIGHT_PYLON = null;
        }
    }

    public static void init() {}
}
