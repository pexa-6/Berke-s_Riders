
package net.mcreator.berkesriders.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlackDragonScaleItem extends Item {
	public BlackDragonScaleItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
