package com.pahimar.letsmodreboot.proxy;

import com.pahimar.letsmodreboot.block.BlockLMRB;
import com.pahimar.letsmodreboot.client.Modelhelper;
import com.pahimar.letsmodreboot.item.ItemLMRB;
import com.pahimar.letsmodreboot.reference.Reference;

import java.util.ArrayList;

public class ClientProxy extends CommonProxy
{
    private static ArrayList<BlockModelEntry> blocksToRegister = new ArrayList();
    private static ArrayList<ItemModelEntry> itemsToRegister = new ArrayList();
    @Override
    public void registerRenderers()
    {
        for (BlockModelEntry BlockModelEntry : blocksToRegister)
        {
            Modelhelper.registerBlock(BlockModelEntry.block, BlockModelEntry.metadata, Reference.MOD_ID + ":" + BlockModelEntry.name);
        }
    }
    @Override
    public void registeritemrenders()
    {
        for (ItemModelEntry ItemModelEntry : itemsToRegister)
        {
            Modelhelper.registerItem(ItemModelEntry.item, ItemModelEntry.metadata, Reference.MOD_ID + ":" + ItemModelEntry.name
            );
        }
    }
    @Override
    public ClientProxy getClientProxy()
    {
        return this;
    }
    @Override
    public void registerBlockForMeshing(BlockLMRB block, int metadata, String name)
    {
        blocksToRegister.add(new BlockModelEntry(block, metadata, name));
    }
    @Override
    public void registerItemForMeshing(ItemLMRB item, int metadata, String name)
    {
        itemsToRegister.add(new ItemModelEntry(item, metadata, name));
    }
    private static class BlockModelEntry
    {
        public BlockLMRB block;
        public int metadata;
        public String name;
        public BlockModelEntry(BlockLMRB block, int metadata, String name)
        {
            this.block = block;
            this.metadata = metadata;
            this.name = name;
        }
    }
    private static class ItemModelEntry
    {
        public ItemLMRB item;
        public int metadata;
        public String name;
        public ItemModelEntry(ItemLMRB item, int metadata, String name)
        {
            this.item = item;
            this.metadata = metadata;
            this.name = name;
        }
    }

}
