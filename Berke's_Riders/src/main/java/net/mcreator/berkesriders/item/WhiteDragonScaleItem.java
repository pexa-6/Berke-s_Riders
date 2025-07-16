
package net.mcreator.berkesriders.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WhiteDragonScaleItem extends Item {
	public WhiteDragonScaleItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
