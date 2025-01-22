package com.girix.gtemisc.common.data;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.girix.gtemisc.GiriTechMisc.GTEMISC_REGISTRATE;

public class GTEMiscItems {

    // Tools
    public static final ItemEntry<Item> SINGLE_USE_HAMMER = makeTool("hammer");
    public static final ItemEntry<Item> SINGLE_USE_SCREWDRIVER = makeTool("screwdriver");
    public static final ItemEntry<Item> SINGLE_USE_SAW = makeTool("saw");
    public static final ItemEntry<Item> SINGLE_USE_FILE = makeTool("file");
    public static final ItemEntry<Item> SINGLE_USE_WRENCH = makeTool("wrench");

    // Casts
    public static final ItemEntry<Item> SINGLE_USE_HAMMER_CAST = makeCast("hammer");
    public static final ItemEntry<Item> SINGLE_USE_SCREWDRIVER_CAST = makeCast("screwdriver");
    public static final ItemEntry<Item> SINGLE_USE_SAW_CAST = makeCast("saw");
    public static final ItemEntry<Item> SINGLE_USE_FILE_CAST = makeCast("file");
    public static final ItemEntry<Item> SINGLE_USE_WRENCH_CAST = makeCast("wrench");

    //TODO add crowbar, soft mallet, and wire cutters


    private static ItemEntry<Item> makeCast (String toolType) {
        return GTEMISC_REGISTRATE.item("single_use_" + toolType + "_cast", Item::new)
                .lang(toolType.substring(0,1).toUpperCase() + toolType.substring(1) + " Cast")
                .register();
    }

    private static ItemEntry<Item> makeTool (String toolType) {
        return GTEMISC_REGISTRATE.item("single_use_" + toolType, Item::new)
                .lang("Single-use " + toolType.substring(0,1).toUpperCase() + toolType.substring(1))
                .tag(TagUtil.createItemTag("tools/" + toolType + (toolType.equals("wrench") ? "es" : "s") , false))
                .register();
    }

    public static void init() {}

}
