package com.pahimar.letsmodreboot.item;

import com.pahimar.letsmodreboot.creativetab.CreativeTabLMRB;
import com.pahimar.letsmodreboot.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemLMRB extends Item
{
    private Object block;

    public ItemLMRB()
    {
        super();
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
   public String getUnlocalizedName(ItemStack itemStack)
    {
       return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
  }

//    @Override
//   @SideOnly(Side.CLIENT)
//    public void registeritemmodel(Modelhelper modelregister)
//    {
//        registeritemmodel(); = registeritemmodel(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
//    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
