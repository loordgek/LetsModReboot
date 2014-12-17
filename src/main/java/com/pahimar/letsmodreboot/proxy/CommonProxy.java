package com.pahimar.letsmodreboot.proxy;

import com.pahimar.letsmodreboot.block.BlockLMRB;
import com.pahimar.letsmodreboot.item.ItemLMRB;

public abstract class CommonProxy implements IProxy
{

    public void registerRenderers() {}

    public void registerBlockForMeshing(BlockLMRB block, int metadata, String name) {}

    public void registeritemrenders() {}

    public void registerItemForMeshing(ItemLMRB item, int metadata, String name) {}


}
