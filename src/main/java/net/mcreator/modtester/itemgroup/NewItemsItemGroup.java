
package net.mcreator.modtester.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.modtester.item.MarblesItem;
import net.mcreator.modtester.ModtesterModElements;

@ModtesterModElements.ModElement.Tag
public class NewItemsItemGroup extends ModtesterModElements.ModElement {
	public NewItemsItemGroup(ModtesterModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnew_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MarblesItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
