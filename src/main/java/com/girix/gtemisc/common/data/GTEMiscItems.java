package com.girix.gtemisc.common.data;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import com.gregtechceu.gtceu.utils.FormattingUtil;
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
    public static final ItemEntry<Item> SINGLE_USE_WIRECUTTER = makeTool("wirecutter");
    public static final ItemEntry<Item> SINGLE_USE_CROWBAR = makeTool("crowbar");
    public static final ItemEntry<Item> SINGLE_USE_SOFT_MALLET = makeTool("mallet");

    // Casts
    public static final ItemEntry<Item> SINGLE_USE_HAMMER_CAST = makeCast("hammer");
    public static final ItemEntry<Item> SINGLE_USE_SCREWDRIVER_CAST = makeCast("screwdriver");
    public static final ItemEntry<Item> SINGLE_USE_SAW_CAST = makeCast("saw");
    public static final ItemEntry<Item> SINGLE_USE_FILE_CAST = makeCast("file");
    public static final ItemEntry<Item> SINGLE_USE_WRENCH_CAST = makeCast("wrench");
    public static final ItemEntry<Item> SINGLE_USE_WIRECUTTER_CAST = makeCast("wirecutter");
    public static final ItemEntry<Item> SINGLE_USE_CROWBAR_CAST = makeCast("crowbar");
    public static final ItemEntry<Item> SINGLE_USE_SOFT_MALLET_CAST = makeCast("mallet");


    private static ItemEntry<Item> makeCast (String toolType) {
        return GTEMISC_REGISTRATE.item("single_use_" + toolType + "_cast", Item::new)
                .lang(FormattingUtil.toEnglishName(toolType) + " Cast")
                .register();
    }

    private static ItemEntry<Item> makeTool (String toolType) {
        return GTEMISC_REGISTRATE.item("single_use_" + toolType, Item::new)
                .lang("Single-use " + FormattingUtil.toEnglishName(toolType))
                .tag(TagUtil.createItemTag("tools/" + (toolType.equals("wirecutter") ? "wire_cutter" : toolType) + (toolType.equals("wrench") ? "es" : "s"), false))
                .register();
    }
    public static void init() {}

}
