package com.girix.gtemisc.data.recipe;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.girix.gtemisc.common.data.GTEMiscMachines.TOOL_CASTING_MACHINE;
import static com.gregtechceu.gtceu.data.recipe.GTCraftingComponents.*;
import static com.gregtechceu.gtceu.data.recipe.misc.MetaTileEntityLoader.registerMachineRecipe;


public class MachineRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {

        registerMachineRecipe(provider, TOOL_CASTING_MACHINE,
                "LSL",
                "PHV",
                "CWC",
                'C', CIRCUIT,
                'P', PUMP,
                'L', GLASS,
                'S', PISTON,
                'H', HULL,
                'V', CONVEYOR,
                'W', Items.CAULDRON.getDefaultInstance());
    }
}
