package com.sweetymod.worldsexpansion.world;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModPlacedFeatures {
	public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
	public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
	public static final RegistryKey<PlacedFeature> ETHERIUM_ORE_PLACED_KEY = registerKey("etherium_ore_placed");

	public static RegistryKey<PlacedFeature> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(WorldsExpansion.MOD_ID, name));
	}
}
