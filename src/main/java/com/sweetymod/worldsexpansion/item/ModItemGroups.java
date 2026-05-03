package com.sweetymod.worldsexpansion.item;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import com.sweetymod.worldsexpansion.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	public static final ItemGroup WORLDS_EXPANSION_GROUP = Registry.register(Registries.ITEM_GROUP,
		new Identifier(WorldsExpansion.MOD_ID, "worldsexpansion"),
		FabricItemGroup.builder()
			.icon(() -> new ItemStack(ModItems.ETHERIUM_INGOT))
			.displayName(Text.translatable("itemgroup.worldsexpansion.worldsexpansion"))
			.entries((displayContext, entries) -> {
				// Materials
				entries.add(ModItems.RUBY);
				entries.add(ModItems.SAPPHIRE);
				entries.add(ModItems.RAW_ETHERIUM);
				entries.add(ModItems.ETHERIUM_INGOT);

				// Food
				entries.add(ModItems.WORLD_APPLE);

				// Ores
				entries.add(ModBlocks.RUBY_ORE);
				entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
				entries.add(ModBlocks.SAPPHIRE_ORE);
				entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
				entries.add(ModBlocks.ETHERIUM_ORE);
				entries.add(ModBlocks.DEEPSLATE_ETHERIUM_ORE);

				// Storage Blocks
				entries.add(ModBlocks.RUBY_BLOCK);
				entries.add(ModBlocks.SAPPHIRE_BLOCK);
				entries.add(ModBlocks.ETHERIUM_BLOCK);
				entries.add(ModBlocks.RAW_ETHERIUM_BLOCK);

				// Tools
				entries.add(ModItems.RUBY_SWORD);
				entries.add(ModItems.RUBY_PICKAXE);
				entries.add(ModItems.RUBY_AXE);
				entries.add(ModItems.RUBY_SHOVEL);
				entries.add(ModItems.RUBY_HOE);

				entries.add(ModItems.SAPPHIRE_SWORD);
				entries.add(ModItems.SAPPHIRE_PICKAXE);
				entries.add(ModItems.SAPPHIRE_AXE);
				entries.add(ModItems.SAPPHIRE_SHOVEL);
				entries.add(ModItems.SAPPHIRE_HOE);

				entries.add(ModItems.ETHERIUM_SWORD);
				entries.add(ModItems.ETHERIUM_PICKAXE);
				entries.add(ModItems.ETHERIUM_AXE);
				entries.add(ModItems.ETHERIUM_SHOVEL);
				entries.add(ModItems.ETHERIUM_HOE);

				// Armor
				entries.add(ModItems.RUBY_HELMET);
				entries.add(ModItems.RUBY_CHESTPLATE);
				entries.add(ModItems.RUBY_LEGGINGS);
				entries.add(ModItems.RUBY_BOOTS);

				entries.add(ModItems.SAPPHIRE_HELMET);
				entries.add(ModItems.SAPPHIRE_CHESTPLATE);
				entries.add(ModItems.SAPPHIRE_LEGGINGS);
				entries.add(ModItems.SAPPHIRE_BOOTS);

				entries.add(ModItems.ETHERIUM_HELMET);
				entries.add(ModItems.ETHERIUM_CHESTPLATE);
				entries.add(ModItems.ETHERIUM_LEGGINGS);
				entries.add(ModItems.ETHERIUM_BOOTS);
			})
			.build());

	public static void registerItemGroups() {
		WorldsExpansion.LOGGER.info("Registering item groups for " + WorldsExpansion.MOD_ID);
	}
}
