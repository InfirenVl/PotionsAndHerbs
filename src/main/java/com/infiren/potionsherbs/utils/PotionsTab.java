package com.infiren.potionsherbs.utils;

import com.infiren.potionsherbs.init.BlockRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class PotionsTab extends ItemGroup {
    public static final ItemGroup HERBS_POTION_TAB = new PotionsTab(Reference.MODID);
    public PotionsTab(String label) {
        super("potion_tab");

    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(BlockRegistry.ACONITE_FLOWER_BLOCK.get());
    }
}
