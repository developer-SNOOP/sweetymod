package com.sweetymod.worldsexpansion.world;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
	public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = create("ruby_ore_placed");
	public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = create("sapphire_ore_placed");
	public static final ResourceKey<PlacedFeature> ETHERIUM_ORE_PLACED_KEY = create("etherium_ore_placed");

	private static ResourceKey<PlacedFeature> create(String path) {
		return ResourceKey.create(Registries.PLACED_FEATURE, WorldsExpansion.id(path));
	}
}
