
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.berkesriders.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.berkesriders.item.YellowDragonScaleItem;
import net.mcreator.berkesriders.item.WhiteDragonScaleItem;
import net.mcreator.berkesriders.item.WhereNoOneGoesItem;
import net.mcreator.berkesriders.item.RedDragonScaleItem;
import net.mcreator.berkesriders.item.PurpleDragonScaleItem;
import net.mcreator.berkesriders.item.GreenDragonScaleItem;
import net.mcreator.berkesriders.item.EmblemCreativeTabItem;
import net.mcreator.berkesriders.item.DragonMeatItem;
import net.mcreator.berkesriders.item.DragonManualItem;
import net.mcreator.berkesriders.item.DragonBoneItem;
import net.mcreator.berkesriders.item.BrownDragonScaleItem;
import net.mcreator.berkesriders.item.BlueDragonScaleItem;
import net.mcreator.berkesriders.item.BlackDragonScaleItem;
import net.mcreator.berkesriders.BerkesRidersMod;

public class BerkesRidersModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BerkesRidersMod.MODID);
	public static final RegistryObject<Item> WHERE_NO_ONE_GOES = REGISTRY.register("where_no_one_goes", () -> new WhereNoOneGoesItem());
	public static final RegistryObject<Item> EMBLEM_CREATIVE_TAB = REGISTRY.register("emblem_creative_tab", () -> new EmblemCreativeTabItem());
	public static final RegistryObject<Item> BLACK_DRAGON_SCALE = REGISTRY.register("black_dragon_scale", () -> new BlackDragonScaleItem());
	public static final RegistryObject<Item> WHITE_DRAGON_SCALE = REGISTRY.register("white_dragon_scale", () -> new WhiteDragonScaleItem());
	public static final RegistryObject<Item> RED_DRAGON_SCALE = REGISTRY.register("red_dragon_scale", () -> new RedDragonScaleItem());
	public static final RegistryObject<Item> BLUE_DRAGON_SCALE = REGISTRY.register("blue_dragon_scale", () -> new BlueDragonScaleItem());
	public static final RegistryObject<Item> GREEN_DRAGON_SCALE = REGISTRY.register("green_dragon_scale", () -> new GreenDragonScaleItem());
	public static final RegistryObject<Item> YELLOW_DRAGON_SCALE = REGISTRY.register("yellow_dragon_scale", () -> new YellowDragonScaleItem());
	public static final RegistryObject<Item> PURPLE_DRAGON_SCALE = REGISTRY.register("purple_dragon_scale", () -> new PurpleDragonScaleItem());
	public static final RegistryObject<Item> BROWN_DRAGON_SCALE = REGISTRY.register("brown_dragon_scale", () -> new BrownDragonScaleItem());
	public static final RegistryObject<Item> DRAGON_MEAT = REGISTRY.register("dragon_meat", () -> new DragonMeatItem());
	public static final RegistryObject<Item> DRAGON_BONE = REGISTRY.register("dragon_bone", () -> new DragonBoneItem());
	public static final RegistryObject<Item> DRAGON_MANUAL = REGISTRY.register("dragon_manual", () -> new DragonManualItem());
	// Start of user code block custom items
	// End of user code block custom items
}
