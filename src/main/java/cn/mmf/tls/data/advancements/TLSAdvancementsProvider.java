package cn.mmf.tls.data.advancements;

<<<<<<< HEAD
import java.util.List;
import java.util.function.Consumer;

import cn.mmf.tls.TheLastSmith;
import cn.mmf.tls.item.ItemRegistry;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.advancement.SlashBladeItemPredicate;
import mods.flammpfeil.slashblade.recipe.RequestDefinition;
import mods.flammpfeil.slashblade.registry.SlashBladeItems;
import mods.flammpfeil.slashblade.registry.slashblade.SlashBladeDefinition;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.ItemSubPredicate;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
=======
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import cn.mmf.tls.TheLastSmith;
import cn.mmf.tls.block.BlockRegistry;
import cn.mmf.tls.data.builtin.TLSSlashBladeRegistry;
import cn.mmf.tls.data.tag.TLSItemTags;
import cn.mmf.tls.item.ItemRegistry;
import mods.flammpfeil.slashblade.advancement.SlashBladeItemPredicate;
import mods.flammpfeil.slashblade.data.builtin.SlashBladeBuiltInRegistry;
import mods.flammpfeil.slashblade.init.SBItems;
import mods.flammpfeil.slashblade.recipe.RequestDefinition;
import mods.flammpfeil.slashblade.registry.slashblade.SlashBladeDefinition;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
>>>>>>> upstream/1.21.1
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
<<<<<<< HEAD
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.data.AdvancementProvider.AdvancementGenerator;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static cn.mmf.tls.data.builtin.TLSSlashBladeRegistry.*;

/**
 * 2026-06-14:09-05 Complete advancement tree DataGen.
 * Uses a shared CompletableFuture&lt;HolderLookup.Provider&gt; that includes
 * blade registries, enabling proper ItemStack icons with NBT data.
 */
public class TLSAdvancementsProvider implements AdvancementGenerator {

    // 2026-06-14:09-10 Captured during generate() for use by icon helpers
    private Provider currentRegistries;

