package com.sweetymod.worldsexpansion.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
	public static final FoodComponent WORLD_APPLE = new FoodComponent.Builder()
		.hunger(6)
		.saturationModifier(0.8f)
		.alwaysEdible()
		.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0f)
		.statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0), 1.0f)
		.build();
}
