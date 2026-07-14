package com.girix.gtemisc.common.data;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.gregtechceu.gtceu.common.mui.GTGuiTextures;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ELECTRIC;

public class GTEMiscRecipeTypes {

    public static final GTRecipeType TOOL_CASTING_RECIPES = GTRecipeTypes.register("tool_casting", ELECTRIC)
            .setMaxIOSize(1, 6, 1, 0)
            .setEUIO(IO.IN)
            .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW)
                    .setItemSlotOverlay(IO.IN, 0, GTGuiTextures.SOLIDIFIER_OVERLAY))
            .setSound(GTSoundEntries.CENTRIFUGE)
            .setMaxTooltips(4);

    public static void init() {}
}
