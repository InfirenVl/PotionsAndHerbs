package com.infiren.potionsherbs.blocks;

import com.infiren.potionsherbs.items.HerbsItem;
import com.infiren.potionsherbs.utils.HerbsTab;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class AconiteBlock extends BushBlock {
    public AconiteBlock() {
        super(AbstractBlock.Properties
                .create(Material.PLANTS)
                .doesNotBlockMovement()
                .zeroHardnessAndResistance()
                .sound(SoundType.PLANT)


        );


    }
}
