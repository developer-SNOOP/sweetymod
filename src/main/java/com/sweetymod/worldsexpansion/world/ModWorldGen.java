package com.sweetymod.worldsexpansion.world;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModWorldGen {
	public static void register() {
		WorldsExpansion.LOGGER.info("Registering world generation for {}", WorldsExpansion.MOD_ID);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
			GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.RUBY_ORE_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
			GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
			GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.ETHERIUM_ORE_PLACED_KEY);
	}
}
