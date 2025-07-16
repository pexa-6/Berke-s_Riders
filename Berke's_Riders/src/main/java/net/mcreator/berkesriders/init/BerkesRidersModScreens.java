
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.berkesriders.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.berkesriders.client.gui.DragonTutorialGUI3Screen;
import net.mcreator.berkesriders.client.gui.DragonTutorialGUI2Screen;
import net.mcreator.berkesriders.client.gui.DragonTutorialGUI1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BerkesRidersModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BerkesRidersModMenus.DRAGON_TUTORIAL_GUI_1.get(), DragonTutorialGUI1Screen::new);
			MenuScreens.register(BerkesRidersModMenus.DRAGON_TUTORIAL_GUI_2.get(), DragonTutorialGUI2Screen::new);
			MenuScreens.register(BerkesRidersModMenus.DRAGON_TUTORIAL_GUI_3.get(), DragonTutorialGUI3Screen::new);
		});
	}
}
