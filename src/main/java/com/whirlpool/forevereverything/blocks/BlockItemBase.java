package com.whirlpool.forevereverything.blocks;

import com.whirlpool.forevereverything.ForeverEverything;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block p_i48527_1_) {
        super(p_i48527_1_, new Item.Properties().tab(ForeverEverything.TAB));
    }
}
