
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.berkesriders.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.berkesriders.BerkesRidersMod;

public class BerkesRidersModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BerkesRidersMod.MODID);
	public static final RegistryObject<CreativeModeTab> BERKES_RIDERS_TAB = REGISTRY.register("berkes_riders_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.berkes_riders.berkes_riders_tab")).icon(() -> new ItemStack(BerkesRidersModItems.NIGHT_FURY_SCALES.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BerkesRidersModItems.NIGHT_FURY_SCALES.get());
				tabData.accept(BerkesRidersModItems.WHERE_NO_ONE_GOES.get());
				tabData.accept(BerkesRidersModItems.DRAGON_BONE.get());
			}).build());
}
