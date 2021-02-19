
package net.mcreator.introtographicartdimension.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.introtographicartdimension.block.ShadowPlanksBlock;
import net.mcreator.introtographicartdimension.IntroToGraphicArtDimensionModElements;

@IntroToGraphicArtDimensionModElements.ModElement.Tag
public class ShadowAxeItem extends IntroToGraphicArtDimensionModElements.ModElement {
	@ObjectHolder("intro_to_graphic_art_dimension:shadow_axe")
	public static final Item block = null;
	public ShadowAxeItem(IntroToGraphicArtDimensionModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 4.5f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 21;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ShadowPlanksBlock.block, (int) (1)));
			}
		}, 1, -1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("shadow_axe"));
	}
}
