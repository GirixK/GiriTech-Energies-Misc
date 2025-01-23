package com.girix.gtemisc.data.recipe;

import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.girix.gtemisc.common.data.GTEMiscMachines.TOOL_CASTING_MACHINE;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.CASING_LAMINATED_GLASS;
import static com.gregtechceu.gtceu.common.data.GTBlocks.CASING_TEMPERED_GLASS;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.HULL;
import static com.gregtechceu.gtceu.data.recipe.CraftingComponent.CIRCUIT;


public class MachineRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {

        VanillaRecipeHelper.addShapedRecipe(provider, true, "tool_casting_machine_mv", TOOL_CASTING_MACHINE[MV].asStack(),
                "LSL",
                "PHV",
                "CWC",
                'C', CIRCUIT.getIngredient(MV),
                'P', ELECTRIC_PUMP_MV.asStack(),
                'L', CASING_TEMPERED_GLASS.asStack(),
                'S', ELECTRIC_PISTON_MV.asStack(),
                'H', HULL[MV].asStack(),
                'V', CONVEYOR_MODULE_MV.asStack(),
                'W', new ItemStack(Items.CAULDRON)
                );

        VanillaRecipeHelper.addShapedRecipe(provider, true, "tool_casting_machine_hv", TOOL_CASTING_MACHINE[HV].asStack(),
                "LSL",
                "PHV",
                "CWC",
                'C', CIRCUIT.getIngredient(HV),
                'P', ELECTRIC_PUMP_HV.asStack(),
                'L', CASING_TEMPERED_GLASS.asStack(),
                'S', ELECTRIC_PISTON_HV.asStack(),
                'H', HULL[MV].asStack(),
                'V', CONVEYOR_MODULE_HV.asStack(),
                'W', new ItemStack(Items.CAULDRON)
        );

        VanillaRecipeHelper.addShapedRecipe(provider, true, "tool_casting_machine_ev", TOOL_CASTING_MACHINE[EV].asStack(),
                "LSL",
                "PHV",
                "CWC",
                'C', CIRCUIT.getIngredient(EV),
                'P', ELECTRIC_PUMP_EV.asStack(),
                'L', CASING_LAMINATED_GLASS.asStack(),
                'S', ELECTRIC_PISTON_EV.asStack(),
                'H', HULL[EV].asStack(),
                'V', CONVEYOR_MODULE_EV.asStack(),
                'W', new ItemStack(Items.CAULDRON)
        );
    }
}
