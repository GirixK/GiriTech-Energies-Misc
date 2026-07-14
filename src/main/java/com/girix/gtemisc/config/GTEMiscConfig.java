package com.girix.gtemisc.config;

import com.girix.gtemisc.GiriTechMisc;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;
import dev.toma.configuration.config.UpdateRestrictions;
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

        // Single-use Tools
        @Configurable
        @Configurable.UpdateRestriction(UpdateRestrictions.GAME_RESTART)
        @Configurable.Comment({
                "Enable Single-use tools, Tool Casting, and any other item directly related to single-use tools.",
                "Default: true"
        })
        public boolean enableSingleUseTools = true; // default true

        // Maglev Pylon
        @Configurable
        @Configurable.UpdateRestriction(UpdateRestrictions.GAME_RESTART)
        @Configurable.Comment({
                "Enable MagLev pylons and associated items.",
                "Default: true"
        })
        public boolean enableFlightPylon = true; // default true

        @Configurable
        @Configurable.Comment({
                "Which power mode should the MagLev pylons use.",
                "HYBRID: The pylon does not need energy to function, but suffers a range penalty",
                "POWERED: The pylon needs energy to function",
                "UNPOWERED: The pylon does not need energy to function",
                "Default: HYBRID"
        })
        public FlightPylonMode flightPylonMode = FlightPylonMode.HYBRID;

        @Configurable
        @Configurable.Comment({
                "By how much should the range of the MagLev pylon be multiplied.",
                "Default: 1"
        })
        @Configurable.Range(min = 1, max = 10)
        public long flightPylonRangeMultiplier = 1;
    }
}
