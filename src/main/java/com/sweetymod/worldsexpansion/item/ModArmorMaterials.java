package com.sweetymod.worldsexpansion.item;

import com.sweetymod.worldsexpansion.util.ModTags;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;

public class ModArmorMaterials {

	public static final ArmorMaterial RUBY = new ArmorMaterial(
		30,                                          // base unit durability multiplier
		ArmorMaterials.makeDefense(3, 6, 8, 3, 11),  // boots/legs/chest/helmet/body
		14,                                          // enchantability
		SoundEvents.ARMOR_EQUIP_IRON,                // equip sound
		1.5f,                                        // toughness
		0.05f,                                       // knockback resistance
		ModTags.Items.REPAIRS_RUBY_EQUIPMENT,
		ModEquipmentAssets.RUBY
	);

	public static final ArmorMaterial SAPPHIRE = new ArmorMaterial(
		38,
		ArmorMaterials.makeDefense(3, 7, 9, 3, 11),
		12,
		SoundEvents.ARMOR_EQUIP_DIAMOND,
		2.5f,
		0.1f,
		ModTags.Items.REPAIRS_SAPPHIRE_EQUIPMENT,
		ModEquipmentAssets.SAPPHIRE
	);

	public static final ArmorMaterial ETHERIUM = new ArmorMaterial(
		50,
		ArmorMaterials.makeDefense(4, 8, 10, 4, 13),
		20,
		SoundEvents.ARMOR_EQUIP_NETHERITE,
		3.5f,
		0.15f,
		ModTags.Items.REPAIRS_ETHERIUM_EQUIPMENT,
		ModEquipmentAssets.ETHERIUM
	);
}
