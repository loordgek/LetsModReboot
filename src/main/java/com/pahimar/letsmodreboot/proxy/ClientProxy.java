package com.pahimar.letsmodreboot.proxy;

import com.pahimar.letsmodreboot.block.BlockLMRB;
import com.pahimar.letsmodreboot.client.Modelhelper;
import com.pahimar.letsmodreboot.reference.Reference;

import java.util.ArrayList;

public class ClientProxy extends CommonProxy
{
    private static ArrayList<ModelEntry> blocksToRegister = new ArrayList();
    @Override
    public void registerRenderers()
    {
        for (ModelEntry modelEntry : blocksToRegister)
        {
            Modelhelper.registerBlock(modelEntry.block, modelEntry.metadata, Reference.MOD_ID + ":" + modelEntry.name);
        }
    }
    @Override
    public void registerBlockForMeshing(BlockLMRB block, int metadata, String name)
    {
        blocksToRegister.add(new ModelEntry(block, metadata, name));
    }
    private static class ModelEntry
    {
        public BlockLMRB block;
        public int metadata;
        public String name;
        public ModelEntry(BlockLMRB block, int metadata, String name)
        {
            this.block = block;
            this.metadata = metadata;
            this.name = name;
        }
    }
}
