
package net.mcreator.modtester.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.modtester.itemgroup.NewWeaponsItemGroup;
import net.mcreator.modtester.ModtesterModElements;

@ModtesterModElements.ModElement.Tag
public class BigBerthaItem extends ModtesterModElements.ModElement {
	@ObjectHolder("modtester:big_bertha")
	public static final Item block = null;
	public BigBerthaItem(ModtesterModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 498f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.DIAMOND_BLOCK, (int) (1)));
			}
		}, 3, 6f, new Item.Properties().group(NewWeaponsItemGroup.tab)) {
		}.setRegistryName("big_bertha"));
	}
}
