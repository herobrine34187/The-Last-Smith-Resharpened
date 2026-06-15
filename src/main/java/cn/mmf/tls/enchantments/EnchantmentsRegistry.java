package cn.mmf.tls.enchantments;

import cn.mmf.tls.TheLastSmith;
<<<<<<< HEAD
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.Enchantment;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EnchantmentsRegistry {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(
            Registries.ENCHANTMENT,
            TheLastSmith.MODID);
    // TODO: Enchantment is final in 1.21.1 - cannot subclass.
    // Need to use Enchantment.definition() + DeferredRegister directly.
    // SpiritSlashEnchantment and SpiritAbsorptionEnchantment need complete rewrite.
    // public static final DeferredHolder<Enchantment, Enchantment> SPIRIT_SLASH = ENCHANTMENTS.register("spirit_slash", ...);
    // public static final DeferredHolder<Enchantment, Enchantment> SPIRIT_ABSORPTION = ENCHANTMENTS.register("spirit_absorption", ...);
=======
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentsRegistry {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(
    		ForgeRegistries.ENCHANTMENTS,
            TheLastSmith.MODID);
    public static final RegistryObject<Enchantment> SPIRIT_SLASH = ENCHANTMENTS.register("spirit_slash", SpiritSlashEnchantment::new);
    
    public static final RegistryObject<Enchantment> SPIRIT_ABSORPTION = ENCHANTMENTS.register("spirit_absorption", SpiritAbsorptionEnchantment::new);
>>>>>>> upstream/1.21.1
}
