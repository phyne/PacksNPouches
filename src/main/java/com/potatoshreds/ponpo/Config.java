package com.potatoshreds.ponpo;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = ponpo.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue HIKINGPACK_STORAGE = BUILDER
            .comment("How much additional storage the Hiking Pack gives(INTEGERS ONLY)")
            .defineInRange("hikingPackStorage", 21, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue HIKINGPACK_SLOTS = BUILDER
            .comment("How many additional hotbar slots the Hiking Pack gives(INTEGERS ONLY)")
            .defineInRange("hikingPackSlots", 3, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue BOOKBAG_STORAGE = BUILDER
            .comment("How much additional storage the Book Bag gives(INTEGERS ONLY)")
            .defineInRange("bookBagStorage", 12, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue BOOKBAG_SLOTS = BUILDER
            .comment("How many additional hotbar slots the Book Bag gives(INTEGERS ONLY)")
            .defineInRange("bookBagSlots", 1, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue DAYBAG_STORAGE = BUILDER
            .comment("How much additional storage the Day Bag gives(INTEGERS ONLY)")
            .defineInRange("dayBagStorage", 14, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue DAYBAG_SLOTS = BUILDER
            .comment("How many additional hotbar slots the Day Bag gives(INTEGERS ONLY)")
            .defineInRange("dayBagSlots", 2, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue SPECOPSBAG_STORAGE = BUILDER
            .comment("How much additional storage the Spec-Ops Bag gives(INTEGERS ONLY)")
            .defineInRange("specOpsBagStorage", 27, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue SPECOPSBAG_SLOTS = BUILDER
            .comment("How many additional hotbar slots the Spec-Ops Bag gives(INTEGERS ONLY)")
            .defineInRange("specOpsBagSlots", 3, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue TOOLBOX_STORAGE = BUILDER
            .comment("How much additional storage the Tool Box gives(INTEGERS ONLY)")
            .defineInRange("toolBoxStorage", 27, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue TOOLBOX_SLOTS = BUILDER
            .comment("How many additional hotbar slots the Tool Box gives(INTEGERS ONLY)")
            .defineInRange("toolBoxSlots", 3, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue CATBAG_STORAGE = BUILDER
        .comment("How much additional storage the cat bag gives(INTEGERS ONLY)")
        .defineInRange("catBagStorage", 27, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue CATBAG_SLOTS = BUILDER
            .comment("How many additional hotbar slots the cat bag gives(INTEGERS ONLY)")
            .defineInRange("catBagSlots", 3, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DRAWSTRINGBAG_STORAGE = BUILDER
        .comment("How much additional storage the Drawstring Bag gives(INTEGERS ONLY)")
        .defineInRange("drawstringBagStorage", 9, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue CLOTHBAG_STORAGE = BUILDER
        .comment("How much additional storage the Cloth Bag gives(INTEGERS ONLY)")
        .defineInRange("clothBagStorage", 9, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue HANDMADEKNAPSACK_STORAGE = BUILDER
        .comment("How much additional storage the Handmade Knapsack gives(INTEGERS ONLY)")
        .defineInRange("handMadeKnapsackStorage", 5, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue KNAPSACK_STORAGE = BUILDER
        .comment("How much additional storage the Knapsack gives(INTEGERS ONLY)")
        .defineInRange("knapsackStorage", 15, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue LEATHERBAG_STORAGE = BUILDER
        .comment("How much additional storage the Leather Bag gives(INTEGERS ONLY)")
        .defineInRange("leatherBagStorage", 15, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue MILITARYBAG_STORAGE = BUILDER
        .comment("How much additional storage the military bag gives(INTEGERS ONLY)")
        .defineInRange("militaryBagStorage", 27, 0, Integer.MAX_VALUE);


    private static final ForgeConfigSpec.IntValue LARGEPOUCH_STORAGE = BUILDER
        .comment("How much additional storage the large pouch gives(INTEGERS ONLY)")
        .defineInRange("largePouchSlots", 0, 0, Integer.MAX_VALUE);
	private static final ForgeConfigSpec.IntValue LARGEPOUCH_SLOTS = BUILDER
        .comment("How many additional hotbar slots the large pouch gives(INTEGERS ONLY)")
        .defineInRange("largePouchSlots", 2, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue SMALLPOUCH_STORAGE = BUILDER
        .comment("How much addition storage the small pouch gives(INTEGERS ONLY)")
        .defineInRange("smallPouchStorage", 0, 0, Integer.MAX_VALUE);
	private static final ForgeConfigSpec.IntValue SMALLPOUCH_SLOTS = BUILDER
        .comment("How many additional hotbar slots the small pouch gives(INTEGERS ONLY)")
        .defineInRange("smallPouchSlots", 1, 0, Integer.MAX_VALUE);
	private static final ForgeConfigSpec.IntValue TOOLBELT_STORAGE = BUILDER
        .comment("How much addition storage the toolbelt gives(INTEGERS ONLY)")
        .defineInRange("toolBeltStorage", 0, 0, Integer.MAX_VALUE);
	private static final ForgeConfigSpec.IntValue TOOLBELT_SLOTS = BUILDER
        .comment("How many additional hotbar slots the toolbelt gives(INTEGERS ONLY)")
        .defineInRange("toolBeltSlots", 4, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue TOOLBELT_RESTRICTION = BUILDER
        .comment("How many belt slots the toolbelt adds/removes.(INTEGERS ONLY)" +
            "\n Note that this value should essentially always be negative or 0, as otherwise you will be able to equip infinite belts.")
            .defineInRange("toolBeltRestriction", -1, -2, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue SPECOPSUTILITYBELT_STORAGE = BUILDER
        .comment("How much addition storage the specops belt gives(INTEGERS ONLY)")
        .defineInRange("specOpsUtilityBeltStorage", 0, 0, Integer.MAX_VALUE);
	private static final ForgeConfigSpec.IntValue SPECOPSUTILITYBELT_SLOTS = BUILDER
        .comment("How many additional hotbar slots the specops belt gives(INTEGERS ONLY)")
        .defineInRange("specOpsUtilityBeltSlots", 5, 0, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue SPECOPSUTILITYBELT_RESTRICTION = BUILDER
        .comment("How many belt slots the specops belt adds/removes.(INTEGERS ONLY)" +
            "\n Note that this value should essentially always be negative or 0, as otherwise you will be able to equip infinite belts.")
            .defineInRange("specOpsUtilityBeltRestriction", -1, -2, Integer.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue CATPOUCH_STORAGE = BUILDER
        .comment("How much additional storage the cat pouch gives(INTEGERS ONLY)")
        .defineInRange("catPouchStorage", 0, 0, Integer.MAX_VALUE);
	private static final ForgeConfigSpec.IntValue CATPOUCH_SLOTS = BUILDER
        .comment("How many additional hotbar slots the cat pouch gives(INTEGERS ONLY)")
        .defineInRange("catPouchSlots", 3, 0, Integer.MAX_VALUE);


    static final ForgeConfigSpec SPEC = BUILDER.build();

    //storage and slots variables for backpacks with both
    public static int hikingPackStorage;
    public static int hikingPackSlots;
    public static int bookBagStorage;
    public static int bookBagSlots;
    public static int dayBagStorage;
    public static int dayBagSlots;
    public static int specOpsBagStorage;
    public static int specOpsBagSlots;
    public static int toolBoxStorage;
    public static int toolBoxSlots;
    public static int catBagStorage;
    public static int catBagSlots;

    //storage variables for backpacks with only storage
    public static int drawstringBagStorage;
    public static int clothBagStorage;
    public static int handMadeKnapsackStorage;
    public static int knapsackStorage;
    public static int leatherBagStorage;
    public static int militaryBagStorage;

    //slots, storage variables, and belt restrictions for pouches
    public static int largePouchStorage;
	public static int largePouchSlots;
    public static int smallPouchStorage;
	public static int smallPouchSlots;
	public static int toolBeltStorage;
    public static int toolBeltSlots;
    public static int toolBeltRestriction;
	public static int specOpsUtilityBeltStorage;
    public static int specOpsUtilityBeltSlots;
    public static int specOpsUtilityBeltRestriction;
    public static int catPouchStorage;
	public static int catPouchSlots;

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof final String itemName && ForgeRegistries.ITEMS.containsKey(new ResourceLocation(itemName));
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        hikingPackStorage = HIKINGPACK_STORAGE.get();
        hikingPackSlots = HIKINGPACK_SLOTS.get();
        bookBagStorage = BOOKBAG_STORAGE.get();
        bookBagSlots = BOOKBAG_SLOTS.get();
        dayBagStorage = DAYBAG_STORAGE.get();
        dayBagSlots = DAYBAG_SLOTS.get();
        specOpsBagStorage = SPECOPSBAG_STORAGE.get();
        specOpsBagSlots = SPECOPSBAG_SLOTS.get();
        toolBoxStorage = TOOLBOX_STORAGE.get();
        toolBoxSlots = TOOLBOX_SLOTS.get();
        catBagStorage = CATBAG_STORAGE.get();
        catBagSlots = CATBAG_SLOTS.get();

        drawstringBagStorage = DRAWSTRINGBAG_STORAGE.get();
        clothBagStorage = CLOTHBAG_STORAGE.get();
        handMadeKnapsackStorage = HANDMADEKNAPSACK_STORAGE.get();
        knapsackStorage = KNAPSACK_STORAGE.get();
        leatherBagStorage = LEATHERBAG_STORAGE.get();
        militaryBagStorage = MILITARYBAG_STORAGE.get();

        largePouchStorage = LARGEPOUCH_STORAGE.get();
		largePouchSlots = LARGEPOUCH_SLOTS.get();
		smallPouchStorage = SMALLPOUCH_STORAGE.get();
        smallPouchSlots = SMALLPOUCH_SLOTS.get();
        toolBeltStorage = TOOLBELT_STORAGE.get();
		toolBeltSlots = TOOLBELT_SLOTS.get();
        toolBeltRestriction = TOOLBELT_RESTRICTION.get();
		specOpsUtilityBeltStorage = SPECOPSUTILITYBELT_STORAGE.get();
        specOpsUtilityBeltSlots = SPECOPSUTILITYBELT_SLOTS.get();
        specOpsUtilityBeltRestriction = SPECOPSUTILITYBELT_RESTRICTION.get();
        catPouchStorage = CATPOUCH_STORAGE.get();
		catPouchSlots = CATPOUCH_SLOTS.get();
    }
}
