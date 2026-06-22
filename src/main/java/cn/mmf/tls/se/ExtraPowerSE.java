package cn.mmf.tls.se;

import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantments;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredHolder;

@EventBusSubscriber(modid = cn.mmf.tls.TheLastSmith.MODID)
public class ExtraPowerSE extends SpecialEffect {
    private final int seLevel;
    public ExtraPowerSE(int seLevel, int requestLevel, boolean isCopiable, boolean isRemovable) {
        super(requestLevel, isCopiable, isRemovable);
        this.seLevel = seLevel;
    }

    @SubscribeEvent
    public static void onDoingSlash(SlashBladeEvent.DoSlashEvent event) {
        ISlashBladeState state = event.getSlashBladeState();

        setEffect(event, state, TLSSpecialEffectRegistry.EXTRA_POWER);
        setEffect(event, state, TLSSpecialEffectRegistry.BEWITCHED_POWER);
    }

    private static void setEffect(SlashBladeEvent.DoSlashEvent event, ISlashBladeState state, DeferredHolder<SpecialEffect, ExtraPowerSE> se) {
        if(state.hasSpecialEffect(se.getId())) {
            if (!(event.getUser() instanceof Player)) {
                return;
            }

            Player player = (Player) event.getUser();

            int level = player.experienceLevel;

            if(SpecialEffect.isEffective(se.get(), level)) {
                event.setDamage(event.getDamage() * 
                        1 + (event.getBlade().getEnchantmentLevel(player.level().registryAccess()
                                .lookupOrThrow(net.minecraft.core.registries.Registries.ENCHANTMENT)
                                .getOrThrow(Enchantments.POWER)) 
                                * se.get().getSELevel() * 0.1F));
            }
        }
    }

    public int getSELevel() {
        return seLevel;
    }

}
