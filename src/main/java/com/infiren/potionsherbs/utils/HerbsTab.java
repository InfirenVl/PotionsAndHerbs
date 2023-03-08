package com.infiren.potionsherbs.utils;

import com.infiren.potionsherbs.init.BlockRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class HerbsTab extends ItemGroup {

    public static final ItemGroup HERBS_TAB = new HerbsTab(Reference.MODID);

    public HerbsTab(String label) {
        super(label);
    }

    @Override
    public  ItemStack createIcon() {
        return new ItemStack(BlockRegistry.ACONITE_FLOWER_BLOCK.get());

    }
}
