package com.sweetymod.worldsexpansion.block;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

	// Overworld stone-tier ores
	public static final Block RUBY_ORE = registerBlock("ruby_ore",
		new ExperienceDroppingBlock(
			FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(3.0f, 3.0f).requiresTool(),
			UniformIntProvider.create(2, 5)));
	public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
		new ExperienceDroppingBlock(
			FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4.5f, 3.0f).requiresTool(),
			UniformIntProvider.create(2, 5)));

	public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
		new ExperienceDroppingBlock(
			FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(3.0f, 3.0f).requiresTool(),
			UniformIntProvider.create(2, 5)));
	public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
		new ExperienceDroppingBlock(
			FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4.5f, 3.0f).requiresTool(),
			UniformIntProvider.create(2, 5)));

	public static final Block ETHERIUM_ORE = registerBlock("etherium_ore",
		new ExperienceDroppingBlock(
			FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5f, 3.0f).requiresTool(),
			UniformIntProvider.create(4, 8)));
	public static final Block DEEPSLATE_ETHERIUM_ORE = registerBlock("deepslate_etherium_ore",
		new ExperienceDroppingBlock(
			FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(6.0f, 3.0f).requiresTool(),
			UniformIntProvider.create(4, 8)));

	// Storage blocks
	public static final Block RUBY_BLOCK = registerBlock("ruby_block",
		new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5.0f, 6.0f).requiresTool()));
	public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
		new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(5.0f, 6.0f).requiresTool()));
	public static final Block ETHERIUM_BLOCK = registerBlock("etherium_block",
		new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(6.0f, 8.0f).requiresTool()));
	public static final Block RAW_ETHERIUM_BLOCK = registerBlock("raw_etherium_block",
		new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).strength(5.0f, 6.0f).requiresTool()));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(WorldsExpansion.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, new Identifier(WorldsExpansion.MOD_ID, name),
			new BlockItem(block, new net.fabricmc.fabric.api.item.v1.FabricItemSettings()));
	}

	public static void registerModBlocks() {
		WorldsExpansion.LOGGER.info("Registering blocks for " + WorldsExpansion.MOD_ID);
	}
}
