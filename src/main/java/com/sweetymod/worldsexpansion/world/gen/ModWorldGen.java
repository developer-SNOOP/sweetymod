package com.sweetymod.worldsexpansion.world.gen;

import com.sweetymod.worldsexpansion.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModWorldGen {
	public static void generateModWorldGen() {
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
			GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RUBY_ORE_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
			GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
			GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ETHERIUM_ORE_PLACED_KEY);
	}
}
