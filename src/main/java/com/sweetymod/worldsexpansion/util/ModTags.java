package com.sweetymod.worldsexpansion.util;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

	public static final class Items {
		public static final TagKey<Item> REPAIRS_RUBY_EQUIPMENT = create("repairs_ruby_equipment");
		public static final TagKey<Item> REPAIRS_SAPPHIRE_EQUIPMENT = create("repairs_sapphire_equipment");
		public static final TagKey<Item> REPAIRS_ETHERIUM_EQUIPMENT = create("repairs_etherium_equipment");

		private static TagKey<Item> create(String path) {
			return TagKey.create(Registries.ITEM, WorldsExpansion.id(path));
		}
	}

	public static final class Blocks {
		private Blocks() {}

		private static TagKey<Block> create(String path) {
			return TagKey.create(Registries.BLOCK, WorldsExpansion.id(path));
		}
	}
}
