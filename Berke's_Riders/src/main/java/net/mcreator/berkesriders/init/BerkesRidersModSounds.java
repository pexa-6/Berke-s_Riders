
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.berkesriders.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.berkesriders.BerkesRidersMod;

public class BerkesRidersModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BerkesRidersMod.MODID);
	public static final RegistryObject<SoundEvent> WHERE_NO_ONE_GOES = REGISTRY.register("where_no_one_goes", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("berkes_riders", "where_no_one_goes")));
}
