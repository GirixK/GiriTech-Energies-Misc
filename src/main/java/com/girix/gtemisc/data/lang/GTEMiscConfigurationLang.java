package com.girix.gtemisc.data.lang;

import com.girix.gtemisc.GTEMiscConfig;
import com.girix.gtemisc.GiriTechMisc;

import com.tterrag.registrate.providers.RegistrateLangProvider;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.format.ConfigFormats;
import dev.toma.configuration.config.value.ConfigValue;
import dev.toma.configuration.config.value.IConfigValue;
import dev.toma.configuration.config.value.IHierarchical;
import dev.toma.configuration.config.value.ObjectValue;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GTEMiscConfigurationLang {

    public static void init(RegistrateLangProvider provider) {
        final Set<String> added = new HashSet<>();
        GTEMiscConfig.INTERNAL_INSTANCE.values()
                .forEach((value) -> addTranslation(provider, added, value));
                //Configuration.registerConfig(GTEMiscConfig.class, ConfigFormats.yaml()).getValueMap());
    }
    private static void addTranslation(RegistrateLangProvider provider, Set<String> added, IConfigValue<?> value) {
        var id = value.getId();
        if (added.add(id)) {
            provider.add("config.gtemisc.option." + id, id);
        }
        if (value instanceof IHierarchical hierarchical) {
            for (String childKey : value.getChildrenKeys()) {
                IConfigValue<?> child = hierarchical.getChildById(childKey);
                if (child != null) {
                    addTranslation(provider, added, child);
                }
            }
        }
    }
}
