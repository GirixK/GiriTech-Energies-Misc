package com.girix.gtemisc.common.data;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.girix.gtemisc.GiriTechMisc.GTEMISC_REGISTRATE;

public class GTEMiscItems {
    public static final ItemEntry<Item> TEST_SCREWDRIVER_CAST = GTEMISC_REGISTRATE.item("test_screwdriver_cast", Item::new)
            .lang("Test Cast")
            .register();

    public static void init() {}
}
