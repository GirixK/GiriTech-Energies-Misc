package com.girix.gtemisc.data.recipe;

import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static com.girix.gtemisc.common.data.GTEMiscItems.*;
import static com.gregtechceu.gtceu.api.item.tool.GTToolType.*;
import static com.gregtechceu.gtceu.common.data.GTItems.SHAPE_EMPTY;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.FORMING_PRESS_RECIPES;

public class CastRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {

        castFormingRecipeHelper(provider, "hammer", SINGLE_USE_HAMMER_CAST.asStack(), HARD_HAMMER);
        castFormingRecipeHelper(provider, "screwdriver", SINGLE_USE_SCREWDRIVER_CAST.asStack(), SCREWDRIVER);
        castFormingRecipeHelper(provider, "saw", SINGLE_USE_SAW_CAST.asStack(), SAW);
        castFormingRecipeHelper(provider, "file", SINGLE_USE_FILE_CAST.asStack(), FILE);
        castFormingRecipeHelper(provider, "wrench", SINGLE_USE_WRENCH_CAST.asStack(), WRENCH);
        castFormingRecipeHelper(provider, "wire_cutter", SINGLE_USE_WIRE_CUTTER_CAST.asStack(), WIRE_CUTTER);
        castFormingRecipeHelper(provider, "crowbar", SINGLE_USE_CROWBAR_CAST.asStack(), CROWBAR);
        castFormingRecipeHelper(provider, "mallet", SINGLE_USE_SOFT_MALLET_CAST.asStack(), SOFT_MALLET);
    }

    private static void castFormingRecipeHelper (Consumer<FinishedRecipe> provider, String recipeID, ItemStack resultItem, @NotNull GTToolType toolTypeTag) {
        FORMING_PRESS_RECIPES.recipeBuilder("single_use_" + recipeID + "_cast_forming")
                .duration(10*20)
                .EUt(120)
                .inputItems(SHAPE_EMPTY.asStack())
                .inputItems(toolTypeTag.itemTags.get(0))
                .outputItems(resultItem)
                .save(provider);
    }
}
