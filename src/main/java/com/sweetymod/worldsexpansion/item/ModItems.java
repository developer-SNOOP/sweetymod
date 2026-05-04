package com.sweetymod.worldsexpansion.item;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ModItems {

	// Materials
	public static final Item RUBY = register("ruby", Item::new, new Item.Properties());
	public static final Item SAPPHIRE = register("sapphire", Item::new, new Item.Properties());
	public static final Item RAW_ETHERIUM = register("raw_etherium", Item::new, new Item.Properties());
	public static final Item ETHERIUM_INGOT = register("etherium_ingot", Item::new, new Item.Properties());

	// Food
	public static final Item WORLD_APPLE = register("world_apple", Item::new,
		new Item.Properties()
			.food(ModFoodProperties.WORLD_APPLE_FOOD, ModFoodProperties.WORLD_APPLE_CONSUMABLE)
	);

	// Ruby Tools
	public static final Item RUBY_SWORD = register("ruby_sword", Item::new,
		new Item.Properties().sword(ModToolMaterials.RUBY, 4.0f, -2.4f).repairable(ModToolMaterials.RUBY.repairItems()));
	public static final Item RUBY_PICKAXE = register("ruby_pickaxe", Item::new,
		new Item.Properties().pickaxe(ModToolMaterials.RUBY, 1.0f, -2.8f).repairable(ModToolMaterials.RUBY.repairItems()));
	public static final Item RUBY_AXE = register("ruby_axe", Item::new,
		new Item.Properties().axe(ModToolMaterials.RUBY, 6.0f, -3.1f).repairable(ModToolMaterials.RUBY.repairItems()));
	public static final Item RUBY_SHOVEL = register("ruby_shovel", Item::new,
		new Item.Properties().shovel(ModToolMaterials.RUBY, 1.5f, -3.0f).repairable(ModToolMaterials.RUBY.repairItems()));
	public static final Item RUBY_HOE = register("ruby_hoe", Item::new,
		new Item.Properties().hoe(ModToolMaterials.RUBY, -2.0f, -1.0f).repairable(ModToolMaterials.RUBY.repairItems()));

	// Sapphire Tools
	public static final Item SAPPHIRE_SWORD = register("sapphire_sword", Item::new,
		new Item.Properties().sword(ModToolMaterials.SAPPHIRE, 4.0f, -2.4f).repairable(ModToolMaterials.SAPPHIRE.repairItems()));
	public static final Item SAPPHIRE_PICKAXE = register("sapphire_pickaxe", Item::new,
		new Item.Properties().pickaxe(ModToolMaterials.SAPPHIRE, 1.0f, -2.8f).repairable(ModToolMaterials.SAPPHIRE.repairItems()));
	public static final Item SAPPHIRE_AXE = register("sapphire_axe", Item::new,
		new Item.Properties().axe(ModToolMaterials.SAPPHIRE, 6.0f, -3.1f).repairable(ModToolMaterials.SAPPHIRE.repairItems()));
	public static final Item SAPPHIRE_SHOVEL = register("sapphire_shovel", Item::new,
		new Item.Properties().shovel(ModToolMaterials.SAPPHIRE, 1.5f, -3.0f).repairable(ModToolMaterials.SAPPHIRE.repairItems()));
	public static final Item SAPPHIRE_HOE = register("sapphire_hoe", Item::new,
		new Item.Properties().hoe(ModToolMaterials.SAPPHIRE, -3.0f, -1.0f).repairable(ModToolMaterials.SAPPHIRE.repairItems()));

	// Etherium Tools
	public static final Item ETHERIUM_SWORD = register("etherium_sword", Item::new,
		new Item.Properties().sword(ModToolMaterials.ETHERIUM, 5.0f, -2.4f).repairable(ModToolMaterials.ETHERIUM.repairItems()));
	public static final Item ETHERIUM_PICKAXE = register("etherium_pickaxe", Item::new,
		new Item.Properties().pickaxe(ModToolMaterials.ETHERIUM, 1.0f, -2.8f).repairable(ModToolMaterials.ETHERIUM.repairItems()));
	public static final Item ETHERIUM_AXE = register("etherium_axe", Item::new,
		new Item.Properties().axe(ModToolMaterials.ETHERIUM, 7.0f, -3.0f).repairable(ModToolMaterials.ETHERIUM.repairItems()));
	public static final Item ETHERIUM_SHOVEL = register("etherium_shovel", Item::new,
		new Item.Properties().shovel(ModToolMaterials.ETHERIUM, 2.0f, -3.0f).repairable(ModToolMaterials.ETHERIUM.repairItems()));
	public static final Item ETHERIUM_HOE = register("etherium_hoe", Item::new,
		new Item.Properties().hoe(ModToolMaterials.ETHERIUM, -3.0f, -1.0f).repairable(ModToolMaterials.ETHERIUM.repairItems()));

	// Ruby Armor
	public static final Item RUBY_HELMET = register("ruby_helmet", Item::new,
		armorProps(ModArmorMaterials.RUBY, ArmorType.HELMET));
	public static final Item RUBY_CHESTPLATE = register("ruby_chestplate", Item::new,
		armorProps(ModArmorMaterials.RUBY, ArmorType.CHESTPLATE));
	public static final Item RUBY_LEGGINGS = register("ruby_leggings", Item::new,
		armorProps(ModArmorMaterials.RUBY, ArmorType.LEGGINGS));
	public static final Item RUBY_BOOTS = register("ruby_boots", Item::new,
		armorProps(ModArmorMaterials.RUBY, ArmorType.BOOTS));

	// Sapphire Armor
	public static final Item SAPPHIRE_HELMET = register("sapphire_helmet", Item::new,
		armorProps(ModArmorMaterials.SAPPHIRE, ArmorType.HELMET));
	public static final Item SAPPHIRE_CHESTPLATE = register("sapphire_chestplate", Item::new,
		armorProps(ModArmorMaterials.SAPPHIRE, ArmorType.CHESTPLATE));
	public static final Item SAPPHIRE_LEGGINGS = register("sapphire_leggings", Item::new,
		armorProps(ModArmorMaterials.SAPPHIRE, ArmorType.LEGGINGS));
	public static final Item SAPPHIRE_BOOTS = register("sapphire_boots", Item::new,
		armorProps(ModArmorMaterials.SAPPHIRE, ArmorType.BOOTS));

	// Etherium Armor
	public static final Item ETHERIUM_HELMET = register("etherium_helmet", Item::new,
		armorProps(ModArmorMaterials.ETHERIUM, ArmorType.HELMET));
	public static final Item ETHERIUM_CHESTPLATE = register("etherium_chestplate", Item::new,
		armorProps(ModArmorMaterials.ETHERIUM, ArmorType.CHESTPLATE));
	public static final Item ETHERIUM_LEGGINGS = register("etherium_leggings", Item::new,
		armorProps(ModArmorMaterials.ETHERIUM, ArmorType.LEGGINGS));
	public static final Item ETHERIUM_BOOTS = register("etherium_boots", Item::new,
		armorProps(ModArmorMaterials.ETHERIUM, ArmorType.BOOTS));

	private static Item.Properties armorProps(net.minecraft.world.item.equipment.ArmorMaterial mat, ArmorType type) {
		return new Item.Properties()
			.humanoidArmor(mat, type)
			.repairable(mat.repairIngredient());
	}

	public static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
		Identifier id = WorldsExpansion.id(name);
		ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
		Item item = factory.apply(properties.setId(key));
		return Registry.register(BuiltInRegistries.ITEM, key, item);
	}

	public static void register() {
		WorldsExpansion.LOGGER.info("Registering items for {}", WorldsExpansion.MOD_ID);
	}
}
