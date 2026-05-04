package com.sweetymod.worldsexpansion.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class ModFoodProperties {

	public static final FoodProperties WORLD_APPLE_FOOD = new FoodProperties.Builder()
		.nutrition(6)
		.saturationModifier(0.8f)
		.alwaysEdible()
		.build();

	public static final Consumable WORLD_APPLE_CONSUMABLE = Consumables.defaultFood()
		.onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
			new MobEffectInstance(MobEffects.REGENERATION, 200, 1),
			new MobEffectInstance(MobEffects.SPEED, 600, 0)
		)))
		.build();
}
