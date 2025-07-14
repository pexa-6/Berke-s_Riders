
package net.mcreator.berkesriders.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class WhereNoOneGoesItem extends RecordItem {
	public WhereNoOneGoesItem() {
		super(1, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("berkes_riders:where_no_one_goes")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3340);
	}
}
