
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.berkesriders.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.berkesriders.item.WhereNoOneGoesItem;
import net.mcreator.berkesriders.item.NightFuryscalesItem;
import net.mcreator.berkesriders.item.DragonboneItem;
import net.mcreator.berkesriders.BerkesRidersMod;

public class BerkesRidersModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BerkesRidersMod.MODID);
	public static final RegistryObject<Item> NIGHT_FURY_SCALES = REGISTRY.register("night_fury_scales", () -> new NightFuryscalesItem());
	public static final RegistryObject<Item> WHERE_NO_ONE_GOES = REGISTRY.register("where_no_one_goes", () -> new WhereNoOneGoesItem());
	public static final RegistryObject<Item> DRAGON_BONE = REGISTRY.register("dragon_bone", () -> new DragonboneItem());
	// Start of user code block custom items
	// End of user code block custom items
}
