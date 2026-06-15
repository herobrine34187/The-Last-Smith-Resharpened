package cn.mmf.tls.data.builtin;

import java.util.List;

<<<<<<< HEAD
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import org.apache.commons.compress.utils.Lists;

// TODO: energyblade 1.21.1 not available
// import cn.mmf.energyblade.Energyblade;
// TODO: slashblade_addon 1.21.1 not available
// import cn.mmf.slashblade_addon.SlashBladeAddon;
=======
import org.apache.commons.compress.utils.Lists;

import cn.mmf.energyblade.Energyblade;
import cn.mmf.slashblade_addon.SlashBladeAddon;
>>>>>>> upstream/1.21.1
import cn.mmf.tls.TheLastSmith;
import cn.mmf.tls.se.TLSSpecialEffectRegistry;
import cn.mmf.tls.slasharts.TLSSlashArtsRegistry;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.client.renderer.CarryType;
import mods.flammpfeil.slashblade.item.SwordType;
import mods.flammpfeil.slashblade.registry.SlashArtsRegistry;
import mods.flammpfeil.slashblade.registry.SpecialEffectsRegistry;
import mods.flammpfeil.slashblade.registry.slashblade.EnchantmentDefinition;
import mods.flammpfeil.slashblade.registry.slashblade.PropertiesDefinition;
import mods.flammpfeil.slashblade.registry.slashblade.RenderDefinition;
import mods.flammpfeil.slashblade.registry.slashblade.SlashBladeDefinition;
<<<<<<< HEAD
import net.minecraft.data.worldgen.BootstrapContext;
=======
import net.minecraft.data.worldgen.BootstapContext;
>>>>>>> upstream/1.21.1
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
<<<<<<< HEAD
// TODO: blades_derby 1.21.1 not available
// import net.tracen.blades_derby.se.SpecialEffectRegistry;
import net.neoforged.fml.ModList;

public class TLSSlashBladeRegistry {
    //    楼观剑
    public static final ResourceKey<SlashBladeDefinition> ROUKANKEN = register("roukanken");
    //    白楼剑
    public static final ResourceKey<SlashBladeDefinition> HAKUROUKEN = register("hakurouken");

    //    对应的狱界剑
    public static final ResourceKey<SlashBladeDefinition> ROUKANKEN_NETHER = register("roukanken_nether");
    public static final ResourceKey<SlashBladeDefinition> HAKUROUKEN_NETHER = register("hakurouken_nether");

    //    天云剑
//    速风
    public static final ResourceKey<SlashBladeDefinition> AMAGUMO_KAZE = register("amagumo_kaze");
    //    残云
    public static final ResourceKey<SlashBladeDefinition> AMAGUMO_KUMO = register("amagumo_kumo");
    //    无念
    public static final ResourceKey<SlashBladeDefinition> AMAGUMO_MUNIN = register("amagumo_munin");

    //    无名大太刀
    public static final ResourceKey<SlashBladeDefinition> NAMELESS_ODACHI = register("nameless_odachi");
    //    神乐村正
    public static final ResourceKey<SlashBladeDefinition> MURAMASA_KAGURA = register("muramasa_kagura");

    //    驱魔刃
//    樱
    public static final ResourceKey<SlashBladeDefinition> EXORCISM_SAKURA = register("exorcism_sakura");
    //    杏
    public static final ResourceKey<SlashBladeDefinition> EXORCISM_GINKGO = register("exorcism_ginkgo");
    //    雪影
    public static final ResourceKey<SlashBladeDefinition> EXORCISM_YUKI = register("exorcism_yuki");

    //    邪魔刃
//    双
    public static final ResourceKey<SlashBladeDefinition> EVIL_KATAWARE = register("evil_kataware");
    //    修罗
    public static final ResourceKey<SlashBladeDefinition> EVIL_SHURA = register("evil_shura");

    //    文始，未完成
    public static final ResourceKey<SlashBladeDefinition> BUNSHI = registerEnergyBlade("bunshi");
    //    樱剪
    public static final ResourceKey<SlashBladeDefinition> SAKURAGIRI = register("sakuragiri");

    //    阎魔刀
    public static final ResourceKey<SlashBladeDefinition> YAMATO = register("yamato_neo");
    //    胧村正
    public static final ResourceKey<SlashBladeDefinition> OBORO_MURAMASA = register("oboro_muramasa");

    //    楔丸
    public static final ResourceKey<SlashBladeDefinition> KUSABIMARU = register("kusabimaru");
    //    不死斩
    public static final ResourceKey<SlashBladeDefinition> FUSHIGIRI = register("fushigiri");

    //    永贞
    public static final ResourceKey<SlashBladeDefinition> NAGASADA = register("nagasada");

    //    竹光
    //    上品竹光
    public static final ResourceKey<SlashBladeDefinition> BAMBOO_TOP = register("bamboo_top");
    //    隐者竹光
    public static final ResourceKey<SlashBladeDefinition> BAMBOO_HERMIT = register("bamboo_hermit");
    //    上品银纸竹光
    public static final ResourceKey<SlashBladeDefinition> SILVERBAMBOO_TOP = register("silverbamboo_top");
    //    金纸竹光
    public static final ResourceKey<SlashBladeDefinition> GOLDENBAMBOO = register("goldenbamboo");
    //    血纸竹光
    public static final ResourceKey<SlashBladeDefinition> SILVERBAMBOO_BLOOD = register("silverbamboo_blood");

    //    将军木
    public static final ResourceKey<SlashBladeDefinition> SAGEQUOIA = register("sagequoia");

