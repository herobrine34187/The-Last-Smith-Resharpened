package cn.mmf.tls.se;

import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredHolder;

@EventBusSubscriber(modid = cn.mmf.tls.TheLastSmith.MODID)
public class UmaSpecial extends SpecialEffect {

    public int getSeLevel() {
        return seLevel;
    }

    private final int seLevel;
    public UmaSpecial(int seLevel, int requestLevel, boolean isCopiable, boolean isRemovable) {
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
        // TODO 马娘兼容
    }
}
