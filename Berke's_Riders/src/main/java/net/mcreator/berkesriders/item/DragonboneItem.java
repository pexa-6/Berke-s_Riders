
package net.mcreator.berkesriders.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DragonBoneItem extends Item {
	public DragonBoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
