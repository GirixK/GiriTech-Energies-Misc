package com.girix.gtemisc.data.recipe;

import com.girix.gtemisc.GTEMiscConfig;
import com.girix.gtemisc.common.data.GTEMiscItems;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraftforge.fluids.FluidStack;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Map;
import java.util.function.Consumer;

import static com.girix.gtemisc.common.data.GTEMiscRecipeTypes.TOOL_CASTING_RECIPES;

public class CastingRecipes {

    @SuppressWarnings("PointlessArithmeticExpression")
    public static void init(Consumer<FinishedRecipe> provider) {
        if (GTEMiscConfig.INSTANCE.features.enableSingleUseTools) {

            Map<FluidStack, Pair<Integer, Integer>> moltenMetals = Map.of(
                    GTMaterials.Steel.getFluid(GTValues.L * 4), Pair.of(64, 24),
                    GTMaterials.VanadiumSteel.getFluid(GTValues.L * 2), Pair.of(96, 16),
                    GTMaterials.RedSteel.getFluid(GTValues.L * 1), Pair.of(128, 12),
                    GTMaterials.HSSE.getFluid(GTValues.L * 1), Pair.of(256, 8));

            Map<FluidStack, Pair<Integer, Integer>> moltenRubbers = Map.of(
                    GTMaterials.Rubber.getFluid(GTValues.L * 16), Pair.of(48, 24),
                    GTMaterials.StyreneButadieneRubber.getFluid(GTValues.L * 8), Pair.of(128, 12),
                    GTMaterials.SiliconeRubber.getFluid(GTValues.L * 8), Pair.of(128, 12),
                    GTMaterials.Polybenzimidazole.getFluid(GTValues.L * 4), Pair.of(192, 6));

            for (var entry : moltenMetals.entrySet()) {

                int outputAmount = entry.getValue().getLeft();

                GTRecipeBuilder hammerBuilder = TOOL_CASTING_RECIPES
                        .recipeBuilder("cast_single_use_hammer_from_" + entry.getKey().getTranslationKey())
                        .inputFluids(entry.getKey().copy())
                        .notConsumable(GTEMiscItems.SINGLE_USE_HAMMER_CAST)
                        .duration(entry.getValue().getRight() * 20)
                        .EUt(96);

                GTRecipeBuilder screwdriverBuilder = TOOL_CASTING_RECIPES
                        .recipeBuilder("cast_single_use_screwdriver_from_" + entry.getKey().getTranslationKey())
                        .inputFluids(entry.getKey().copy())
                        .notConsumable(GTEMiscItems.SINGLE_USE_SCREWDRIVER_CAST)
                        .duration(entry.getValue().getRight() * 20)
                        .EUt(96);

                GTRecipeBuilder sawBuilder = TOOL_CASTING_RECIPES
                        .recipeBuilder("cast_single_use_saw_from_" + entry.getKey().getTranslationKey())
                        .inputFluids(entry.getKey().copy())
                        .notConsumable(GTEMiscItems.SINGLE_USE_SAW_CAST)
                        .duration(entry.getValue().getRight() * 20)
                        .EUt(96);

                GTRecipeBuilder fileBuilder = TOOL_CASTING_RECIPES
                        .recipeBuilder("cast_single_use_file_from_" + entry.getKey().getTranslationKey())
                        .inputFluids(entry.getKey().copy())
                        .notConsumable(GTEMiscItems.SINGLE_USE_FILE_CAST)
                        .duration(entry.getValue().getRight() * 20)
                        .EUt(96);

                GTRecipeBuilder wrenchBuilder = TOOL_CASTING_RECIPES
                        .recipeBuilder("cast_single_use_wrench_from_" + entry.getKey().getTranslationKey())
                        .inputFluids(entry.getKey().copy())
                        .notConsumable(GTEMiscItems.SINGLE_USE_WRENCH_CAST)
                        .duration(entry.getValue().getRight() * 20)
                        .EUt(96);

                GTRecipeBuilder wireCutterBuilder = TOOL_CASTING_RECIPES
                        .recipeBuilder("cast_single_use_wire_cutter_from_" + entry.getKey().getTranslationKey())
                        .inputFluids(entry.getKey().copy())
                        .notConsumable(GTEMiscItems.SINGLE_USE_WIRE_CUTTER_CAST)
                        .duration(entry.getValue().getRight() * 20)
                        .EUt(96);

                GTRecipeBuilder crowbarBuilder = TOOL_CASTING_RECIPES
                        .recipeBuilder("cast_single_use_crowbar_from_" + entry.getKey().getTranslationKey())
                        .inputFluids(entry.getKey().copy())
                        .notConsumable(GTEMiscItems.SINGLE_USE_CROWBAR_CAST)
                        .duration(entry.getValue().getRight() * 20)
                        .EUt(96);

                while (outputAmount > 0) {
                    int amount = Math.min(64, outputAmount);
                    hammerBuilder.outputItems(GTEMiscItems.SINGLE_USE_HAMMER.asStack(amount));
                    screwdriverBuilder.outputItems(GTEMiscItems.SINGLE_USE_SCREWDRIVER.asStack(amount));
                    sawBuilder.outputItems(GTEMiscItems.SINGLE_USE_SAW.asStack(amount));
                    fileBuilder.outputItems(GTEMiscItems.SINGLE_USE_FILE.asStack(amount));
                    wrenchBuilder.outputItems(GTEMiscItems.SINGLE_USE_WRENCH.asStack(amount));
                    wireCutterBuilder.outputItems(GTEMiscItems.SINGLE_USE_WIRE_CUTTER.asStack(amount));
                    crowbarBuilder.outputItems(GTEMiscItems.SINGLE_USE_CROWBAR.asStack(amount));
                    outputAmount -= 64;
                }

                hammerBuilder.save(provider);
                screwdriverBuilder.save(provider);
                sawBuilder.save(provider);
                fileBuilder.save(provider);
                wrenchBuilder.save(provider);
                wireCutterBuilder.save(provider);
                crowbarBuilder.save(provider);
            }

            for (var entry : moltenRubbers.entrySet()) {

                int outputAmount = entry.getValue().getLeft();

                GTRecipeBuilder malletBuilder = TOOL_CASTING_RECIPES
                        .recipeBuilder("cast_single_use_mallet_from_" + entry.getKey().getTranslationKey())
                        .inputFluids(entry.getKey().copy())
                        .notConsumable(GTEMiscItems.SINGLE_USE_SOFT_MALLET_CAST)
                        .duration(entry.getValue().getRight() * 20)
                        .EUt(96);

                while (outputAmount > 0) {
                    int amount = Math.min(64, outputAmount);
                    malletBuilder.outputItems(GTEMiscItems.SINGLE_USE_SOFT_MALLET.asStack(amount));
                    outputAmount -= 64;
                }

                malletBuilder.save(provider);
            }

        }
    }
}
