
package net.mcreator.introtographicartdimension.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.introtographicartdimension.IntroToGraphicArtDimensionModElements;

@IntroToGraphicArtDimensionModElements.ModElement.Tag
public class ShadowBarsArmorItem extends IntroToGraphicArtDimensionModElements.ModElement {
	@ObjectHolder("intro_to_graphic_art_dimension:shadow_bars_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("intro_to_graphic_art_dimension:shadow_bars_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("intro_to_graphic_art_dimension:shadow_bars_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("intro_to_graphic_art_dimension:shadow_bars_armor_boots")
	public static final Item boots = null;
	public ShadowBarsArmorItem(IntroToGraphicArtDimensionModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 90;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{12, 36, 30, 12}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 54;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ShadowBarsIngotItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "shadow_bars_armor";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "intro_to_graphic_art_dimension:textures/models/armor/shadowbars_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("shadow_bars_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "intro_to_graphic_art_dimension:textures/models/armor/shadowbars_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("shadow_bars_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "intro_to_graphic_art_dimension:textures/models/armor/shadowbars_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("shadow_bars_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "intro_to_graphic_art_dimension:textures/models/armor/shadowbars_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("shadow_bars_armor_boots"));
	}
}
