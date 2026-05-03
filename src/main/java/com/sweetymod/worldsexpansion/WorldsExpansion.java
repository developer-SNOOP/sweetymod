package com.sweetymod.worldsexpansion;

import com.sweetymod.worldsexpansion.block.ModBlocks;
import com.sweetymod.worldsexpansion.item.ModItemGroups;
import com.sweetymod.worldsexpansion.item.ModItems;
import com.sweetymod.worldsexpansion.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldsExpansion implements ModInitializer {
	public static final String MOD_ID = "worldsexpansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[WORLDS: EXPANSION] Initializing...");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGen.generateModWorldGen();

		LOGGER.info("[WORLDS: EXPANSION] Loaded successfully.");
	}
}