    //    鞘付武器
    public static final ResourceKey<SlashBladeDefinition> SWEAPON = register("sweapon");
    //    初代拔刀剑？
    public static final ResourceKey<SlashBladeDefinition> SLASHBLADE = register("slashblade");

    //    伊布之刃
    public static final ResourceKey<SlashBladeDefinition> EIEVUI = register("eievui");

    //    SJAP联动武器，暂未找到译名
    public static final ResourceKey<SlashBladeDefinition> NIHILBX = registerSJAP("nihilbx");
    public static final ResourceKey<SlashBladeDefinition> NIHILUL = registerSJAP("nihilul");
    public static final ResourceKey<SlashBladeDefinition> CRIMSONCHERRY = registerSJAP("crimsoncherry");

    //    马娘拔刀剑联动武器 (依赖: net.tracen.blades_derby 模组)
//    2026-06-13:17-40: 独立为 blades_derby 联动命名空间
//    天云「无光」速子
    public static final ResourceKey<SlashBladeDefinition> UMA_TACHYON = registerDerby("uma_tachyon");
    //    数码「马娘狂热」
    public static final ResourceKey<SlashBladeDefinition> UMA_DIGITAL = registerDerby("uma_digital");
    //    茶座「漆黑高楼」
    public static final ResourceKey<SlashBladeDefinition> UMA_CAFE = registerDerby("uma_cafe");
    //    米浴「追猎者」
    public static final ResourceKey<SlashBladeDefinition> UMA_RICE_SHOWER = registerDerby("uma_rice_shower");

