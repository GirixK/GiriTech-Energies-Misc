package com.girix.gtemisc.data;

import com.girix.gtemisc.data.lang.GTEMiscLangHandler;
import com.girix.gtemisc.data.tags.GTEMiscItemTagLoader;

import com.tterrag.registrate.providers.ProviderType;

import static com.girix.gtemisc.GiriTechMisc.GTEMISC_REGISTRATE;

public class GTEMiscDatagen {

    public static void init() {
        GTEMISC_REGISTRATE.addDataGenerator(ProviderType.LANG, GTEMiscLangHandler::init);
        GTEMISC_REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, GTEMiscItemTagLoader::init);
    }
}
