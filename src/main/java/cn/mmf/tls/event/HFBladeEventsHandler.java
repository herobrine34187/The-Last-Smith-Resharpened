package cn.mmf.tls.event;

// TODO: energyblade 1.21.1 version not available yet - re-enable when available
// import cn.mmf.energyblade.EmpowerSlashBladeEvent;
import cn.mmf.tls.TheLastSmith;
// import cn.mmf.tls.data.builtin.TLSSlashBladeRegistry;
// import mods.flammpfeil.slashblade.capability.slashblade.BladeStateAccess;
// import net.minecraft.Util;
// import net.neoforged.bus.api.SubscribeEvent;
// import net.neoforged.neoforge.common.NeoForge;


public enum HFBladeEventsHandler {
    INSTANCE;

    public void init() {
        // TODO: Re-enable when energyblade 1.21.1 is available
        // NeoForge.EVENT_BUS.register(this);
    }

    // TODO: Re-enable when energyblade 1.21.1 is available
    /*
    @SubscribeEvent
    public void onSlashBladeUpdate(EmpowerSlashBladeEvent event) {
        var state = event.getSlashBladeState();
        if(!state.getTranslationKey().equals(Util.makeDescriptionId("item", TLSSlashBladeRegistry.BUNSHI.location()))) {
            return;
        }
        var offTexture = TheLastSmith.prefix("model/named/rf_roukan/texture.png");
        var onTexture = TheLastSmith.prefix("model/named/rf_roukan/texture_on.png");
        if (event.isPowered()) {
            state.setTexture(onTexture);
            state.setBaseAttackModifier(13F);
        } else {
            state.setTexture(offTexture);
            state.setBaseAttackModifier(6F);
        }
    }
    */
}
