package com.infiren.potionsherbs.init;

import com.infiren.potionsherbs.items.HerbPotionItem;
import com.infiren.potionsherbs.utils.PotionsTab;
import com.infiren.potionsherbs.utils.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.PotionItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

    public static final RegistryObject<Item> HERB_POTION = ITEMS.register("herb_potion", () -> new HerbPotionItem((new Item.Properties()).maxStackSize(1).group(PotionsTab.HERBS_POTION_TAB)));



    public static void registerItems(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
