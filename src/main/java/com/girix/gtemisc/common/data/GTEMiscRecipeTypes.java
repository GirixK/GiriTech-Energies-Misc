package com.girix.gtemisc.common.data;

import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ELECTRIC;

public class GTEMiscRecipeTypes {

    public static final GTRecipeType TOOL_CASTING_RECIPES = GTRecipeTypes.register("tool_casting", ELECTRIC)
            .setMaxIOSize(1, 6, 1, 0)
            .setSound(GTSoundEntries.CENTRIFUGE)
            .setMaxTooltips(4);

    public static void init() {}
}