    public static void registerAll(BootstrapContext<SlashBladeDefinition> bootstrap) {

        bootstrap.register(EIEVUI,
=======
import net.minecraftforge.registries.ForgeRegistries;
import net.tracen.blades_derby.se.SpecialEffectRegistry;

public class TLSSlashBladeRegistry {
    public static final ResourceKey<SlashBladeDefinition> ROUKANKEN = register("roukanken");
    public static final ResourceKey<SlashBladeDefinition> HAKUROUKEN = register("hakurouken");

    public static final ResourceKey<SlashBladeDefinition> ROUKANKEN_NETHER = register("roukanken_nether");
    public static final ResourceKey<SlashBladeDefinition> HAKUROUKEN_NETHER = register("hakurouken_nether");
    
    public static final ResourceKey<SlashBladeDefinition> AMAGUMO_KAZE = register("amagumo_kaze");
    public static final ResourceKey<SlashBladeDefinition> AMAGUMO_KUMO = register("amagumo_kumo");
    public static final ResourceKey<SlashBladeDefinition> AMAGUMO_MUNIN = register("amagumo_munin");
    
    public static final ResourceKey<SlashBladeDefinition> NAMELESS_ODACHI = register("nameless_odachi");
    public static final ResourceKey<SlashBladeDefinition> MURAMASA_KAGURA = register("muramasa_kagura");
    
    public static final ResourceKey<SlashBladeDefinition> EXORCISM_SAKURA = register("exorcism_sakura");
    public static final ResourceKey<SlashBladeDefinition> EXORCISM_GINKGO = register("exorcism_ginkgo");
    public static final ResourceKey<SlashBladeDefinition> EXORCISM_YUKI = register("exorcism_yuki");
    
    public static final ResourceKey<SlashBladeDefinition> EVIL_KATAWARE = register("evil_kataware");
    public static final ResourceKey<SlashBladeDefinition> EVIL_SHURA = register("evil_shura");
    
    public static final ResourceKey<SlashBladeDefinition> BUNSHI = register("bunshi");
    public static final ResourceKey<SlashBladeDefinition> SAKURAGIRI = register("sakuragiri");
    
    public static final ResourceKey<SlashBladeDefinition> YAMATO = register("yamato_neo");
    public static final ResourceKey<SlashBladeDefinition> OBORO_MURAMASA = register("oboro_muramasa");
    
    public static final ResourceKey<SlashBladeDefinition> KUSABIMARU = register("kusabimaru");
    public static final ResourceKey<SlashBladeDefinition> FUSHIGIRI = register("fushigiri");
    
    public static final ResourceKey<SlashBladeDefinition> NAGASADA = register("nagasada");
    
    public static final ResourceKey<SlashBladeDefinition> BAMBOO_TOP = register("bamboo_top");
    public static final ResourceKey<SlashBladeDefinition> BAMBOO_HERMIT = register("bamboo_hermit");
    public static final ResourceKey<SlashBladeDefinition> SILVERBAMBOO_TOP = register("silverbamboo_top");
    public static final ResourceKey<SlashBladeDefinition> GOLDENBAMBOO = register("goldenbamboo");
    public static final ResourceKey<SlashBladeDefinition> SILVERBAMBOO_BLOOD = register("silverbamboo_blood");
    
    public static final ResourceKey<SlashBladeDefinition> SAGEQUOIA = register("sagequoia");
    
    public static final ResourceKey<SlashBladeDefinition> SWEAPON = register("sweapon");
    public static final ResourceKey<SlashBladeDefinition> SLASHBLADE = register("slashblade");
    
    public static final ResourceKey<SlashBladeDefinition> EIEVUI = register("eievui");
    
    public static final ResourceKey<SlashBladeDefinition> NIHILBX = registerSJAP("nihilbx");
    public static final ResourceKey<SlashBladeDefinition> NIHILUL = registerSJAP("nihilul");
    public static final ResourceKey<SlashBladeDefinition> CRIMSONCHERRY = registerSJAP("crimsoncherry");
    
    public static final ResourceKey<SlashBladeDefinition> UMA_TACHYON = register("uma_tachyon");
    public static final ResourceKey<SlashBladeDefinition> UMA_DIGITAL = register("uma_digital");
    public static final ResourceKey<SlashBladeDefinition> UMA_CAFE = register("uma_cafe");
    public static final ResourceKey<SlashBladeDefinition> UMA_RICE_SHOWER = register("uma_rice_shower");
    
    public static void registerAll(BootstapContext<SlashBladeDefinition> bootstrap) {
    	
    	bootstrap.register(EIEVUI,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("eievui"),
                        RenderDefinition.Builder
                                .newInstance()
                                .standbyRenderType(CarryType.PSO2)
                                .textureName(TheLastSmith.prefix("model/named/eievui/texture.png"))
                                .modelName(TheLastSmith.prefix("model/named/eievui/model.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(5.0F).maxDamage(113)
                                .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(SWEAPON,
=======
                        .baseAttackModifier(5.0F).maxDamage(113)
                        .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(SWEAPON,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("sweapon"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/sweapon/texture.png"))
                                .modelName(TheLastSmith.prefix("model/sweapon/model.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .defaultSwordType(List.of(SwordType.SEALED))
                                .baseAttackModifier(4.0F).maxDamage(50)
                                .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(SLASHBLADE,
=======
                        .defaultSwordType(List.of(SwordType.SEALED))
                        .baseAttackModifier(4.0F).maxDamage(50)
                        .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(SLASHBLADE,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("slashblade"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(SlashBlade.prefix("model/named/yamato.png"))
                                .modelName(TheLastSmith.prefix("model/slashblade/model.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(4.0F).maxDamage(50)
                                .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(OBORO_MURAMASA,
=======
                        .baseAttackModifier(4.0F).maxDamage(50)
                        .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(OBORO_MURAMASA,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("oboro_muramasa"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/muramasa/texture_oboro.png"))
                                .modelName(TheLastSmith.prefix("model/named/smith/model.obj"))
                                .standbyRenderType(CarryType.PSO2)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(11.0F).maxDamage(70)
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                                .slashArtsType(SlashArtsRegistry.VOID_SLASH.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 1),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 2)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(SAGEQUOIA,
=======
                        .baseAttackModifier(11.0F).maxDamage(70)
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                        .slashArtsType(SlashArtsRegistry.VOID_SLASH.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 2), 
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 2)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(SAGEQUOIA,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("sagequoia"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/sagequoia/texture.png"))
                                .modelName(TheLastSmith.prefix("model/named/sagequoia/model.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(6.0F).maxDamage(113)
                                .slashArtsType(SlashArtsRegistry.WAVE_EDGE.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 3)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(BAMBOO_TOP,
=======
                        	.baseAttackModifier(6.0F).maxDamage(113)
                        	.slashArtsType(SlashArtsRegistry.WAVE_EDGE.getId())
                        	.defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 3),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3)),
                        TheLastSmith.prefix("slashblade")
                		));
    	
    	bootstrap.register(BAMBOO_TOP,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("bamboo_top"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/bamboolight/bamboo_top.png"))
                                .modelName(SlashBlade.prefix("model/blade.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(4.0F).maxDamage(70)
                                .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(BAMBOO_HERMIT,
=======
                        .baseAttackModifier(4.0F).maxDamage(70)
                        .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(BAMBOO_HERMIT,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("bamboo_hermit"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/bamboolight/bamboo_top.png"))
                                .modelName(SlashBlade.prefix("model/named/yamato.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(6.0F).maxDamage(75)
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SlashArtsRegistry.VOID_SLASH.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 1),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 2)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(SILVERBAMBOO_TOP,
=======
                        .baseAttackModifier(6.0F).maxDamage(75)
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.VOID_SLASH.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 2), 
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 2)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(SILVERBAMBOO_TOP,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("silverbamboo_top"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/bamboolight/silverbamboo_top.png"))
                                .modelName(SlashBlade.prefix("model/named/yamato.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(5.0F).maxDamage(70)
                                .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(GOLDENBAMBOO,
=======
                        .baseAttackModifier(5.0F).maxDamage(70)
                        .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(GOLDENBAMBOO,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("goldenbamboo"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/bamboolight/goldenbamboo.png"))
                                .modelName(SlashBlade.prefix("model/named/yamato.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(6.0F).maxDamage(33)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SOUL_SPEED), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 1),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 1),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 3)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(SILVERBAMBOO_BLOOD,
=======
                        .baseAttackModifier(6.0F).maxDamage(33)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SOUL_SPEED), 2),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 3)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(SILVERBAMBOO_BLOOD,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("silverbamboo_blood"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/bamboolight/silverbamboo_blood.png"))
                                .modelName(SlashBlade.prefix("model/named/yamato.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(5.0F).maxDamage(50)
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                                .slashArtsType(SlashArtsRegistry.CIRCLE_SLASH.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 1),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 1),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 2)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(NAGASADA,
=======
                        .baseAttackModifier(5.0F).maxDamage(50)
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                        .slashArtsType(SlashArtsRegistry.CIRCLE_SLASH.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 1), 
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 2)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
      	bootstrap.register(NAGASADA,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("nagasada"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/nagasada/texture.png"))
                                .modelName(TheLastSmith.prefix("model/nagasada/model.obj"))
                                .standbyRenderType(CarryType.DEFAULT)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(4.0F).maxDamage(100)
                                .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(KUSABIMARU,
=======
                        .baseAttackModifier(4.0F).maxDamage(100)
                        .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
      	bootstrap.register(KUSABIMARU,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("kusabimaru"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/sekiro/kusabimaru.png"))
                                .modelName(TheLastSmith.prefix("model/named/sekiro/kusabimaru.obj"))
                                .effectColor(0XEEC0C0C0)
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(5.0F).maxDamage(70)
                                .slashArtsType(TLSSlashArtsRegistry.IAI_CROSS.getId())
                                .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(FUSHIGIRI,
                new SlashBladeDefinition(TheLastSmith.prefix("fushigiri"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(TheLastSmith.prefix("model/named/sekiro/fushigiri.png"))
                                .modelName(TheLastSmith.prefix("model/named/sekiro/fushigiri.obj"))
                                .effectColor(0XFF8C0000)
                                .standbyRenderType(CarryType.NINJA)
                                .build(),
=======
                        .baseAttackModifier(5.0F).maxDamage(70)
                        .slashArtsType(TLSSlashArtsRegistry.IAI_CROSS.getId())
                        .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
        bootstrap.register(FUSHIGIRI,
                new SlashBladeDefinition(TheLastSmith.prefix("fushigiri"),
                        RenderDefinition.Builder.newInstance()
                        	.textureName(TheLastSmith.prefix("model/named/sekiro/fushigiri.png"))
                            .modelName(TheLastSmith.prefix("model/named/sekiro/fushigiri.obj"))
                            .effectColor(0XFF8C0000)
                            .standbyRenderType(CarryType.NINJA)
                            .build(),
>>>>>>> upstream/1.21.1
                        PropertiesDefinition.Builder.newInstance().baseAttackModifier(10.0F)
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .addSpecialEffect(TLSSpecialEffectRegistry.FUSHIGIRI_SE.getId())
                                .slashArtsType(TLSSlashArtsRegistry.FUSHIGIRI.getId())
                                .build(),
<<<<<<< HEAD
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 5),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 4)),
                        TheLastSmith.prefix("slashblade")
                ));
=======
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 2), 
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 4)),
                        TheLastSmith.prefix("slashblade")
                        ));
>>>>>>> upstream/1.21.1

        bootstrap.register(YAMATO,
                new SlashBladeDefinition(TheLastSmith.prefix("yamato_neo"),
                        RenderDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .textureName(TheLastSmith.prefix("model/named/yamato_neo/yamato_neo.png"))
                                .modelName(TheLastSmith.prefix("model/named/yamato_neo/yamato_neo.obj")).build(),
                        PropertiesDefinition.Builder.newInstance().baseAttackModifier(9.0F)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SOUL_SPEED), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 5),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.FEATHER_FALLING), 4)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(NAMELESS_ODACHI,
=======
                        	.textureName(TheLastSmith.prefix("model/named/yamato_neo/yamato_neo.png"))
                            .modelName(TheLastSmith.prefix("model/named/yamato_neo/yamato_neo.obj")).build(),
                        PropertiesDefinition.Builder.newInstance().baseAttackModifier(9.0F)
                        		.addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                        		.addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SOUL_SPEED), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FALL_PROTECTION), 4)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(NAMELESS_ODACHI,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("nameless_odachi"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/odachi/odachi.png"))
                                .modelName(TheLastSmith.prefix("model/named/odachi/model.obj"))
                                .standbyRenderType(CarryType.NINJA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(5.0F).maxDamage(70)
                                .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(MURAMASA_KAGURA,
=======
                        .baseAttackModifier(5.0F).maxDamage(70)
                        .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(MURAMASA_KAGURA,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("muramasa_kagura"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/odachi/murasama_kagura.png"))
                                .modelName(TheLastSmith.prefix("model/named/odachi/model.obj"))
                                .standbyRenderType(CarryType.PSO2)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(8.0F).maxDamage(70)
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SlashArtsRegistry.DRIVE_HORIZONTAL.getId())
                                .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(BUNSHI,
                new SlashBladeDefinition(
                        // TODO Energyblade.FORGE_ENERGY_BLACE.getId(),
                        TheLastSmith.prefix("bunshi"),
=======
                        .baseAttackModifier(8.0F).maxDamage(70)
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.DRIVE_HORIZONTAL.getId())
                        .build(),
                        Lists.newArrayList(),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(BUNSHI,
                new SlashBladeDefinition(
                		Energyblade.FORGE_ENERGY_BLADE.getId(),
                		TheLastSmith.prefix("bunshi"),
>>>>>>> upstream/1.21.1
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0xffb7c5)
                                .textureName(TheLastSmith.prefix("model/named/rf_roukan/texture.png"))
                                .modelName(TheLastSmith.prefix("model/named/rf_roukan/model.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(6.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(TLSSlashArtsRegistry.Transmigration_Slash.getId())
                                .build(),
                        List.of(
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SOUL_SPEED), 2)
                        ),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(SAKURAGIRI,
=======
                        .baseAttackModifier(6.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(TLSSlashArtsRegistry.Transmigration_Slash.getId())
                        .build(),
                        List.of(
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 2),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SOUL_SPEED), 2)
                        		),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(SAKURAGIRI,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("sakuragiri"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0xffb7c5)
                                .textureName(TheLastSmith.prefix("model/named/bot_roukan/texture.png"))
                                .modelName(TheLastSmith.prefix("model/named/bot_roukan/model.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(2.0F).maxDamage(70)

                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SlashArtsRegistry.DRIVE_VERTICAL.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 2)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(AMAGUMO_KAZE,
=======
                        .baseAttackModifier(2.0F).maxDamage(70)
                        
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.DRIVE_VERTICAL.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 2)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(AMAGUMO_KAZE,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("amagumo_kaze"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/smith/texture_wind.png"))
                                .modelName(TheLastSmith.prefix("model/named/smith/model.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(10.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTREME_SHARPNESS.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SlashArtsRegistry.SAKURA_END.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SOUL_SPEED), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.FEATHER_FALLING), 4)),
                        TheLastSmith.prefix("slashblade")
                ));
        bootstrap.register(AMAGUMO_KUMO,
=======
                        .baseAttackModifier(10.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTREME_SHARPNESS.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.SAKURA_END.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SOUL_SPEED), 2),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FALL_PROTECTION), 4)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	bootstrap.register(AMAGUMO_KUMO,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("amagumo_kumo"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/smith/texture_cloud.png"))
                                .modelName(SlashBlade.prefix("model/named/agito.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(10.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.BEWITCHED_POWER.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SlashArtsRegistry.WAVE_EDGE.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 1),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SWEEPING_EDGE), 1)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(AMAGUMO_MUNIN,
=======
                        .baseAttackModifier(10.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.BEWITCHED_POWER.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.WAVE_EDGE.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SWEEPING_EDGE), 1)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(AMAGUMO_MUNIN,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("amagumo_munin"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0xff1111)
                                .textureName(TheLastSmith.prefix("model/named/smith/texture_final.png"))
                                .modelName(TheLastSmith.prefix("model/named/smith/model.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(17.0F).maxDamage(100)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTREME_SHARPNESS.getId())
                                .addSpecialEffect(TLSSpecialEffectRegistry.BEWITCHED_POWER.getId())
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SMITE.getId())
                                .addSpecialEffect(SpecialEffectsRegistry.WITHER_EDGE.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SlashArtsRegistry.VOID_SLASH.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SOUL_SPEED), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 5),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.FEATHER_FALLING), 4),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SWEEPING_EDGE), 3)
                        ),
                        TheLastSmith.prefix("slashblade")
                ));
        // 2026-06-14:08-40: UMA collaboration weapons only registered when blades_derby is loaded
        if (ModList.get().isLoaded("blades_derby")) {

            bootstrap.register(UMA_TACHYON,
                    new SlashBladeDefinition(TheLastSmith.prefix("uma_tachyon"),
                            RenderDefinition.Builder
                                    .newInstance()
                                    //.effectColor(0xff1111)
                                    .textureName(TheLastSmith.prefix("model/named/uma/tachyon_blade.png"))
                                    .modelName(TheLastSmith.prefix("model/named/smith/model.obj")).build(),
                            PropertiesDefinition.Builder.newInstance()
                                    .baseAttackModifier(17.0F).maxDamage(100)
                                    .addSpecialEffect(TLSSpecialEffectRegistry.EXTREME_SHARPNESS.getId())
                                    .addSpecialEffect(TLSSpecialEffectRegistry.BEWITCHED_POWER.getId())
                                    .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SMITE.getId())
                                    // TODO: blades_derby 1.21.1 not available - .addSpecialEffect(SpecialEffectRegistry.UMA_SPECIAL.getId())
                                    .defaultSwordType(List.of(SwordType.BEWITCHED))
                                    .slashArtsType(SlashArtsRegistry.VOID_SLASH.getId())
                                    .build(),
                            List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 5),
                                    new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SOUL_SPEED), 2),
                                    new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 3),
                                    new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 5),
                                    new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.FEATHER_FALLING), 4),
                                    new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SWEEPING_EDGE), 3)
                            ),
                            TheLastSmith.prefix("slashblade")
                    ));

            bootstrap.register(UMA_RICE_SHOWER,
                    new SlashBladeDefinition(TheLastSmith.prefix("uma_rice_shower"),
                            RenderDefinition.Builder
                                    .newInstance()
                                    //.effectColor(0xffb7c5)
                                    .textureName(TheLastSmith.prefix("model/named/uma/rice_shower_blade.png"))
                                    .modelName(TheLastSmith.prefix("model/named/smith/model.obj"))
                                    .build(),
                            PropertiesDefinition.Builder.newInstance()
                                    .baseAttackModifier(5.0F).maxDamage(70)
                                    .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                                    // TODO: blades_derby 1.21.1 not available - .addSpecialEffect(SpecialEffectRegistry.UMA_SPECIAL.getId())
                                    .defaultSwordType(List.of(SwordType.BEWITCHED))
                                    .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                                    .build(),
                            List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 2)),
                            TheLastSmith.prefix("slashblade")
                    ));

            bootstrap.register(UMA_DIGITAL,
                    new SlashBladeDefinition(TheLastSmith.prefix("uma_digital"),
                            RenderDefinition.Builder
                                    .newInstance()
                                    .effectColor(0xffb7c5)
                                    .textureName(TheLastSmith.prefix("model/named/uma/digital_blade.png"))
                                    .modelName(SlashBlade.prefix("model/named/sange/sange.obj"))
                                    .build(),
                            PropertiesDefinition.Builder.newInstance()
                                    .baseAttackModifier(5.0F).maxDamage(70)
                                    .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                                    // TODO: blades_derby 1.21.1 not available - .addSpecialEffect(SpecialEffectRegistry.UMA_SPECIAL.getId())
                                    .defaultSwordType(List.of(SwordType.BEWITCHED))
                                    .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                                    .build(),
                            List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 2)),
                            TheLastSmith.prefix("slashblade")
                    ));

            bootstrap.register(UMA_CAFE,
                    new SlashBladeDefinition(TheLastSmith.prefix("uma_cafe"),
                            RenderDefinition.Builder
                                    .newInstance()
                                    //.effectColor(0xffb7c5)
                                    .textureName(TheLastSmith.prefix("model/named/uma/cafe_blade.png"))
                                    .modelName(SlashBlade.prefix("model/named/muramasa/muramasa.obj"))
                                    .build(),
                            PropertiesDefinition.Builder.newInstance()
                                    .baseAttackModifier(5.0F).maxDamage(70)
                                    .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                                    // TODO: blades_derby 1.21.1 not available - .addSpecialEffect(SpecialEffectRegistry.UMA_SPECIAL.getId())
                                    .defaultSwordType(List.of(SwordType.BEWITCHED))
                                    .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                                    .build(),
                            List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 2)),
                            TheLastSmith.prefix("slashblade")
                    ));
        }

        bootstrap.register(EXORCISM_SAKURA,
=======
                        .baseAttackModifier(17.0F).maxDamage(100)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTREME_SHARPNESS.getId())
                        .addSpecialEffect(TLSSpecialEffectRegistry.BEWITCHED_POWER.getId())
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SMITE.getId())
                        .addSpecialEffect(SpecialEffectsRegistry.WITHER_EDGE.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.VOID_SLASH.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SOUL_SPEED), 2),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FALL_PROTECTION), 4),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SWEEPING_EDGE), 3)
                        		),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(UMA_TACHYON,
                new SlashBladeDefinition(TheLastSmith.prefix("uma_tachyon"),
                        RenderDefinition.Builder
                                .newInstance()
                                //.effectColor(0xff1111)
                                .textureName(TheLastSmith.prefix("model/named/uma/tachyon_blade.png"))
                                .modelName(TheLastSmith.prefix("model/named/smith/model.obj")).build(),
                        PropertiesDefinition.Builder.newInstance()
                        .baseAttackModifier(17.0F).maxDamage(100)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTREME_SHARPNESS.getId())
                        .addSpecialEffect(TLSSpecialEffectRegistry.BEWITCHED_POWER.getId())
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SMITE.getId())
                        .addSpecialEffect(SpecialEffectRegistry.UMA_SPECIAL.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.VOID_SLASH.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SOUL_SPEED), 2),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FALL_PROTECTION), 4),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SWEEPING_EDGE), 3)
                        		),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(UMA_RICE_SHOWER,
                new SlashBladeDefinition(TheLastSmith.prefix("uma_rice_shower"),
                        RenderDefinition.Builder
                                .newInstance()
                                //.effectColor(0xffb7c5)
                                .textureName(TheLastSmith.prefix("model/named/uma/rice_shower_blade.png"))
                                .modelName(TheLastSmith.prefix("model/named/smith/model.obj"))
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                        .baseAttackModifier(5.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                        .addSpecialEffect(SpecialEffectRegistry.UMA_SPECIAL.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 2)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(UMA_DIGITAL,
                new SlashBladeDefinition(TheLastSmith.prefix("uma_digital"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0xffb7c5)
                                .textureName(TheLastSmith.prefix("model/named/uma/digital_blade.png"))
                                .modelName(SlashBlade.prefix("model/named/sange/sange.obj"))
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                        .baseAttackModifier(5.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                        .addSpecialEffect(SpecialEffectRegistry.UMA_SPECIAL.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 2)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(UMA_CAFE,
                new SlashBladeDefinition(TheLastSmith.prefix("uma_cafe"),
                        RenderDefinition.Builder
                                .newInstance()
                                //.effectColor(0xffb7c5)
                                .textureName(TheLastSmith.prefix("model/named/uma/cafe_blade.png"))
                                .modelName(SlashBlade.prefix("model/named/muramasa/muramasa.obj"))
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                        .baseAttackModifier(5.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                        .addSpecialEffect(SpecialEffectRegistry.UMA_SPECIAL.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 2)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(EXORCISM_SAKURA,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("exorcism_sakura"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0xffb7c5)
                                .textureName(TheLastSmith.prefix("model/named/sakura/texture.png"))
                                .modelName(TheLastSmith.prefix("model/named/sakura/model.obj"))
                                .standbyRenderType(CarryType.NINJA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(5.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 2)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(EXORCISM_GINKGO,
=======
                        .baseAttackModifier(5.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 2)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(EXORCISM_GINKGO,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("exorcism_ginkgo"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0xFFDD32)
                                .textureName(TheLastSmith.prefix("model/named/sakura/texture_1.png"))
                                .modelName(TheLastSmith.prefix("model/named/sakura/model.obj"))
                                .standbyRenderType(CarryType.NINJA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(5.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 2)),
                        TheLastSmith.prefix("slashblade")
                ));
        bootstrap.register(EXORCISM_YUKI,
=======
                        .baseAttackModifier(5.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 2)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	bootstrap.register(EXORCISM_YUKI,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("exorcism_yuki"),
                        RenderDefinition.Builder
                                .newInstance()
                                .textureName(TheLastSmith.prefix("model/named/sakura/texture_2.png"))
                                .modelName(TheLastSmith.prefix("model/named/sakura/model.obj"))
                                .standbyRenderType(CarryType.NINJA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(5.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 2)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(EVIL_KATAWARE,
=======
                        .baseAttackModifier(5.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(TLSSlashArtsRegistry.SAKURA_BLISTERING_SWORDS.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 2)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(EVIL_KATAWARE,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("evil_kataware"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0x990000)
                                .textureName(TheLastSmith.prefix("model/named/sakura/texture_3.png"))
                                .modelName(TheLastSmith.prefix("model/named/sakura/model.obj"))
                                .standbyRenderType(CarryType.NINJA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(6.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SlashArtsRegistry.CIRCLE_SLASH.getId())
                                .build(),
                        List.of(
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 1)
                        ),
                        TheLastSmith.prefix("slashblade")
                ));
        bootstrap.register(EVIL_SHURA,
=======
                        .baseAttackModifier(6.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.CIRCLE_SLASH.getId())
                        .build(),
                        List.of(
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 2),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 1)
                        		),
                        TheLastSmith.prefix("slashblade")
                        ));
    	bootstrap.register(EVIL_SHURA,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("evil_shura"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0x6B0000)
                                .textureName(TheLastSmith.prefix("model/named/sakura/texture_4.png"))
                                .modelName(TheLastSmith.prefix("model/named/sakura/model.obj"))
                                .standbyRenderType(CarryType.NINJA)
                                .build(),
<<<<<<< HEAD
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(8.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SlashArtsRegistry.WAVE_EDGE.getId())
                                .build(),
                        List.of(
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.LOOTING), 1)
                        ),
                        TheLastSmith.prefix("slashblade")
                ));


        bootstrap.register(ROUKANKEN,
=======
                            PropertiesDefinition.Builder.newInstance()
                            .baseAttackModifier(8.0F).maxDamage(70)
                            .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                            .defaultSwordType(List.of(SwordType.BEWITCHED))
                            .slashArtsType(SlashArtsRegistry.WAVE_EDGE.getId())
                            .build(),
                            List.of(
                            		new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 2),
                            		new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 2),
                            		new EnchantmentDefinition(getEnchantmentID(Enchantments.MOB_LOOTING), 1)
                            		),
                            TheLastSmith.prefix("slashblade")
                            ));
    	
    	
    	bootstrap.register(ROUKANKEN,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("roukanken"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0xffb7c5)
                                .textureName(TheLastSmith.prefix("model/named/roukan/texture.png"))
                                .modelName(TheLastSmith.prefix("model/named/roukan/model.obj"))
                                .standbyRenderType(CarryType.RNINJA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(11.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(TLSSlashArtsRegistry.Transmigration_Slash.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 3)),
                        TheLastSmith.prefix("slashblade")
                ));
        bootstrap.register(HAKUROUKEN,
=======
                        .baseAttackModifier(11.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(TLSSlashArtsRegistry.Transmigration_Slash.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	bootstrap.register(HAKUROUKEN,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("hakurouken"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0xF2F2F2)
                                .textureName(TheLastSmith.prefix("model/named/hakurou/texture.png"))
                                .modelName(TheLastSmith.prefix("model/named/hakurou/model.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(3.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SMITE.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SlashArtsRegistry.DRIVE_VERTICAL.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 3)),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(ROUKANKEN_NETHER,
=======
                        .baseAttackModifier(3.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SMITE.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.DRIVE_VERTICAL.getId())
                        .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 3)),
                        TheLastSmith.prefix("slashblade")
                        ));
    	
    	bootstrap.register(ROUKANKEN_NETHER,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("roukanken_nether"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0xffb7c5)
                                .textureName(TheLastSmith.prefix("model/named/roukan/texture_tx.png"))
                                .modelName(TheLastSmith.prefix("model/named/roukan/model.obj"))
                                .standbyRenderType(CarryType.RNINJA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(13.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTREME_SHARPNESS.getId())
                                .addSpecialEffect(SpecialEffectsRegistry.WITHER_EDGE.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(TLSSlashArtsRegistry.Transmigration_Slash.getId())
                                .build(),
                        List.of(
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 4),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.FIRE_ASPECT), 1)
                        ),
                        TheLastSmith.prefix("slashblade")
                ));
        bootstrap.register(HAKUROUKEN_NETHER,
=======
                        .baseAttackModifier(13.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTREME_SHARPNESS.getId())
                        .addSpecialEffect(SpecialEffectsRegistry.WITHER_EDGE.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(TLSSlashArtsRegistry.Transmigration_Slash.getId())
                        .build(),
                        List.of(
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 4),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 2),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 1)
                		),
                        TheLastSmith.prefix("slashblade")
                ));
    	bootstrap.register(HAKUROUKEN_NETHER,
>>>>>>> upstream/1.21.1
                new SlashBladeDefinition(TheLastSmith.prefix("hakurouken_nether"),
                        RenderDefinition.Builder
                                .newInstance()
                                .effectColor(0xF2F2F2)
                                .textureName(TheLastSmith.prefix("model/named/hakurou/texture_tx.png"))
                                .modelName(TheLastSmith.prefix("model/named/hakurou/model.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
<<<<<<< HEAD
                                .baseAttackModifier(4.0F).maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SMITE.getId())
                                .addSpecialEffect(SpecialEffectsRegistry.WITHER_EDGE.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SlashArtsRegistry.DRIVE_VERTICAL.getId())
                                .build(),
                        List.of(
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 4),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 1),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.FIRE_ASPECT), 1)
                        ),
                        TheLastSmith.prefix("slashblade")
                ));

        bootstrap.register(NIHILUL,
                new SlashBladeDefinition(TheLastSmith.prefix("nihilul"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(TheLastSmith.prefix("model/nihil/nihilul.png"))
                                .modelName(TheLastSmith.prefix("model/nihil/nihil.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(12.0F)
                                .maxDamage(70)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                                .slashArtsType(SlashArtsRegistry.WAVE_EDGE.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.BANE_OF_ARTHROPODS), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.FIRE_ASPECT), 2),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.LOOTING), 3))));

        bootstrap.register(CRIMSONCHERRY,
                new SlashBladeDefinition(TheLastSmith.prefix("crimsoncherry"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(TheLastSmith.prefix("model/nihil/crimsoncherry.png"))
                                .modelName(TheLastSmith.prefix("model/nihil/nihil.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(11.0F)
                                .maxDamage(65)
                                .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                                .slashArtsType(SlashArtsRegistry.SAKURA_END.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.BANE_OF_ARTHROPODS), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.FIRE_ASPECT), 2))));

        bootstrap.register(NIHILBX,
                new SlashBladeDefinition(TheLastSmith.prefix("nihilbx"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(TheLastSmith.prefix("model/nihil/nihil_bx.png"))
                                .modelName(TheLastSmith.prefix("model/nihil/nihil.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(14.0F)
                                .maxDamage(240)
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                                .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                                .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                                .addSpecialEffect(SpecialEffectsRegistry.WITHER_EDGE.getId())
                                .slashArtsType(SlashArtsRegistry.SAKURA_END.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.POWER), 3),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.SMITE), 5),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.BANE_OF_ARTHROPODS), 5),
                                new EnchantmentDefinition(getEnchantmentID(bootstrap, Enchantments.FIRE_ASPECT), 2))));
    }

    private static ResourceKey<SlashBladeDefinition> registerEnergyBlade(String id) {
        return ResourceKey.create(SlashBladeDefinition.REGISTRY_KEY,
                ResourceLocation.fromNamespaceAndPath("energy_blade", id));
    }

    private static Holder<Enchantment> getEnchantmentID(BootstrapContext<SlashBladeDefinition> bootstrap, ResourceKey<Enchantment> enchantment) {
        return bootstrap.lookup(Registries.ENCHANTMENT).getOrThrow(enchantment);
    }

