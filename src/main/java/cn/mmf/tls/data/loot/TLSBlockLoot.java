package cn.mmf.tls.data.loot;

<<<<<<< HEAD
import cn.mcmod_mmf.mmlib.data.loot.AbstartctBlockLoot;
import cn.mmf.tls.block.BlockRegistry;
import net.minecraft.core.HolderLookup;

public class TLSBlockLoot extends AbstartctBlockLoot {

	public TLSBlockLoot(HolderLookup.Provider provider) {
		super(provider);
=======
import java.util.Set;

import cn.mcmod_mmf.mmlib.data.loot.AbstartctBlockLoot;
import cn.mmf.tls.block.BlockRegistry;

public class TLSBlockLoot extends AbstartctBlockLoot {

	public TLSBlockLoot() {
		super(Set.of());
>>>>>>> upstream/1.21.1
	}

	@Override
	public void addTables() {
		dropSelf(BlockRegistry.RESEARCH_TABLE.get());
	}

}
