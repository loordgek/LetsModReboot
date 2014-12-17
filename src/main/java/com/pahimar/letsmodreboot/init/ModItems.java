package com.pahimar.letsmodreboot.init;

import com.pahimar.letsmodreboot.LetsModReboot;
import com.pahimar.letsmodreboot.item.ItemLMRB;
import com.pahimar.letsmodreboot.item.ItemsLMRB;
import com.pahimar.letsmodreboot.reference.Reference;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems extends ItemsLMRB
{
   // public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
   // public static final ItemLMRB dust = new itemdust();
   // public static final ItemLMRB tinypile = new com.pahimar.letsmodreboot.item.tinypile();

    public static void init()
    {
        //    GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        //   GameRegistry.registerItem(dust, "dust");
        //   GameRegistry.registerItem(tinypile, "tinypile");
        //    tinypile = registerItem(new ItemLMRB(), "tinypile");
        mapleLeaf = registerItem(new ItemLMRB(), "mapleLeaf");
        dust = registerItem(new ItemLMRB(), "dust");
    }
    private static Item registerItem(ItemLMRB Item, String name)
    {
        Item.setUnlocalizedName(name);

        GameRegistry.registerItem(Item, name);
        ModelBakery.addVariantName((Item), Reference.MOD_ID + ":" + name);
        LetsModReboot.proxy.registerItemForMeshing(Item, 0, name);

        return Item;
    }

}