    @Override
    public void generate(Provider registries, Consumer<AdvancementHolder> saver,
                         ExistingFileHelper fileHelper) {
        this.currentRegistries = registries;
        var root = simple(saver, fileHelper, null, "root",
                ItemRegistry.SCROLL_WOOD_BASIC.get(),
                tl("root.title"), tl("root.desc"), AdvancementType.TASK,
                true, false, false, bg("textures/advancements/backgrounds.png"),
                c("has_wood", item(rl("slashblade", "slashblade_wood"))));

        var rt = simple(saver, fileHelper, root, "research_table",
                ItemRegistry.RESEARCH_TABLE.get(),
                tl("research_table.title"), tl("research_table.desc"),
                AdvancementType.TASK, true, false, false, null,
                c("has_table", item(tls("research_table"))));

        var blade = simple(saver, fileHelper, root, "blade",
                ItemRegistry.BLADE.get(),
                tl("blade.title"), tl("blade.desc"),
                AdvancementType.TASK, true, false, false, null,
                c("has_scroll", item(tls("blade"))));

        var bladeSakura = simple(saver, fileHelper, blade, "blade_sakura",
                ItemRegistry.BLADE_SAKURA.get(),
                tl("blade_sakura.title"), tl("blade_sakura.desc"),
                AdvancementType.TASK, true, false, false, null,
                c("has_blade", item(tls("blade_sakura"))));

        var scrolls = simple(saver, fileHelper, rt, "scrolls",
                ItemRegistry.SCROLL_BASIC.get(),
                tl("scrolls.title"), tl("scrolls.desc"),
                AdvancementType.TASK, false, false, false, null,
                c("has_table", tagPred(tls("scroll"))));

        var ssf = simple(saver, fileHelper, scrolls, "scrolls_sakura_full",
                ItemRegistry.SCROLL_SAKURA_FULL.get(),
                tl("scrolls_sakura_full.title"), tl("scrolls_sakura_full.desc"),
                AdvancementType.TASK, false, false, false, null,
                c("has_scroll", item(tls("scroll_sakura_full"))));

        var sn = simple(saver, fileHelper, scrolls, "scroll_named",
                ItemRegistry.SCROLL_NAMED.get(),
                tl("scroll_named.title"), tl("scroll_named.desc"),
                AdvancementType.TASK, false, false, false, null,
                c("has_scroll", item(tls("scroll_named"))));

        // Named blade advancements (icons via getBlade with fallback)
        var nag = bladeAdv(saver, fileHelper, bladeSakura, "nagasada",
                NAGASADA, tl("nagasada.title"), tl("nagasada.desc"),
                AdvancementType.TASK, false, tls("nagasada"));

        var odachi = simple(saver, fileHelper, blade, "odachi",
                ItemRegistry.SCROLL_ODACHI.get(),
                tl("odachi.title"), tl("odachi.desc"),
                AdvancementType.TASK, true, false, false, null,
                c("has_scroll", item(tls("scroll_odachi"))));

        var sb = multi(saver, fileHelper, ssf, "scroll_bamboo",
                BAMBOO_HERMIT, tl("scroll_bamboo.title"), tl("scroll_bamboo.desc"),
                AdvancementType.GOAL, false, List.of(List.of("bamboo_hermit", "bloody_bamboo")),
                c("bamboo_hermit", bladePred(tls("bamboo_hermit"))),
                c("bloody_bamboo", bladePred(tls("silverbamboo_blood"))));

        var sm = simple(saver, fileHelper, sn, "scroll_muramasa",
                ItemRegistry.SCROLL_MURAMASA.get(),
                tl("scroll_muramasa.title"), tl("scroll_muramasa.desc"),
                AdvancementType.TASK, false, false, false, null,
                c("has_scroll", item(tls("scroll_muramasa"))));

        var ex = multi(saver, fileHelper, nag, "exorcism_sakura",
                EXORCISM_SAKURA, tl("exorcism_sakura.title"), tl("exorcism_sakura.desc"),
                AdvancementType.TASK, false, List.of(List.of("sakura", "ginkgo", "yuki")),
                c("sakura", bladePred(tls("exorcism_sakura"))),
                c("ginkgo", bladePred(tls("exorcism_ginkgo"))),
                c("yuki", bladePred(tls("exorcism_yuki"))));

        var rh = multi(saver, fileHelper, ex, "roukan_hakurou",
                ROUKANKEN, tl("roukan_hakurou.title"), tl("roukan_hakurou.desc"),
                AdvancementType.GOAL, false, List.of(List.of("roukanken", "hakurouken")),
                c("roukanken", bladePred(tls("roukanken"))),
                c("hakurouken", bladePred(tls("hakurouken"))));

        var inf = bladeAdv(saver, fileHelper, rh, "inferno",
                ROUKANKEN_NETHER, tl("inferno.title"), tl("inferno.desc"),
                AdvancementType.CHALLENGE, false, tls("roukanken_nether"));

        bladeAdv(saver, fileHelper, inf, "bewitched",
                HAKUROUKEN_NETHER, tl("bewitched.title"), tl("bewitched.desc"),
                AdvancementType.CHALLENGE, false, tls("hakurouken_nether"));

        var met = bladeAdv(saver, fileHelper, sn, "meteorn",
                AMAGUMO_MUNIN, tl("meteorn.title"), tl("meteorn.desc"),
                AdvancementType.CHALLENGE, false, tls("amagumo_munin"));

        bladeAdv(saver, fileHelper, met, "yamato",
                YAMATO, tl("yamato.title"), tl("yamato.desc"),
                AdvancementType.GOAL, false, tls("yamato_neo"));

        bladeAdv(saver, fileHelper, nag, "munin",
                AMAGUMO_MUNIN, tl("munin.title"), tl("munin.desc"),
                AdvancementType.CHALLENGE, true, tls("amagumo_munin"));

        bladeAdv(saver, fileHelper, odachi, "fushigiri",
                FUSHIGIRI, tl("fushigiri.title"), tl("fushigiri.desc"),
                AdvancementType.GOAL, false, tls("fushigiri"));

        var om = bladeAdv(saver, fileHelper, sm, "oboro_muramasa",
                OBORO_MURAMASA, tl("oboro_muramasa.title"), tl("oboro_muramasa.desc"),
                AdvancementType.GOAL, false, tls("oboro_muramasa"));

        bladeAdv(saver, fileHelper, om, "sharpness",
                AMAGUMO_MUNIN, tl("sharpness.title"), tl("sharpness.desc"),
                AdvancementType.CHALLENGE, false, tls("amagumo_kaze"));

        bladeAdv(saver, fileHelper, ex, "shura",
                EVIL_SHURA, tl("shura.title"), tl("shura.desc"),
                AdvancementType.GOAL, false, tls("evil_shura"));

        bladeAdv(saver, fileHelper, sb, "sagequoia",
                SAGEQUOIA, tl("sagequoia.title"), tl("sagequoia.desc"),
                AdvancementType.GOAL, true, tls("sagequoia"));
    }

