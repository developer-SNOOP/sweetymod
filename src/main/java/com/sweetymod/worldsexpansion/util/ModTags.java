package com.sweetymod.worldsexpansion.util;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
	public static class Blocks {
		public static final TagKey<Block> NEEDS_ETHERIUM_TOOL = createTag("needs_etherium_tool");

		private static TagKey<Block> createTag(String name) {
			return TagKey.of(RegistryKeys.BLOCK, new Identifier(WorldsExpansion.MOD_ID, name));
		}
	}
}
