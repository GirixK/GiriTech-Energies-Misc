package com.girix.gtemisc.data.recipe;

import com.girix.gtemisc.common.data.GTEMiscItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraftforge.fluids.FluidStack;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Map;
import java.util.function.Consumer;

import static com.girix.gtemisc.common.data.GTEMiscRecipeTypes.TOOL_CASTING_RECIPES;

public class CastingRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        Map<FluidStack, Pair<Integer, Integer>> fluids = Map.of(GTMaterials.Steel.getFluid(100), Pair.of(4, 32), GTMaterials.TungstenSteel.getFluid(100), Pair.of(8, 512));
        for (var entry: fluids.entrySet()) {

            TOOL_CASTING_RECIPES.recipeBuilder("cast_single_use_hammer_from_" + entry.getKey().getTranslationKey())
                    .inputFluids(entry.getKey().copy())
                    .notConsumable(GTEMiscItems.SINGLE_USE_HAMMER_CAST)
                    .outputItems(GTEMiscItems.SINGLE_USE_HAMMER.asStack(entry.getValue().getLeft()))
                    .duration(5*20)
                    .EUt(entry.getValue().getRight())
                    .save(provider);

        }
    }
}
