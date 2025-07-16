
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.berkesriders.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.berkesriders.world.inventory.DragonTutorialGUI3Menu;
import net.mcreator.berkesriders.world.inventory.DragonTutorialGUI2Menu;
import net.mcreator.berkesriders.world.inventory.DragonTutorialGUI1Menu;
import net.mcreator.berkesriders.BerkesRidersMod;

public class BerkesRidersModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BerkesRidersMod.MODID);
	public static final RegistryObject<MenuType<DragonTutorialGUI1Menu>> DRAGON_TUTORIAL_GUI_1 = REGISTRY.register("dragon_tutorial_gui_1", () -> IForgeMenuType.create(DragonTutorialGUI1Menu::new));
	public static final RegistryObject<MenuType<DragonTutorialGUI2Menu>> DRAGON_TUTORIAL_GUI_2 = REGISTRY.register("dragon_tutorial_gui_2", () -> IForgeMenuType.create(DragonTutorialGUI2Menu::new));
	public static final RegistryObject<MenuType<DragonTutorialGUI3Menu>> DRAGON_TUTORIAL_GUI_3 = REGISTRY.register("dragon_tutorial_gui_3", () -> IForgeMenuType.create(DragonTutorialGUI3Menu::new));
}
