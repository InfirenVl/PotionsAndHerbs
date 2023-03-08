package com.infiren.potionsherbs.items;

import com.infiren.potionsherbs.utils.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.NonNullList;
import net.minecraft.util.registry.Registry;


public class HerbPotionItem extends PotionItem {

    public HerbPotionItem(Properties builder) {
        super(builder);
    }

    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        if (this.isInGroup(group)) {
            for(Potion potion : Registry.POTION) {
                if (potion != Potions.EMPTY && potion.getRegistryName().getNamespace().equals(Reference.MODID)) {
                    items.add(PotionUtils.addPotionToItemStack(new ItemStack(this), potion));
                }
            }
        }

    }

}