    // ─── Helpers ───

    private static ResourceLocation tls(String p) { return TheLastSmith.prefix(p); }
    private static ResourceLocation rl(String ns, String p) { return ResourceLocation.fromNamespaceAndPath(ns, p); }
    private static Component tl(String k) { return Component.translatable("advancement.last_smith." + k); }
    private static ResourceLocation bg(String p) { return tls(p); }

    /** Single-criterion advancement with simple item trigger */
    private AdvancementHolder simple(Consumer<AdvancementHolder> s, ExistingFileHelper fh,
            AdvancementHolder parent, String id, ItemLike icon,
            Component title, Component desc, AdvancementType type,
            boolean toast, boolean announce, boolean hidden, ResourceLocation bg,
            CriterionEntry c) {
        var b = Advancement.Builder.recipeAdvancement();
        if (parent != null) b.parent(parent);
        b.display(icon, title, desc, bg, type, toast, announce, hidden);
        b.addCriterion(c.name, c.trigger);
        b.requirements(AdvancementRequirements.Strategy.OR);
        return b.save(s, tls(id), fh);
    }

    /** Blade advancement with icon from registry (fallback to slashblade item) */
    private AdvancementHolder bladeAdv(Consumer<AdvancementHolder> s, ExistingFileHelper fh,
              AdvancementHolder parent, String id,
            ResourceKey<SlashBladeDefinition> key, Component title, Component desc,
            AdvancementType type, boolean hidden, ResourceLocation bladeName) {
        return simple(s, fh, parent, id, getIcon(key), title, desc, type,
                true, false, hidden, null,
                c("has_blade", bladePred(bladeName)));
    }

    /** Multi-criterion advancement with requirements list */
    private AdvancementHolder multi(Consumer<AdvancementHolder> s, ExistingFileHelper fh,
              AdvancementHolder parent, String id,
            ResourceKey<SlashBladeDefinition> key, Component title, Component desc,
            AdvancementType type, boolean hidden, List<List<String>> reqs,
            CriterionEntry... criteria) {
        var b = Advancement.Builder.recipeAdvancement().parent(parent);
        b.display(getIcon(key), title, desc, null, type, true, false, hidden);
        for (var c : criteria) b.addCriterion(c.name, c.trigger);
        b.requirements(new AdvancementRequirements(reqs));
        return b.save(s, tls(id), fh);
    }

    // ─── Item predicates ───

    private ItemPredicate item(ResourceLocation id) {
        var it = BuiltInRegistries.ITEM.get(id);
        return ItemPredicate.Builder.item().of(it).build();
    }

    private ItemPredicate tagPred(ResourceLocation tag) {
        return ItemPredicate.Builder.item().of(TagKey.create(Registries.ITEM, tag)).build();
    }

    @SuppressWarnings("unchecked")
    private ItemPredicate bladePred(ResourceLocation name) {
        var type = (ItemSubPredicate.Type<SlashBladeItemPredicate>)
                BuiltInRegistries.ITEM_SUB_PREDICATE_TYPE.get(SlashBlade.prefix("slashblade"));
        var req = RequestDefinition.Builder.newInstance().name(name).build();
        if (type != null) {
            return ItemPredicate.Builder.item().of(SlashBladeItems.SLASHBLADE.get())
                    .withSubPredicate(type, new SlashBladeItemPredicate(req)).build();
        }
        // Fallback: match any slashblade item
        return ItemPredicate.Builder.item().of(SlashBladeItems.SLASHBLADE.get()).build();
    }

    // ─── Icons ───

    /**
     * 2026-06-14:09-10: Uses generated registries to get proper blade ItemStack
     * with NBT data. Falls back to default SlashBlade on error.
     */
    private ItemLike getIcon(ResourceKey<SlashBladeDefinition> key) {
        try {
            return currentRegistries.lookupOrThrow(SlashBladeDefinition.REGISTRY_KEY)
                    .getOrThrow(key).value()
                    .getBlade(SlashBladeItems.SLASHBLADE.get(), currentRegistries)
                    .getItem();
        } catch (Exception e) {
            return SlashBladeItems.SLASHBLADE.get();
        }
    }

