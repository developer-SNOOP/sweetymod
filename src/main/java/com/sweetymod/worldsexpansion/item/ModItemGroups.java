package com.sweetymod.worldsexpansion.item;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import com.sweetymod.worldsexpansion.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {

	public static final ResourceKey<CreativeModeTab> WORLDS_EXPANSION_KEY =
		ResourceKey.create(Registries.CREATIVE_MODE_TAB, WorldsExpansion.id("worldsexpansion"));

	public static final CreativeModeTab WORLDS_EXPANSION_GROUP = Registry.register(
		BuiltInRegistries.CREATIVE_MODE_TAB,
		WORLDS_EXPANSION_KEY,
		FabricCreativeModeTab.builder()
			.title(Component.translatable("itemgroup.worldsexpansion.worldsexpansion"))
			.icon(() -> new ItemStack(ModItems.RUBY))
			.displayItems((displayContext, entries) -> {
				// Materials
				entries.accept(ModItems.RUBY);
				entries.accept(ModItems.SAPPHIRE);
				entries.accept(ModItems.RAW_ETHERIUM);
				entries.accept(ModItems.ETHERIUM_INGOT);

				// Ores
				entries.accept(ModBlocks.RUBY_ORE);
				entries.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
				entries.accept(ModBlocks.SAPPHIRE_ORE);
				entries.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
				entries.accept(ModBlocks.ETHERIUM_ORE);
				entries.accept(ModBlocks.DEEPSLATE_ETHERIUM_ORE);

				// Storage blocks
				entries.accept(ModBlocks.RUBY_BLOCK);
				entries.accept(ModBlocks.SAPPHIRE_BLOCK);
				entries.accept(ModBlocks.ETHERIUM_BLOCK);
				entries.accept(ModBlocks.RAW_ETHERIUM_BLOCK);

				// Food
				entries.accept(ModItems.WORLD_APPLE);

				// Ruby tools & armor
				entries.accept(ModItems.RUBY_SWORD);
				entries.accept(ModItems.RUBY_PICKAXE);
				entries.accept(ModItems.RUBY_AXE);
				entries.accept(ModItems.RUBY_SHOVEL);
				entries.accept(ModItems.RUBY_HOE);
				entries.accept(ModItems.RUBY_HELMET);
				entries.accept(ModItems.RUBY_CHESTPLATE);
				entries.accept(ModItems.RUBY_LEGGINGS);
				entries.accept(ModItems.RUBY_BOOTS);

				// Sapphire tools & armor
				entries.accept(ModItems.SAPPHIRE_SWORD);
				entries.accept(ModItems.SAPPHIRE_PICKAXE);
				entries.accept(ModItems.SAPPHIRE_AXE);
				entries.accept(ModItems.SAPPHIRE_SHOVEL);
				entries.accept(ModItems.SAPPHIRE_HOE);
				entries.accept(ModItems.SAPPHIRE_HELMET);
				entries.accept(ModItems.SAPPHIRE_CHESTPLATE);
				entries.accept(ModItems.SAPPHIRE_LEGGINGS);
				entries.accept(ModItems.SAPPHIRE_BOOTS);

				// Etherium tools & armor
				entries.accept(ModItems.ETHERIUM_SWORD);
				entries.accept(ModItems.ETHERIUM_PICKAXE);
				entries.accept(ModItems.ETHERIUM_AXE);
				entries.accept(ModItems.ETHERIUM_SHOVEL);
				entries.accept(ModItems.ETHERIUM_HOE);
				entries.accept(ModItems.ETHERIUM_HELMET);
				entries.accept(ModItems.ETHERIUM_CHESTPLATE);
				entries.accept(ModItems.ETHERIUM_LEGGINGS);
				entries.accept(ModItems.ETHERIUM_BOOTS);
			})
			.build()
	);

	public static void register() {
		WorldsExpansion.LOGGER.info("Registering item groups for {}", WorldsExpansion.MOD_ID);
	}
}
