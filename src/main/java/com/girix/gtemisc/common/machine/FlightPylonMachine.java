package com.girix.gtemisc.common.machine;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.capability.IControllable;
import com.gregtechceu.gtceu.api.machine.TieredEnergyMachine;
import com.gregtechceu.gtceu.api.machine.trait.notifiable.NotifiableEnergyContainer;

public class FlightPylonMachine extends TieredEnergyMachine implements IControllable {

    private static final int MAX_AMPS = 8;

    public FlightPylonMachine(BlockEntityCreationInfo info, int tier) {
        super(info, tier, new NotifiableEnergyContainer(GTValues.V[tier] * MAX_AMPS * 32, GTValues.V[tier], MAX_AMPS, 0L, 0L));
    }

    @Override
    public boolean isWorkingEnabled() {
        return false;
    }

    @Override
    public void setWorkingEnabled(boolean b) {}
}
