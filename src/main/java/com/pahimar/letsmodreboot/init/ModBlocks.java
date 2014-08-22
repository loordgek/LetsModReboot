package com.pahimar.letsmodreboot.init;

import com.pahimar.letsmodreboot.block.Blocktank;
import com.pahimar.letsmodreboot.block.BlockLMRB;
import com.pahimar.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new Blocktank();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