=======
                        .baseAttackModifier(4.0F).maxDamage(70)
                        .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SMITE.getId())
                        .addSpecialEffect(SpecialEffectsRegistry.WITHER_EDGE.getId())
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.DRIVE_VERTICAL.getId())
                        .build(),
                        List.of(
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 4),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 2),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 1),
                        		new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 1)
                		),
                        TheLastSmith.prefix("slashblade")
                ));
    	
        bootstrap.register(NIHILUL,
            new SlashBladeDefinition(SlashBladeAddon.prefix("nihilul"),
                 RenderDefinition.Builder.newInstance()
                 .textureName(SlashBladeAddon.prefix("model/nihil/nihilul.png"))
                 .modelName(SlashBladeAddon.prefix("model/nihil/nihil.obj"))
                 .standbyRenderType(CarryType.KATANA)
                 .build(),
                 PropertiesDefinition.Builder.newInstance()
                 .baseAttackModifier(12.0F)
                 .maxDamage(70)
                 .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                 .slashArtsType(SlashArtsRegistry.WAVE_EDGE.getId())
                 .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                 List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 3),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 2),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 2),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.MOB_LOOTING), 3))));

         bootstrap.register(CRIMSONCHERRY,
            new SlashBladeDefinition(SlashBladeAddon.prefix("crimsoncherry"),
                 RenderDefinition.Builder.newInstance()
                 .textureName(SlashBladeAddon.prefix("model/nihil/crimsoncherry.png"))
                 .modelName(SlashBladeAddon.prefix("model/nihil/nihil.obj"))
                 .standbyRenderType(CarryType.KATANA)
                 .build(),
                 PropertiesDefinition.Builder.newInstance()
                 .baseAttackModifier(11.0F)
                 .maxDamage(65)
                 .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                 .slashArtsType(SlashArtsRegistry.SAKURA_END.getId())
                 .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                 List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 3),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 3),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 2))));

         bootstrap.register(NIHILBX,
            new SlashBladeDefinition(SlashBladeAddon.prefix("nihilbx"),
                 RenderDefinition.Builder.newInstance()
                 .textureName(SlashBladeAddon.prefix("model/nihil/nihil_bx.png"))
                 .modelName(SlashBladeAddon.prefix("model/nihil/nihil.obj"))
                 .standbyRenderType(CarryType.KATANA)
                 .build(),
                 PropertiesDefinition.Builder.newInstance()
                 .baseAttackModifier(14.0F)
                 .maxDamage(240)
                 .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_SHARPNESS.getId())
                 .addSpecialEffect(TLSSpecialEffectRegistry.SMITE_SE.getId())
                 .addSpecialEffect(TLSSpecialEffectRegistry.EXTRA_POWER.getId())
                 .addSpecialEffect(SpecialEffectsRegistry.WITHER_EDGE.getId())
                 .slashArtsType(SlashArtsRegistry.SAKURA_END.getId())
                 .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                 List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 3),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 5),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 5),
                         new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 2))));
	}
    
    private static ResourceLocation getEnchantmentID(Enchantment enchantment) {
        return ForgeRegistries.ENCHANTMENTS.getKey(enchantment);
    }
    
