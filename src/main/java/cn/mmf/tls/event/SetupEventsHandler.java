package cn.mmf.tls.event;

<<<<<<< HEAD
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

// TODO: CauldronInteraction API changed in 1.21.1 - WATER.map is no longer public
// Need to use CauldronInteraction.addDefaultInteractions or similar
@EventBusSubscriber(modid = cn.mmf.tls.TheLastSmith.MODID)
public class SetupEventsHandler {
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        // TODO: Re-enable cauldron interactions when API is fixed
    }
=======
import cn.mmf.tls.item.ItemRegistry;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(bus = Bus.MOD)
public class SetupEventsHandler {
	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CauldronInteraction.WATER.put(ItemRegistry.BLADE_UNFINISHED_3.get(),
					coolItem(ItemRegistry.BLADE_UNFINISHED_3.get(), ItemRegistry.BLADE_UNFINISHED_4.get()));

			CauldronInteraction.WATER.put(ItemRegistry.BLADE_SAKURA_UNFINISHED_3.get(), coolItem(
					ItemRegistry.BLADE_SAKURA_UNFINISHED_3.get(), ItemRegistry.BLADE_SAKURA_UNFINISHED_4.get()));
		});
	}

	private static CauldronInteraction coolItem(Item input, Item output) {
		return (blockstate, level, pos, player, hand, itemStack) -> {
			if (itemStack.is(input)) {
				if (!level.isClientSide) {
					player.setItemInHand(hand, new ItemStack(output));
					player.awardStat(Stats.ITEM_CRAFTED.get(output));
					LayeredCauldronBlock.lowerFillLevel(blockstate, level, pos);
					player.playNotifySound(SoundEvents.FIRE_EXTINGUISH, SoundSource.PLAYERS, 0.9F, (1.0F + level.getRandom().nextFloat() * 0.2F) * 0.7F);
				}
				return InteractionResult.sidedSuccess(level.isClientSide);
			}
			return InteractionResult.PASS;
		};
	}
>>>>>>> upstream/1.21.1
}
