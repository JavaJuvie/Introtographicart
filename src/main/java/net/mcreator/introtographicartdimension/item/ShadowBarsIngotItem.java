
package net.mcreator.introtographicartdimension.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.introtographicartdimension.IntroToGraphicArtDimensionModElements;

@IntroToGraphicArtDimensionModElements.ModElement.Tag
public class ShadowBarsIngotItem extends IntroToGraphicArtDimensionModElements.ModElement {
	@ObjectHolder("intro_to_graphic_art_dimension:shadow_bars_ingot")
	public static final Item block = null;
	public ShadowBarsIngotItem(IntroToGraphicArtDimensionModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("shadow_bars_ingot");
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
