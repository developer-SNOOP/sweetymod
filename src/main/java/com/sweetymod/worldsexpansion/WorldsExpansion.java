package com.sweetymod.worldsexpansion;

import com.sweetymod.worldsexpansion.block.ModBlocks;
import com.sweetymod.worldsexpansion.item.ModItemGroups;
import com.sweetymod.worldsexpansion.item.ModItems;
import com.sweetymod.worldsexpansion.world.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldsExpansion implements ModInitializer {
	public static final String MOD_ID = "worldsexpansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("[WORLDS: EXPANSION] Initializing for Minecraft 26.1.2...");

		ModItems.register();
		ModBlocks.register();
		ModItemGroups.register();
		ModWorldGen.register();

		LOGGER.info("[WORLDS: EXPANSION] Loaded successfully.");
	}
}
