package cn.mmf.tls.se;

import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantments;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredHolder;

@EventBusSubscriber(modid = cn.mmf.tls.TheLastSmith.MODID)
public class FushigiriSE extends SpecialEffect {
    private final int seLevel;
    public FushigiriSE(int seLevel, int requestLevel, boolean isCopiable, boolean isRemovable) {
        super(requestLevel, isCopiable, isRemovable);
        this.seLevel = seLevel;
    }

    @SubscribeEvent
    public static void onDoingSlash(SlashBladeEvent.HitEvent event) {
        ISlashBladeState state = event.getSlashBladeState();

        setEffect(event, state, TLSSpecialEffectRegistry.SMITE_SE);
        setEffect(event, state, TLSSpecialEffectRegistry.EXTRA_SMITE);
        setEffect(event, state, TLSSpecialEffectRegistry.FUSHIGIRI_SE);
    }

    private static void setEffect(SlashBladeEvent.HitEvent event, ISlashBladeState state, DeferredHolder<SpecialEffect, FushigiriSE> se) {
        if(state.hasSpecialEffect(se.getId())) {
            if (!(event.getUser() instanceof Player)) {
                return;
            }

            Player player = (Player) event.getUser();

            int level = player.experienceLevel;

            if(SpecialEffect.isEffective(se.get(), level)) {
                LivingEntity target = event.getTarget();
                if(target.getType().is(EntityTypeTags.SENSITIVE_TO_SMITE)) {
                    target.hurt(player.damageSources().indirectMagic(player, target), 
                            event.getBlade().getEnchantmentLevel(player.level().registryAccess()
                                    .lookupOrThrow(net.minecraft.core.registries.Registries.ENCHANTMENT)
                                    .getOrThrow(Enchantments.SMITE)) * se.get().getSELevel() );
                }
            }
        }
    }

    public int getSELevel() {
        return seLevel;
    }

}
