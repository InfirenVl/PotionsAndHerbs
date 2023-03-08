package com.infiren.potionsherbs.init;

import com.infiren.potionsherbs.blocks.AconiteBlock;
import com.infiren.potionsherbs.utils.HerbsTab;
import com.infiren.potionsherbs.utils.Reference;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);

    public static final RegistryObject<AconiteBlock> ACONITE_FLOWER_BLOCK = BLOCKS.register("aconite_flower",AconiteBlock::new);
    public static void registerBlocks() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
    @SubscribeEvent
    public static void onItemBlockRegistry(RegistryEvent.Register<Item> event) {
        BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> !(block instanceof INonItem))
                .forEach(block -> event.getRegistry().register(new BlockItem(block, new Item.Properties()
                        .group(HerbsTab.HERBS_TAB)).setRegistryName(block.getRegistryName())));
    }
}
