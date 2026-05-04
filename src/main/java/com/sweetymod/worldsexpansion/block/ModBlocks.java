package com.sweetymod.worldsexpansion.block;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import com.sweetymod.worldsexpansion.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {

	// Ore blocks (drop XP when mined)
	public static final Block RUBY_ORE = registerBlock("ruby_ore",
		props -> new DropExperienceBlock(UniformInt.of(2, 5), props),
		BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
			.strength(3.0f, 3.0f)
			.requiresCorrectToolForDrops(),
		true);

	public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
		props -> new DropExperienceBlock(UniformInt.of(2, 5), props),
		BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)
			.strength(4.5f, 3.0f)
			.requiresCorrectToolForDrops(),
		true);

	public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
		props -> new DropExperienceBlock(UniformInt.of(3, 7), props),
		BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)
			.strength(3.5f, 3.0f)
			.requiresCorrectToolForDrops(),
		true);

	public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
		props -> new DropExperienceBlock(UniformInt.of(3, 7), props),
		BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)
			.strength(5.0f, 3.0f)
			.requiresCorrectToolForDrops(),
		true);

	public static final Block ETHERIUM_ORE = registerBlock("etherium_ore",
		props -> new DropExperienceBlock(UniformInt.of(5, 12), props),
		BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS)
			.strength(5.0f, 6.0f)
			.requiresCorrectToolForDrops(),
		true);

	public static final Block DEEPSLATE_ETHERIUM_ORE = registerBlock("deepslate_etherium_ore",
		props -> new DropExperienceBlock(UniformInt.of(5, 12), props),
		BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS)
			.strength(6.0f, 6.0f)
			.requiresCorrectToolForDrops(),
		true);

	// Storage blocks
	public static final Block RUBY_BLOCK = registerBlock("ruby_block",
		Block::new,
		BlockBehaviour.Properties.of()
			.strength(5.0f, 6.0f)
			.sound(SoundType.METAL)
			.requiresCorrectToolForDrops(),
		true);

	public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
		Block::new,
		BlockBehaviour.Properties.of()
			.strength(5.0f, 6.0f)
			.sound(SoundType.AMETHYST)
			.requiresCorrectToolForDrops(),
		true);

	public static final Block ETHERIUM_BLOCK = registerBlock("etherium_block",
		Block::new,
		BlockBehaviour.Properties.of()
			.strength(6.0f, 7.0f)
			.sound(SoundType.NETHERITE_BLOCK)
			.requiresCorrectToolForDrops(),
		true);

	public static final Block RAW_ETHERIUM_BLOCK = registerBlock("raw_etherium_block",
		Block::new,
		BlockBehaviour.Properties.of()
			.strength(5.0f, 6.0f)
			.sound(SoundType.STONE)
			.requiresCorrectToolForDrops(),
		true);

	private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory,
	                                    BlockBehaviour.Properties properties, boolean withItem) {
		Identifier id = WorldsExpansion.id(name);
		ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);
		Block block = factory.apply(properties.setId(blockKey));
		Block registered = Registry.register(BuiltInRegistries.BLOCK, blockKey, block);

		if (withItem) {
			ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id);
			Item.Properties itemProps = new Item.Properties().setId(itemKey).useBlockDescriptionPrefix();
			BlockItem blockItem = new BlockItem(registered, itemProps);
			Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
		}

		return registered;
	}

	public static void register() {
		WorldsExpansion.LOGGER.info("Registering blocks for {}", WorldsExpansion.MOD_ID);
	}
}