    // ─── Criterion helper ───

    private record CriterionEntry(String name,
            net.minecraft.advancements.Criterion<?> trigger) {}

    private static CriterionEntry c(String name, ItemPredicate pred) {
        return new CriterionEntry(name, InventoryChangeTrigger.TriggerInstance.hasItems(pred));
    }
=======
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.registries.DataPackRegistriesHooks;

public class TLSAdvancementsProvider extends ForgeAdvancementProvider {

	public TLSAdvancementsProvider(PackOutput output, CompletableFuture<Provider> registries,
			RegistrySetBuilder datapackEntriesBuilder,
			ExistingFileHelper existingFileHelper, List<AdvancementGenerator> subProviders) {
		super(output, registries.thenApply(r -> constructRegistries(r, datapackEntriesBuilder)), existingFileHelper, subProviders);
	}

    private static HolderLookup.Provider constructRegistries(HolderLookup.Provider original, RegistrySetBuilder datapackEntriesBuilder)
    {
        var builderKeys = new HashSet<>(datapackEntriesBuilder.getEntryKeys());
        DataPackRegistriesHooks.getDataPackRegistriesWithDimensions().filter(data -> !builderKeys.contains(data.key())).forEach(data -> datapackEntriesBuilder.add(data.key(), context -> {}));
        return datapackEntriesBuilder.buildPatch(RegistryAccess.fromRegistryOfRegistries(BuiltInRegistries.REGISTRY), original);
    }
	
	public static class TLSAdvancementsSubProvider implements AdvancementGenerator {

