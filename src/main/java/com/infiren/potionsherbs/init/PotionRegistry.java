package com.infiren.potionsherbs.init;


import com.infiren.potionsherbs.utils.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PotionRegistry {

    static int ultralong = 19200;
    int normal = 3600;
    int smal = 1800;

   /* public static void onPotionReg(RegistryEvent.Register<Potion> event){
        IForgeRegistry<Potion> POTION = event.getRegistry();
        int ultralong = 12900;
        int normal = 3600;
        int smal = 1800;

        POTION.register((Potion)(new Potion("night_vision", new EffectInstance[]{new EffectInstance(Effects.NIGHT_VISION, ultralong)})).setRegistryName("ultra_long_night_vision"));
    }*/

   public static final DeferredRegister<Potion> POTION_TYPES = DeferredRegister.create(ForgeRegistries.POTION_TYPES, Reference.MODID);



    public static final RegistryObject<Potion> ULNV = POTION_TYPES.register("example_block", () -> new Potion("night_vision_xui", new EffectInstance(Effects.NIGHT_VISION, ultralong)));

    //public static final Potion LONG_NIGHT_VISION = register("ultra_long_night_vision", new Potion("night_vision", new EffectInstance(Effects.NIGHT_VISION, 19600)));

   // public static final RegistryObject<Potion> ULS = POTIONS.register();


    public static void registerPotions(){
        POTION_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}

