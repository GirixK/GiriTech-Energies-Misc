package com.girix.gtemisc.data.recipe;

import com.girix.gtemisc.GTEMiscConfig;

import com.gregtechceu.gtceu.data.recipe.CustomTags;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.girix.gtemisc.common.data.GTEMiscItems.*;
import static com.gregtechceu.gtceu.api.item.tool.GTToolType.*;
import static com.gregtechceu.gtceu.common.data.GTItems.SHAPE_EMPTY;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.FORMING_PRESS_RECIPES;

public class CastRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        if (GTEMiscConfig.INSTANCE.features.enableSingleUseTools) {

            castFormingRecipeHelper(provider, "hammer", SINGLE_USE_HAMMER_CAST.asStack(), CustomTags.CRAFTING_HAMMERS);
            castFormingRecipeHelper(provider, "screwdriver", SINGLE_USE_SCREWDRIVER_CAST.asStack(), CustomTags.CRAFTING_SCREWDRIVERS);
            castFormingRecipeHelper(provider, "saw", SINGLE_USE_SAW_CAST.asStack(), CustomTags.CRAFTING_SAWS);
            castFormingRecipeHelper(provider, "file", SINGLE_USE_FILE_CAST.asStack(), CustomTags.CRAFTING_FILES);
            castFormingRecipeHelper(provider, "wrench", SINGLE_USE_WRENCH_CAST.asStack(), CustomTags.CRAFTING_WRENCHES);
            castFormingRecipeHelper(provider, "wire_cutter", SINGLE_USE_WIRE_CUTTER_CAST.asStack(), CustomTags.CRAFTING_WIRE_CUTTERS);
            castFormingRecipeHelper(provider, "crowbar", SINGLE_USE_CROWBAR_CAST.asStack(), CustomTags.CRAFTING_CROWBARS);
            castFormingRecipeHelper(provider, "mallet", SINGLE_USE_SOFT_MALLET_CAST.asStack(), CustomTags.CRAFTING_MALLETS);
        }
    }

    private static void castFormingRecipeHelper(Consumer<FinishedRecipe> provider, String recipeID,
                                                ItemStack resultItem, TagKey<Item> craftingTag) {
        FORMING_PRESS_RECIPES.recipeBuilder("single_use_" + recipeID + "_cast_forming")
                .duration(10 * 20)
                .EUt(120)
                .inputItems(SHAPE_EMPTY.asStack())
                .inputItems(craftingTag)
                .outputItems(resultItem)
                .save(provider);
    }
}