		@Override
		public void generate(Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
			Advancement root = Advancement.Builder.advancement().display(ItemRegistry.SCROLL_WOOD_BASIC.get(),
					Component.translatable("advancement.last_smith.root.title"),
					Component.translatable("advancement.last_smith.root.desc"),
					TheLastSmith.prefix("textures/advancements/backgrounds.png"), FrameType.TASK, true, false, false)
					.addCriterion("has_wood", has(SBItems.slashblade_wood))
					.save(saver, TheLastSmith.prefix("root"), existingFileHelper);
			Advancement research = Advancement.Builder.advancement().parent(root)
					.display(BlockRegistry.RESEARCH_TABLE.get(),
							Component.translatable("advancement.last_smith.research_table.title"),
							Component.translatable("advancement.last_smith.research_table.desc"),
							(ResourceLocation) null, FrameType.TASK, true, false, false)
					.addCriterion("has_table", has(BlockRegistry.RESEARCH_TABLE.get()))
					.save(saver, TheLastSmith.prefix("research_table"), existingFileHelper);
			Advancement scroll = Advancement.Builder.advancement().parent(research)
					.display(ItemRegistry.SCROLL_BASIC.get(),
							Component.translatable("advancement.last_smith.scrolls.title"),
							Component.translatable("advancement.last_smith.scrolls.desc"),
							(ResourceLocation) null, FrameType.TASK, false, false, false)
					.addCriterion("has_table", has(TLSItemTags.SCROLL))
					.save(saver, TheLastSmith.prefix("scrolls"), existingFileHelper);
			Advancement blade = Advancement.Builder.advancement().parent(root)
					.display(ItemRegistry.BLADE.get(),
							Component.translatable("advancement.last_smith.blade.title"),
							Component.translatable("advancement.last_smith.blade.desc"),
							(ResourceLocation) null, FrameType.TASK, true, false, false)
					.addCriterion("has_scroll", has(ItemRegistry.BLADE.get()))
					.save(saver, TheLastSmith.prefix("blade"), existingFileHelper);
			Advancement blade_sakura = Advancement.Builder.advancement().parent(blade)
					.display(ItemRegistry.BLADE_SAKURA.get(),
							Component.translatable("advancement.last_smith.blade_sakura.title"),
							Component.translatable("advancement.last_smith.blade_sakura.desc"),
							(ResourceLocation) null, FrameType.TASK, true, false, false)
					.addCriterion("has_blade", has(ItemRegistry.BLADE_SAKURA.get()))
					.save(saver, TheLastSmith.prefix("blade_sakura"), existingFileHelper);
			
			Advancement scroll_sakura_full = Advancement.Builder.advancement().parent(scroll)
					.display(ItemRegistry.SCROLL_SAKURA_FULL.get(),
							Component.translatable("advancement.last_smith.scrolls_sakura_full.title"),
							Component.translatable("advancement.last_smith.scrolls_sakura_full.desc"),
							(ResourceLocation) null, FrameType.TASK, true, false, false)
					.addCriterion("has_scroll", has(ItemRegistry.SCROLL_SAKURA_FULL.get()))
					.save(saver, TheLastSmith.prefix("scrolls_sakura_full"), existingFileHelper);
			
			Advancement scroll_named = Advancement.Builder.advancement().parent(scroll)
					.display(getBlade(registries, SlashBladeBuiltInRegistry.RUBY),
							Component.translatable("advancement.last_smith.scroll_named.title"),
							Component.translatable("advancement.last_smith.scroll_named.desc"),
							(ResourceLocation) null, FrameType.TASK, true, false, false)
					.addCriterion("has_scroll", has(ItemRegistry.SCROLL_NAMED.get()))
					.save(saver, TheLastSmith.prefix("scroll_named"), existingFileHelper);
			
			Advancement scroll_muramasa = Advancement.Builder.advancement().parent(scroll_named)
					.display(getBlade(registries, SlashBladeBuiltInRegistry.MURAMASA),
							Component.translatable("advancement.last_smith.scroll_muramasa.title"),
							Component.translatable("advancement.last_smith.scroll_muramasa.desc"),
							(ResourceLocation) null, FrameType.TASK, true, false, false)
					.addCriterion("has_scroll", has(ItemRegistry.SCROLL_MURAMASA.get()))
					.save(saver, TheLastSmith.prefix("scroll_muramasa"), existingFileHelper);
			
			Advancement oboro_muramasa = Advancement.Builder.advancement().parent(scroll_muramasa)
					.display(getBlade(registries, TLSSlashBladeRegistry.OBORO_MURAMASA),
							Component.translatable("advancement.last_smith.oboro_muramasa.title"),
							Component.translatable("advancement.last_smith.oboro_muramasa.desc"),
							(ResourceLocation) null, FrameType.GOAL, true, false, false)
					.addCriterion("has_blade", hasBlade(
							TLSSlashBladeRegistry.OBORO_MURAMASA.location()
							))
					.save(saver, TheLastSmith.prefix("oboro_muramasa"), existingFileHelper);
			
			Advancement meteorn = Advancement.Builder.advancement().parent(scroll_named)
					.display(getBlade(registries, SlashBladeBuiltInRegistry.SANGE),
							Component.translatable("advancement.last_smith.meteorn.title"),
							Component.translatable("advancement.last_smith.meteorn.desc"),
							(ResourceLocation) null, FrameType.CHALLENGE, true, false, false)
					.addCriterion("has_scroll", has(ItemRegistry.SCROLL_STAR.get()))
					.save(saver, TheLastSmith.prefix("meteorn"), existingFileHelper);
			
			Advancement.Builder.advancement().parent(meteorn)
					.display(getBlade(registries, TLSSlashBladeRegistry.YAMATO),
							Component.translatable("advancement.last_smith.yamato.title"),
							Component.translatable("advancement.last_smith.yamato.desc"),
							(ResourceLocation) null, FrameType.GOAL, true, false, false)
					.addCriterion("has_blade", hasBlade(TLSSlashBladeRegistry.YAMATO.location()))
					.save(saver, TheLastSmith.prefix("yamato"), existingFileHelper);
			
			Advancement.Builder.advancement().parent(oboro_muramasa)
					.display(getBlade(registries, TLSSlashBladeRegistry.AMAGUMO_KAZE),
							Component.translatable("advancement.last_smith.sharpness.title"),
							Component.translatable("advancement.last_smith.sharpness.desc"),
							(ResourceLocation) null, FrameType.CHALLENGE, true, true, false)
					.addCriterion("has_scroll", has(ItemRegistry.SCROLL_SHARPNESS.get()))
					.save(saver, TheLastSmith.prefix("sharpness"), existingFileHelper);

			Advancement scroll_bamboo = Advancement.Builder.advancement().parent(scroll_sakura_full)
					.display(getBlade(registries, TLSSlashBladeRegistry.BAMBOO_HERMIT),
							Component.translatable("advancement.last_smith.scroll_bamboo.title"),
							Component.translatable("advancement.last_smith.scroll_bamboo.desc"),
							(ResourceLocation) null, FrameType.GOAL, false, false, false)
					.requirements(RequirementsStrategy.OR)
					.addCriterion("bamboo_hermit", hasBlade(
							TLSSlashBladeRegistry.BAMBOO_HERMIT.location()
							))
					.addCriterion("bloody_bamboo", hasBlade(
							TLSSlashBladeRegistry.SILVERBAMBOO_BLOOD.location()
							))
					.save(saver, TheLastSmith.prefix("scroll_bamboo"), existingFileHelper);
			
			Advancement.Builder.advancement().parent(scroll_bamboo)
					.display(getBlade(registries, TLSSlashBladeRegistry.SAGEQUOIA),
							Component.translatable("advancement.last_smith.sagequoia.title"),
							Component.translatable("advancement.last_smith.sagequoia.desc"),
							(ResourceLocation) null, FrameType.GOAL, true, false, true)
					.addCriterion("has_blade", hasBlade(
							TLSSlashBladeRegistry.SAGEQUOIA.location()
							))
					.save(saver, TheLastSmith.prefix("sagequoia"), existingFileHelper);
			
			Advancement blade_nagasada = Advancement.Builder.advancement().parent(blade_sakura)
					.display(getBlade(registries, TLSSlashBladeRegistry.NAGASADA),
							Component.translatable("advancement.last_smith.nagasada.title"),
							Component.translatable("advancement.last_smith.nagasada.desc"),
							(ResourceLocation) null, FrameType.TASK, true, false, false)
					.addCriterion("has_blade", hasBlade(TLSSlashBladeRegistry.NAGASADA.location()))
					.save(saver, TheLastSmith.prefix("nagasada"), existingFileHelper);
			
			Advancement odachi = Advancement.Builder.advancement().parent(blade)
					.display(getBlade(registries, TLSSlashBladeRegistry.NAMELESS_ODACHI),
							Component.translatable("advancement.last_smith.odachi.title"),
							Component.translatable("advancement.last_smith.odachi.desc"),
							(ResourceLocation) null, FrameType.TASK, true, false, false)
					.addCriterion("has_blade", hasBlade(TLSSlashBladeRegistry.NAMELESS_ODACHI.location()))
					.save(saver, TheLastSmith.prefix("odachi"), existingFileHelper);
			
			Advancement.Builder.advancement().parent(odachi)
					.display(getBlade(registries, TLSSlashBladeRegistry.FUSHIGIRI),
							Component.translatable("advancement.last_smith.fushigiri.title"),
							Component.translatable("advancement.last_smith.fushigiri.desc"),
							(ResourceLocation) null, FrameType.GOAL, true, false, false)
					.addCriterion("has_blade", hasBlade(TLSSlashBladeRegistry.FUSHIGIRI.location()))
					.save(saver, TheLastSmith.prefix("fushigiri"), existingFileHelper);
			
			Advancement sakura_blade = Advancement.Builder.advancement().parent(blade_nagasada)
					.display(getBlade(registries, TLSSlashBladeRegistry.EXORCISM_SAKURA),
							Component.translatable("advancement.last_smith.exorcism_sakura.title"),
							Component.translatable("advancement.last_smith.exorcism_sakura.desc"),
							(ResourceLocation) null, FrameType.TASK, true, false, false)
					.requirements(RequirementsStrategy.OR)
					.addCriterion("exorcism_sakura", hasBlade(
							TLSSlashBladeRegistry.EXORCISM_SAKURA.location()
							))
					.addCriterion("exorcism_ginkgo", hasBlade(
							TLSSlashBladeRegistry.EXORCISM_GINKGO.location()
							))
					.addCriterion("exorcism_yuki", hasBlade(
							TLSSlashBladeRegistry.EXORCISM_YUKI.location()
							))
					.save(saver, TheLastSmith.prefix("exorcism_sakura"), existingFileHelper);
			
			Advancement.Builder.advancement().parent(sakura_blade)
					.display(getBlade(registries, TLSSlashBladeRegistry.EVIL_SHURA),
							Component.translatable("advancement.last_smith.shura.title"),
							Component.translatable("advancement.last_smith.shura.desc"),
							(ResourceLocation) null, FrameType.GOAL, true, false, false)
					.addCriterion("has_blade", hasBlade(TLSSlashBladeRegistry.EVIL_SHURA.location()))
					.save(saver, TheLastSmith.prefix("shura"), existingFileHelper);
			
			Advancement roukan_hakurou = Advancement.Builder.advancement().parent(sakura_blade)
					.display(getBlade(registries, TLSSlashBladeRegistry.ROUKANKEN),
							Component.translatable("advancement.last_smith.roukan_hakurou.title"),
							Component.translatable("advancement.last_smith.roukan_hakurou.desc"),
							(ResourceLocation) null, FrameType.GOAL, true, false, false)
					.requirements(RequirementsStrategy.OR)
					.addCriterion("roukanken", hasBlade(
							TLSSlashBladeRegistry.ROUKANKEN.location()
							))
					.addCriterion("hakurouken", hasBlade(
							TLSSlashBladeRegistry.HAKUROUKEN.location()
							))
					.save(saver, TheLastSmith.prefix("roukan_hakurou"), existingFileHelper);
			
			Advancement inferno = Advancement.Builder.advancement().parent(roukan_hakurou)
					.display(getBlade(registries, TLSSlashBladeRegistry.ROUKANKEN_NETHER),
							Component.translatable("advancement.last_smith.inferno.title"),
							Component.translatable("advancement.last_smith.inferno.desc"),
							(ResourceLocation) null, FrameType.CHALLENGE, true, false, false)
					.requirements(RequirementsStrategy.OR)
					.addCriterion("has_scroll", has(ItemRegistry.SCROLL_HEIL.get()))
					.save(saver, TheLastSmith.prefix("inferno"), existingFileHelper);
			
			Advancement.Builder.advancement().parent(inferno)
					.display(getBlade(registries, TLSSlashBladeRegistry.AMAGUMO_KUMO),
							Component.translatable("advancement.last_smith.bewitched.title"),
							Component.translatable("advancement.last_smith.bewitched.desc"),
							(ResourceLocation) null, FrameType.CHALLENGE, true, true, false)
					.addCriterion("has_scroll", has(ItemRegistry.SCROLL_BEWITCHED.get()))
					.save(saver, TheLastSmith.prefix("bewitched"), existingFileHelper);
			
			Advancement.Builder.advancement().parent(blade_nagasada)
					.display(getBlade(registries, TLSSlashBladeRegistry.AMAGUMO_MUNIN),
							Component.translatable("advancement.last_smith.munin.title"),
							Component.translatable("advancement.last_smith.munin.desc"),
							(ResourceLocation) null, FrameType.CHALLENGE, true, true, true)
					.addCriterion("has_blade", hasBlade(
							TLSSlashBladeRegistry.AMAGUMO_MUNIN.location()
							))
					.save(saver, TheLastSmith.prefix("munin"), existingFileHelper);
		}

	}
	
