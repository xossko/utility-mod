package com.xossko.utilitymod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;

@EventBusSubscriber(modid = "utilitymod")
public class DamageEventHandler {

    @SubscribeEvent
    public static void onLivingDamage(LivingDamageEvent event) {
        LivingEntity attacker = event.getSource().getEntity();
        
        if (attacker instanceof LivingEntity livingAttacker) {
            // Check if attacker has Strength effect
            if (livingAttacker.hasEffect(MobEffects.DAMAGE_BOOST)) {
                int strengthLevel = livingAttacker.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier();
                
                // Calculate damage multiplier: 30% per level (1 level = 1.3x damage)
                // Strength I (level 0) = 30% more damage = x1.3
                float damageMultiplier = 1.0f + (strengthLevel + 1) * 0.3f;
                
                // Apply the multiplier
                float originalDamage = event.getAmount();
                event.setAmount(originalDamage * damageMultiplier);
            }
        }
    }
}
