package com.girix.gtemisc.common.data;

import com.girix.gtemisc.GTEMiscConfig;
import com.girix.gtemisc.data.recipe.CastRecipes;
import com.girix.gtemisc.data.recipe.CastingRecipes;
import com.girix.gtemisc.data.recipe.MachineRecipes;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class GTEMiscRecipeInit {

    public static void init(Consumer<FinishedRecipe> provider) {
        MachineRecipes.init(provider);

        // Config based recipe init
        // Single-use Tools
        if (GTEMiscConfig.INSTANCE.features.enableSingleUseTools) {
            CastRecipes.init(provider);
        }
        if (GTEMiscConfig.INSTANCE.features.enableSingleUseTools) {
            CastingRecipes.init(provider);
        }
    }
}