	protected static ItemStack getBlade(Provider registries, ResourceKey<SlashBladeDefinition> key) {
		return registries.lookup(SlashBladeDefinition.REGISTRY_KEY).get().get(key).orElseThrow().get().getBlade();
	}
	
	protected static InventoryChangeTrigger.TriggerInstance hasBlade(ResourceLocation... locs) {
		List<SlashBladeItemPredicate> list = new ArrayList<>();
		for(ResourceLocation loc : locs) {
			list.add(new SlashBladeItemPredicate(RequestDefinition.Builder.newInstance().name(loc).build()));
		}
		return inventoryTrigger( (ItemPredicate[]) list.toArray(new ItemPredicate[list.size()]) );
	}

	protected static InventoryChangeTrigger.TriggerInstance inventoryTrigger(ItemPredicate... predicates) {
		return new InventoryChangeTrigger.TriggerInstance(ContextAwarePredicate.ANY, MinMaxBounds.Ints.ANY,
				MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, predicates);
	}

	protected static InventoryChangeTrigger.TriggerInstance has(ItemLike item) {
		return inventoryTrigger(ItemPredicate.Builder.item().of(item).build());
	}

	protected static InventoryChangeTrigger.TriggerInstance has(TagKey<Item> tag) {
		return inventoryTrigger(ItemPredicate.Builder.item().of(tag).build());
	}

>>>>>>> upstream/1.21.1
}
