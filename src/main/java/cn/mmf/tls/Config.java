package cn.mmf.tls;

<<<<<<< HEAD
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;
=======
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;
>>>>>>> upstream/1.21.1

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

<<<<<<< HEAD
@SuppressWarnings("removal")
@EventBusSubscriber(modid = TheLastSmith.MODID, bus = EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.ConfigValue<List<? extends String>> ITEM_STRINGS = BUILDER
            .comment("A list of items to log on common setup.")
            .defineListAllowEmpty("items", List.of("minecraft:iron_ingot"), Config::validateItemName);

    static final ModConfigSpec SPEC = BUILDER.build();

    public static Set<Item> items;

    private static boolean validateItemName(final Object obj) {
        return obj instanceof final String itemName
                && BuiltInRegistries.ITEM.containsKey(ResourceLocation.parse(itemName));
    }

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent event) {
        items = ITEM_STRINGS.get().stream()
                .map(itemName -> BuiltInRegistries.ITEM.get(ResourceLocation.parse(itemName)))
                .collect(Collectors.toSet());
    }
=======
// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = TheLastSmith.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
	private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

	// a list of strings that are treated as resource locations for items
	private static final ForgeConfigSpec.ConfigValue<List<? extends String>> ITEM_STRINGS = BUILDER
			.comment("A list of items to log on common setup.")
			.defineListAllowEmpty("items", List.of("minecraft:iron_ingot"), Config::validateItemName);

	static final ForgeConfigSpec SPEC = BUILDER.build();

	public static Set<Item> items;

	private static boolean validateItemName(final Object obj) {
		return obj instanceof final String itemName
				&& ForgeRegistries.ITEMS.containsKey(new ResourceLocation(itemName));
	}

	@SubscribeEvent
	public static void onLoad(final ModConfigEvent event) {

		// convert the list of strings into a set of items
		items = ITEM_STRINGS.get().stream()
				.map(itemName -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemName)))
				.collect(Collectors.toSet());
	}
>>>>>>> upstream/1.21.1
}