>>>>>>> upstream/1.21.1
    private static ResourceKey<SlashBladeDefinition> register(String id) {
        ResourceKey<SlashBladeDefinition> loc = ResourceKey.create(SlashBladeDefinition.REGISTRY_KEY,
                TheLastSmith.prefix(id));
        return loc;
    }
<<<<<<< HEAD

    private static ResourceKey<SlashBladeDefinition> registerSJAP(String id) {
        ResourceKey<SlashBladeDefinition> loc = ResourceKey.create(SlashBladeDefinition.REGISTRY_KEY,
                /*new ResourceLocation("slashblade_addon", id)*/
                ResourceLocation.fromNamespaceAndPath("slashblade_addon", id)
        );
        return loc;
    }

    // 2026-06-13:17-40: blades_derby 联动武器独立命名空间注册
    private static ResourceKey<SlashBladeDefinition> registerDerby(String id) {
        return ResourceKey.create(SlashBladeDefinition.REGISTRY_KEY,
                ResourceLocation.fromNamespaceAndPath("blades_derby", id));
    }
=======
    
    private static ResourceKey<SlashBladeDefinition> registerSJAP(String id) {
        ResourceKey<SlashBladeDefinition> loc = ResourceKey.create(SlashBladeDefinition.REGISTRY_KEY,
                new ResourceLocation("slashblade_addon", id));
        return loc;
    }
>>>>>>> upstream/1.21.1
}
