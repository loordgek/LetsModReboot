package com.pahimar.letsmodreboot.proxy;

import com.pahimar.letsmodreboot.block.BlockLMRB;
import com.pahimar.letsmodreboot.item.ItemLMRB;

public interface IProxy
{
    public abstract ClientProxy getClientProxy();

    public abstract void registeritemrenders();;

    public abstract void registerRenderers();

    public abstract void registerBlockForMeshing(BlockLMRB block, int metadata, String name);

    public abstract void registerItemForMeshing(ItemLMRB item, int metadata, String name);

}
