package com.pahimar.letsmodreboot.init;

import com.pahimar.letsmodreboot.item.ItemLMRB;
import com.pahimar.letsmodreboot.item.ItemMapleLeaf;
import com.pahimar.letsmodreboot.item.itemdusts;
import com.pahimar.letsmodreboot.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
    public static final ItemLMRB dust = new itemdusts();
    public static final ItemLMRB tinypile = new com.pahimar.letsmodreboot.item.tinypile();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(dust, "dust");
        GameRegistry.registerItem(tinypile, "tinypile");
    }
}
