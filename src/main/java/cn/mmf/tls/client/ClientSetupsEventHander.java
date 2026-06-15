package cn.mmf.tls.client;

import cn.mmf.tls.client.screen.ResearchTableScreen;
import cn.mmf.tls.menus.ContainerRegistry;
<<<<<<< HEAD
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

@EventBusSubscriber(modid = cn.mmf.tls.TheLastSmith.MODID, value = Dist.CLIENT)
public class ClientSetupsEventHander {
    @SubscribeEvent
    public static void registerScreens(final RegisterMenuScreensEvent event) {
        event.register(ContainerRegistry.RESEARCH_TABLE.get(), ResearchTableScreen::new);
=======
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetupsEventHander {
    @SubscribeEvent
    public static void screenRegistry(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(ContainerRegistry.RESEARCH_TABLE.get(), ResearchTableScreen::new);
        });
>>>>>>> upstream/1.21.1
    }
}
