package com.sweetymod.worldsexpansion.world;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ModConfiguredFeatures {
	public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = create("ruby_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = create("sapphire_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> ETHERIUM_ORE_KEY = create("etherium_ore");

	private static ResourceKey<ConfiguredFeature<?, ?>> create(String path) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, WorldsExpansion.id(path));
	}
}
