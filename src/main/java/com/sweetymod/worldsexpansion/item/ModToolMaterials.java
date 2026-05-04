package com.sweetymod.worldsexpansion.item;

import com.sweetymod.worldsexpansion.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {

	// Ruby — between iron and diamond, decent durability and damage
	public static final ToolMaterial RUBY = new ToolMaterial(
		BlockTags.INCORRECT_FOR_IRON_TOOL, // can mine same as iron
		950,                                // durability
		7.0f,                               // mining speed
		2.5f,                               // attack damage bonus
		18,                                 // enchantability
		ModTags.Items.REPAIRS_RUBY_EQUIPMENT
	);

	// Sapphire — diamond-tier
	public static final ToolMaterial SAPPHIRE = new ToolMaterial(
		BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
		1700,
		8.0f,
		3.0f,
		14,
		ModTags.Items.REPAIRS_SAPPHIRE_EQUIPMENT
	);

	// Etherium — beyond netherite, very durable, very strong
	public static final ToolMaterial ETHERIUM = new ToolMaterial(
		BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
		2400,
		10.0f,
		4.0f,
		22,
		ModTags.Items.REPAIRS_ETHERIUM_EQUIPMENT
	);
}
