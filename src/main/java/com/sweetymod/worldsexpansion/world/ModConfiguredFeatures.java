package com.sweetymod.worldsexpansion.world;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class ModConfiguredFeatures {
	public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ETHERIUM_ORE_KEY = registerKey("etherium_ore");

	public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(WorldsExpansion.MOD_ID, name));
	}
}
