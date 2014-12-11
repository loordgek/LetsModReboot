package com.pahimar.letsmodreboot.proxy;

import com.pahimar.letsmodreboot.block.BlockLMRB;

public abstract class CommonProxy implements IProxy
{

    public void registerRenderers() {}

    public void registerBlockForMeshing(BlockLMRB block, int metadata, String name) {}

}
