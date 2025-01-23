package com.girix.gtemisc.common.data;

import com.girix.gtemisc.data.recipe.CastingRecipes;
import com.girix.gtemisc.data.recipe.MachineRecipes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class GTEMiscRecipeInit {
    public static void init(Consumer<FinishedRecipe> provider) {
        CastingRecipes.init(provider);
        MachineRecipes.init(provider);
    }
}
