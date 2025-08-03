package com.girix.gtemisc;

import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;
import dev.toma.configuration.config.UpdateRestrictions;
import dev.toma.configuration.config.format.ConfigFormats;
import org.jetbrains.annotations.ApiStatus;

@Config(id = GiriTechMisc.MOD_ID)
public class GTEMiscConfig {

    public static GTEMiscConfig INSTANCE;

    @ApiStatus.Internal
    public static dev.toma.configuration.config.ConfigHolder<GTEMiscConfig> INTERNAL_INSTANCE;

    static {
        INTERNAL_INSTANCE = Configuration.registerConfig(GTEMiscConfig.class, ConfigFormats.YAML);
        INSTANCE = INTERNAL_INSTANCE.getConfigInstance();
    }

    @Configurable
    public FeatureConfigs features = new FeatureConfigs();

    public static class FeatureConfigs {

        @Configurable
        @Configurable.Comment({
                "Enable Single-use tools, Tool Casting, and any other item directly related to single-use tools.",
                "Default: true" })
        @Configurable.UpdateRestriction(UpdateRestrictions.GAME_RESTART)
        public boolean enableSingleUseTools = true; // default true
    }
}
