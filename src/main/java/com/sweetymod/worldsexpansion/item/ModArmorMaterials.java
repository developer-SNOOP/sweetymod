package com.sweetymod.worldsexpansion.item;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
	RUBY("ruby", 30, new int[]{3, 6, 8, 3}, 14,
		SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5f, 0.05f,
		() -> Ingredient.ofItems(ModItems.RUBY)),
	SAPPHIRE("sapphire", 38, new int[]{3, 7, 9, 3}, 12,
		SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f, 0.1f,
		() -> Ingredient.ofItems(ModItems.SAPPHIRE)),
	ETHERIUM("etherium", 50, new int[]{4, 8, 10, 4}, 20,
		SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.5f, 0.15f,
		() -> Ingredient.ofItems(ModItems.ETHERIUM_INGOT));

	private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY = Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
		map.put(ArmorItem.Type.BOOTS, 13);
		map.put(ArmorItem.Type.LEGGINGS, 15);
		map.put(ArmorItem.Type.CHESTPLATE, 16);
		map.put(ArmorItem.Type.HELMET, 11);
	});

	private final String name;
	private final int durabilityMultiplier;
	// Protection per slot, indexed by the armor type's equipment slot id (boots=0, legs=1, chest=2, head=3)
	private final int[] protectionAmounts;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Supplier<Ingredient> repairIngredient;

	ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts,
					  int enchantability, SoundEvent equipSound,
					  float toughness, float knockbackResistance,
					  Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.protectionAmounts = protectionAmounts;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public int getDurability(ArmorItem.Type type) {
		return BASE_DURABILITY.get(type) * this.durabilityMultiplier;
	}

	@Override
	public int getProtection(ArmorItem.Type type) {
		return this.protectionAmounts[type.getEquipmentSlot().getEntitySlotId()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

	@Override
	public String getName() {
		return WorldsExpansion.MOD_ID + ":" + this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
