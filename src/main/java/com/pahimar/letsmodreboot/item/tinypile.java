package com.pahimar.letsmodreboot.item;

import com.pahimar.letsmodreboot.init.ModItems;
import com.pahimar.letsmodreboot.reference.Colors;
import com.pahimar.letsmodreboot.reference.Names;
import com.pahimar.letsmodreboot.reference.Textures;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stefan on 30-10-2014.
 */
public class tinypile extends ItemLMRB{

    public tinypile(){
        super();
        this.setHasSubtypes(true);
        this.setUnlocalizedName(Names.Items.tinypile);

}
    public static List<ItemStack> gettinypile()
    {
        List<ItemStack> tinypileStacks = new ArrayList<ItemStack>();
        for (int meta = 0; meta < Names.Items.dust.length; meta++)
        {
            tinypileStacks.add(new ItemStack(ModItems.tinypile, 1, meta));
        }
        return tinypileStacks;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack itemStack, int renderPass)
    {
        if (itemStack.getItemDamage() == 0)
        {
            return Integer.parseInt(Colors.Iron, 16);
        }
        else if (itemStack.getItemDamage() == 1)
        {
            return Integer.parseInt(Colors.Gold, 16);
        }
        else if (itemStack.getItemDamage() == 2)
        {
            return Integer.parseInt(Colors.Copper, 16);
        }
        else if (itemStack.getItemDamage() == 3)
        {
            return Integer.parseInt(Colors.Lead, 16);
        }
         else if (itemStack.getItemDamage() == 4)
        {
            return Integer.parseInt(Colors.Nickel, 16);
        }
        else if (itemStack.getItemDamage() == 5)
        {
            return Integer.parseInt(Colors.Platinum, 16);
        }
        else if (itemStack.getItemDamage() == 6)
        {
            return Integer.parseInt(Colors.Silver, 16);
        }
        else if (itemStack.getItemDamage() == 7)
        {
            return Integer.parseInt(Colors.Tin, 16);
        }
        return Integer.parseInt(Colors.PURE_WHITE, 16);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, Names.Items.tinypile);
    }
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s.%s", Textures.RESOURCE_PREFIX, Names.Items.tinypile, Names.Items.dust[MathHelper.clamp_int(itemStack.getItemDamage(), 0, Names.Items.dust.length - 1)]);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTab, List list)
    {
        for (int meta = 0; meta < Names.Items.dust.length; ++meta)
        {
            list.add(new ItemStack(this, 1, meta));
        }
    }
}

