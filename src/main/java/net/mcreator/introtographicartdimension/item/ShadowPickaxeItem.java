
package net.mcreator.introtographicartdimension.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.introtographicartdimension.block.ShadowPlanksBlock;
import net.mcreator.introtographicartdimension.IntroToGraphicArtDimensionModElements;

@IntroToGraphicArtDimensionModElements.ModElement.Tag
public class ShadowPickaxeItem extends IntroToGraphicArtDimensionModElements.ModElement {
	@ObjectHolder("intro_to_graphic_art_dimension:shadow_pickaxe")
	public static final Item block = null;
	public ShadowPickaxeItem(IntroToGraphicArtDimensionModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 2.5f;
			}

			public int getHarvestLevel() {
				return 9;
			}

			public int getEnchantability() {
				return 21;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ShadowPlanksBlock.block, (int) (1)));
			}
		}, 1, -1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("shadow_pickaxe"));
	}
}
