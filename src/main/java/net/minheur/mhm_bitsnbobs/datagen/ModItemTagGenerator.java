package net.minheur.mhm_bitsnbobs.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minheur.mhm_bitsnbobs.MhmBitsnbobs;
import net.minheur.mhm_bitsnbobs.item.ModItems;
import net.minheur.mhm_bitsnbobs.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MhmBitsnbobs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        // add armor here to make trimmable
                        ModItems.SAPPHIRE_HELMET.get(),
                        ModItems.SAPPHIRE_CHESTPLATE.get(),
                        ModItems.SAPPHIRE_LEGGINGS.get(),
                        ModItems.SAPPHIRE_BOOTS.get()
                );

        this.tag(ItemTags.MUSIC_DISCS)
                .add(
                        ModItems.BAR_BRAWL_MUSIC_DISC.get(),
                        ModItems.DARK_SOUL_MUSIC_DISC.get(),
                        ModItems.END_OF_THE_START_MUSIC_DISC.get()
                );

        this.tag(Tags.Items.INGOTS)
                .add(
                        ModItems.HARDENED_INGOT.get()
                );

        this.tag(ModTags.Items.BASEDISK)
                .add(
                        ModItems.BASE_OF_DISC.get()
                );
    }
}
