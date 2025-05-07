package com.girix.gtemisc.data.tags;

import com.girix.gtemisc.common.data.GTEMiscItems;

import com.gregtechceu.gtceu.data.recipe.CustomTags;

import com.tterrag.registrate.providers.RegistrateItemTagsProvider;

import static com.girix.gtemisc.common.data.GTEMiscItems.SINGLE_USE_CROWBAR;

public class GTEMiscItemTagLoader {

    public static void init(RegistrateItemTagsProvider provider) {
        provider.addTag(CustomTags.CRAFTING_HAMMERS)
                .addOptional(GTEMiscItems.SINGLE_USE_HAMMER.getId());

        provider.addTag(CustomTags.CRAFTING_SCREWDRIVERS)
                .addOptional(GTEMiscItems.SINGLE_USE_SCREWDRIVER.getId());

        provider.addTag(CustomTags.CRAFTING_SAWS)
                .addOptional(GTEMiscItems.SINGLE_USE_SAW.getId());

        provider.addTag(CustomTags.CRAFTING_FILES)
                .addOptional(GTEMiscItems.SINGLE_USE_FILE.getId());

        provider.addTag(CustomTags.CRAFTING_WRENCHES)
                .addOptional(GTEMiscItems.SINGLE_USE_WRENCH.getId());

        provider.addTag(CustomTags.CRAFTING_WIRE_CUTTERS)
                .addOptional(GTEMiscItems.SINGLE_USE_WIRE_CUTTER.getId());

        provider.addTag(CustomTags.CRAFTING_CROWBARS)
                .addOptional(GTEMiscItems.SINGLE_USE_CROWBAR.getId());

        provider.addTag(CustomTags.CRAFTING_MALLETS)
                .addOptional(GTEMiscItems.SINGLE_USE_SOFT_MALLET.getId());
    }
}
