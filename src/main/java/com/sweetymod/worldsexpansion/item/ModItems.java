package com.sweetymod.worldsexpansion.item;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import com.sweetymod.worldsexpansion.item.custom.RubySwordItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

	// Materials
	public static final Item RUBY = registerItem("ruby",
		new Item(new FabricItemSettings()));
	public static final Item SAPPHIRE = registerItem("sapphire",
		new Item(new FabricItemSettings()));
	public static final Item RAW_ETHERIUM = registerItem("raw_etherium",
		new Item(new FabricItemSettings()));
	public static final Item ETHERIUM_INGOT = registerItem("etherium_ingot",
		new Item(new FabricItemSettings()));

	// Food
	public static final Item WORLD_APPLE = registerItem("world_apple",
		new Item(new FabricItemSettings().food(ModFoodComponents.WORLD_APPLE)));

	// Ruby Tools
	public static final Item RUBY_SWORD = registerItem("ruby_sword",
		new RubySwordItem(ModToolMaterials.RUBY, 4, -2.4f, new FabricItemSettings()));
	public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
		new PickaxeItem(ModToolMaterials.RUBY, 1, -2.8f, new FabricItemSettings()) {});
	public static final Item RUBY_AXE = registerItem("ruby_axe",
		new AxeItem(ModToolMaterials.RUBY, 6.0f, -3.1f, new FabricItemSettings()) {});
	public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
		new ShovelItem(ModToolMaterials.RUBY, 1.5f, -3.0f, new FabricItemSettings()) {});
	public static final Item RUBY_HOE = registerItem("ruby_hoe",
		new HoeItem(ModToolMaterials.RUBY, -2, -1.0f, new FabricItemSettings()) {});

	// Sapphire Tools
	public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
		new SwordItem(ModToolMaterials.SAPPHIRE, 4, -2.4f, new FabricItemSettings()));
	public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
		new PickaxeItem(ModToolMaterials.SAPPHIRE, 1, -2.8f, new FabricItemSettings()) {});
	public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
		new AxeItem(ModToolMaterials.SAPPHIRE, 6.0f, -3.1f, new FabricItemSettings()) {});
	public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
		new ShovelItem(ModToolMaterials.SAPPHIRE, 1.5f, -3.0f, new FabricItemSettings()) {});
	public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
		new HoeItem(ModToolMaterials.SAPPHIRE, -3, -1.0f, new FabricItemSettings()) {});

	// Etherium Tools
	public static final Item ETHERIUM_SWORD = registerItem("etherium_sword",
		new SwordItem(ModToolMaterials.ETHERIUM, 5, -2.4f, new FabricItemSettings()));
	public static final Item ETHERIUM_PICKAXE = registerItem("etherium_pickaxe",
		new PickaxeItem(ModToolMaterials.ETHERIUM, 1, -2.8f, new FabricItemSettings()) {});
	public static final Item ETHERIUM_AXE = registerItem("etherium_axe",
		new AxeItem(ModToolMaterials.ETHERIUM, 7.0f, -3.0f, new FabricItemSettings()) {});
	public static final Item ETHERIUM_SHOVEL = registerItem("etherium_shovel",
		new ShovelItem(ModToolMaterials.ETHERIUM, 2.0f, -3.0f, new FabricItemSettings()) {});
	public static final Item ETHERIUM_HOE = registerItem("etherium_hoe",
		new HoeItem(ModToolMaterials.ETHERIUM, -3, -1.0f, new FabricItemSettings()) {});

	// Ruby Armor
	public static final Item RUBY_HELMET = registerItem("ruby_helmet",
		new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
	public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
		new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
	public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
		new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
	public static final Item RUBY_BOOTS = registerItem("ruby_boots",
		new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

	// Sapphire Armor
	public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
		new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
	public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
		new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
	public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
		new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
	public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
		new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

	// Etherium Armor
	public static final Item ETHERIUM_HELMET = registerItem("etherium_helmet",
		new ArmorItem(ModArmorMaterials.ETHERIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
	public static final Item ETHERIUM_CHESTPLATE = registerItem("etherium_chestplate",
		new ArmorItem(ModArmorMaterials.ETHERIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
	public static final Item ETHERIUM_LEGGINGS = registerItem("etherium_leggings",
		new ArmorItem(ModArmorMaterials.ETHERIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
	public static final Item ETHERIUM_BOOTS = registerItem("etherium_boots",
		new ArmorItem(ModArmorMaterials.ETHERIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(WorldsExpansion.MOD_ID, name), item);
	}

	public static void registerModItems() {
		WorldsExpansion.LOGGER.info("Registering items for " + WorldsExpansion.MOD_ID);
	}
}
