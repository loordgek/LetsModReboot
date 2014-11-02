package com.pahimar.letsmodreboot.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by stefanh on 2-11-2014.
 */
public class recipe
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(OreDictionary.)));
    }
}
