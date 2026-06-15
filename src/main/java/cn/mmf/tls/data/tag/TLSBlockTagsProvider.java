package cn.mmf.tls.data.tag;

import java.util.concurrent.CompletableFuture;

<<<<<<< HEAD
import org.jetbrains.annotations.NotNull;
=======
>>>>>>> upstream/1.21.1
import org.jetbrains.annotations.Nullable;

import cn.mmf.tls.TheLastSmith;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
<<<<<<< HEAD
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class TLSBlockTagsProvider extends BlockTagsProvider {

    public TLSBlockTagsProvider(PackOutput output, CompletableFuture<Provider> lookupProvider, 
            @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheLastSmith.MODID, existingFileHelper);

    }

    @Override
    protected void addTags(@NotNull Provider provider) {

    }
=======
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TLSBlockTagsProvider extends BlockTagsProvider {

	public TLSBlockTagsProvider(PackOutput output, CompletableFuture<Provider> lookupProvider, 
			@Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, TheLastSmith.MODID, existingFileHelper);
	
	}

	@Override
	protected void addTags(Provider provider) {
		
	}
>>>>>>> upstream/1.21.1

}
