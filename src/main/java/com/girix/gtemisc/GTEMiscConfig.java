package com.girix.gtemisc;

import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;
import dev.toma.configuration.config.format.ConfigFormats;

@Config(id = GiriTechMisc.MOD_ID)
public class GTEMiscConfig {

    public static GTEMiscConfig INSTANCE;

    static {
        INSTANCE = Configuration.registerConfig(GTEMiscConfig.class, ConfigFormats.yaml()).getConfigInstance();
    }

    @Configurable
    public FeatureConfigs features = new FeatureConfigs();

    public static class FeatureConfigs {

        @Configurable
        @Configurable.Comment({
                "Enable Single-use tools, Tool Casting, and any other item directly related to single-use tools.",
                "Default: true" })
        public boolean enableSingleUseTools = true; // default true
    }
}
