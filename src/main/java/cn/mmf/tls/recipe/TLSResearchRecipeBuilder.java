package cn.mmf.tls.recipe;

<<<<<<< HEAD
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Nullable;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
=======
import java.util.function.Consumer;

import javax.annotation.Nullable;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
>>>>>>> upstream/1.21.1
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
<<<<<<< HEAD
import net.neoforged.neoforge.common.crafting.CompoundIngredient;
import org.jetbrains.annotations.NotNull;

public class TLSResearchRecipeBuilder implements RecipeBuilder {
    private final Ingredient blade;
    private Ingredient paper = Ingredient.of(Items.PAPER);
    private Ingredient ink = CompoundIngredient.of(
            Ingredient.of(Items.INK_SAC),
            Ingredient.of(Items.BLACK_DYE)
    );
    private final ItemStack result;
    private final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();

    public TLSResearchRecipeBuilder(Ingredient blade, ItemStack result) {
        this.blade = blade;
        this.result = result;
    }

    public static TLSResearchRecipeBuilder researching(Ingredient blade, Item result) {
        return new TLSResearchRecipeBuilder(blade, new ItemStack(result));
    }

    public static TLSResearchRecipeBuilder researching(Ingredient blade, ItemStack result) {
        return new TLSResearchRecipeBuilder(blade, result);
    }

    public TLSResearchRecipeBuilder paper(Ingredient paper) {
        this.paper = paper;
        return this;
    }

    public TLSResearchRecipeBuilder ink(Ingredient ink) {
        this.ink = ink;
        return this;
    }

    @Override
    public @NotNull TLSResearchRecipeBuilder unlockedBy(@NotNull String key, @NotNull Criterion<?> trigger) {
        this.criteria.put(key, trigger);
        return this;
    }

    @Override
    public @NotNull TLSResearchRecipeBuilder group(@Nullable String group) {
        return this;
    }

    @Override
    public @NotNull Item getResult() {
        return this.result.getItem();
    }

    @Override
    public void save(@NotNull RecipeOutput output) {
        ResourceLocation id = BuiltInRegistries.ITEM.getKey(this.result.getItem());
        this.save(output, id);
    }

    @Override
    public void save(RecipeOutput output, @NotNull ResourceLocation id) {
        this.ensureValid(id);
        Advancement.Builder advancementBuilder = output.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id))
                .requirements(AdvancementRequirements.Strategy.OR);
        this.criteria.forEach(advancementBuilder::addCriterion);

        TLSResearchRecipe recipe = new TLSResearchRecipe(this.result, this.blade, this.paper, this.ink);
        output.accept(id, recipe, advancementBuilder.build(
                id.withPrefix("recipes/research/")));
    }

    private void ensureValid(ResourceLocation id) {
        if (this.criteria.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + id);
        }
    }
=======
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

public class TLSResearchRecipeBuilder {

	private final Ingredient blade;
	private final Ingredient paper;
	private final Ingredient ink;
	private final RecipeCategory category;
	private final ItemStack result;
	private final Advancement.Builder advancement = Advancement.Builder.recipeAdvancement();
	private final RecipeSerializer<?> type;

	public TLSResearchRecipeBuilder(RecipeSerializer<?> serializer, Ingredient blade, Ingredient paper, Ingredient ink,
			RecipeCategory category, ItemStack result) {
		this.category = category;
		this.type = serializer;
		this.blade = blade;
		this.paper = paper;
		this.ink = ink;
		this.result = result;
	}

	public static TLSResearchRecipeBuilder researching(Ingredient blade, Ingredient paper, Ingredient ink,
			RecipeCategory category, ItemStack result) {
		return new TLSResearchRecipeBuilder(RecipeSerializerRegistry.RESEARCH_RECIPE_SERIALIZER.get(), blade, paper, ink, category,
				result);
	}
	
	public static TLSResearchRecipeBuilder researching(Ingredient blade, ItemStack result) {
		return researching(blade, 
				Ingredient.of(Items.PAPER), 
				Ingredient.of(Tags.Items.DYES_BLACK),  
				RecipeCategory.MISC,
				result);
	}
	
	public static TLSResearchRecipeBuilder researching(Ingredient blade, Item result) {
		return researching(blade, 
				Ingredient.of(Items.PAPER), 
				Ingredient.of(Tags.Items.DYES_BLACK),  
				RecipeCategory.MISC,
				result.getDefaultInstance());
	}

	public TLSResearchRecipeBuilder unlocks(String name, CriterionTriggerInstance trigger) {
		this.advancement.addCriterion(name, trigger);
		return this;
	}

	public void save(Consumer<FinishedRecipe> consumer, String name) {
		this.save(consumer, new ResourceLocation(name));
	}

	public void save(Consumer<FinishedRecipe> consumer, ResourceLocation id) {
		this.ensureValid(id);
		this.advancement.parent(RecipeBuilder.ROOT_RECIPE_ADVANCEMENT)
				.addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
				.rewards(AdvancementRewards.Builder.recipe(id)).requirements(RequirementsStrategy.OR);
		consumer.accept(new TLSResearchRecipeBuilder.Result(id, this.type, this.blade, this.paper, this.ink,
				this.result, this.advancement, id.withPrefix("recipes/" + this.category.getFolderName() + "/")));
	}

	private void ensureValid(ResourceLocation id) {
		if (this.advancement.getCriteria().isEmpty()) {
			throw new IllegalStateException("No way of obtaining recipe " + id);
		}
	}

	public static record Result(ResourceLocation id, RecipeSerializer<?> type, Ingredient blade, Ingredient paper,
			Ingredient ink, ItemStack result, Advancement.Builder advancement, ResourceLocation advancementId)
			implements FinishedRecipe {
		public void serializeRecipeData(JsonObject json) {
			json.add("blade", this.blade.toJson());
			json.add("paper", this.paper.toJson());
			json.add("ink", this.ink.toJson());
			JsonObject objectResult = new JsonObject();
			
			objectResult.addProperty("item", ForgeRegistries.ITEMS.getKey(this.result.getItem()).toString());
			if (result.getCount() > 1) {
				objectResult.addProperty("count", result.getCount());
			}
			if (result.hasTag()) {
				objectResult.add("nbt", JsonParser.parseString(result.getTag().toString()));
			}
			json.add("output", objectResult);
		}

		public ResourceLocation getId() {
			return this.id;
		}

		public RecipeSerializer<?> getType() {
			return this.type;
		}

		@Nullable
		public JsonObject serializeAdvancement() {
			return this.advancement.serializeToJson();
		}

		@Nullable
		public ResourceLocation getAdvancementId() {
			return this.advancementId;
		}
	}

>>>>>>> upstream/1.21.1
}
