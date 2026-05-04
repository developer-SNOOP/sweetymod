package com.sweetymod.worldsexpansion.client;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.fabricmc.api.ClientModInitializer;

public class WorldsExpansionClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		WorldsExpansion.LOGGER.info("[WORLDS: EXPANSION] Client initialized.");
	}
}
