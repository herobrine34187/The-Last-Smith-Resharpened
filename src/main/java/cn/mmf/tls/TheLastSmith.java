<<<<<<< HEAD
package cn.mmf.tls;
=======
 package cn.mmf.tls;
>>>>>>> upstream/1.21.1

import com.mojang.logging.LogUtils;

import cn.mmf.tls.block.BlockRegistry;
import cn.mmf.tls.combo.ComboStateRegistry;
import cn.mmf.tls.enchantments.EnchantmentsRegistry;
import cn.mmf.tls.event.HFBladeEventsHandler;
import cn.mmf.tls.item.ItemRegistry;
import cn.mmf.tls.menus.ContainerRegistry;
import cn.mmf.tls.recipe.RecipeSerializerRegistry;
import cn.mmf.tls.se.TLSSpecialEffectRegistry;
import cn.mmf.tls.slasharts.TLSSlashArtsRegistry;
import net.minecraft.resources.ResourceLocation;
<<<<<<< HEAD
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
=======
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
>>>>>>> upstream/1.21.1
import org.slf4j.Logger;

@Mod(TheLastSmith.MODID)
public class TheLastSmith {
<<<<<<< HEAD
    public static final String MODID = "last_smith";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation prefix(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    public TheLastSmith(IEventBus modEventBus) {
        ItemRegistry.ITEMS.register(modEventBus);
        BlockRegistry.BLOCKS.register(modEventBus);
        TLSCreativeGroup.CREATIVE_MODE_TABS.register(modEventBus);
        RecipeSerializerRegistry.RECIPE_TYPES.register(modEventBus);
        RecipeSerializerRegistry.RECIPE_SERIALIZER.register(modEventBus);
        ContainerRegistry.CONTAINER_TYPES.register(modEventBus);
        EnchantmentsRegistry.ENCHANTMENTS.register(modEventBus);
        ComboStateRegistry.COMBO_STATE.register(modEventBus);
        TLSSlashArtsRegistry.SLASH_ARTS.register(modEventBus);
        TLSSpecialEffectRegistry.SPECIAL_EFFECT.register(modEventBus);

        modEventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        if (ModList.get().isLoaded("energyblade")) {
        }
    }

    public static Logger getLogger() {
        return LOGGER;
    }
=======
	public static final String MODID = "last_smith";
	private static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation prefix(String path) {
        return new ResourceLocation(MODID, path);
    }

	public TheLastSmith() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemRegistry.ITEMS.register(modEventBus);
		BlockRegistry.BLOCKS.register(modEventBus);
		TLSCreativeGroup.CREATIVE_MODE_TABS.register(modEventBus);
		RecipeSerializerRegistry.RECIPE_TYPES.register(modEventBus);
		RecipeSerializerRegistry.RECIPE_SERIALIZER.register(modEventBus);
		ContainerRegistry.CONTAINER_TYPES.register(modEventBus);
		EnchantmentsRegistry.ENCHANTMENTS.register(modEventBus);
		ComboStateRegistry.COMBO_STATE.register(modEventBus);
		TLSSlashArtsRegistry.SLASH_ARTS.register(modEventBus);
		TLSSpecialEffectRegistry.SPECIAL_EFFECT.register(modEventBus);
		
		modEventBus.addListener(this::setup);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		if(ModList.get().isLoaded("energyblade")) {
			HFBladeEventsHandler.INSTANCE.init();
		}
	}

	public static Logger getLogger() {
		return LOGGER;
	}
>>>>>>> upstream/1.21.1

}
