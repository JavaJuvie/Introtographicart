
package net.mcreator.introtographicartdimension.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.introtographicartdimension.IntroToGraphicArtDimensionModElements;

@IntroToGraphicArtDimensionModElements.ModElement.Tag
public class ShadowBarsShovelItem extends IntroToGraphicArtDimensionModElements.ModElement {
	@ObjectHolder("intro_to_graphic_art_dimension:shadow_bars_shovel")
	public static final Item block = null;
	public ShadowBarsShovelItem(IntroToGraphicArtDimensionModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3072;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 12;
			}

			public int getEnchantability() {
				return 84;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ShadowBarsIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("shadow_bars_shovel"));
	}
}
