package com.sweetymod.worldsexpansion.item;

import com.sweetymod.worldsexpansion.WorldsExpansion;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public class ModEquipmentAssets {
	public static final ResourceKey<EquipmentAsset> RUBY = create("ruby");
	public static final ResourceKey<EquipmentAsset> SAPPHIRE = create("sapphire");
	public static final ResourceKey<EquipmentAsset> ETHERIUM = create("etherium");

	private static ResourceKey<EquipmentAsset> create(String path) {
		return ResourceKey.create(EquipmentAssets.ROOT_ID, WorldsExpansion.id(path));
	}
}
