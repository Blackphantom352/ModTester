
package net.mcreator.modtester.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.modtester.itemgroup.NewItemsItemGroup;
import net.mcreator.modtester.ModtesterModElements;

@ModtesterModElements.ModElement.Tag
public class MarblesItem extends ModtesterModElements.ModElement {
	@ObjectHolder("modtester:marbles")
	public static final Item block = null;
	public MarblesItem(ModtesterModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NewItemsItemGroup.tab).maxStackSize(16).rarity(Rarity.COMMON));
			setRegistryName("marbles");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
