package com.pahimar.letsmodreboot.block;

import com.google.common.collect.ImmutableSet;
import com.pahimar.letsmodreboot.creativetab.CreativeTabLMRB;
import com.pahimar.letsmodreboot.reference.Reference;
import com.pahimar.letsmodreboot.utility.BlockStateUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;

public class BlockLMRB extends Block
{
    public ImmutableSet<IBlockState> presetStates;

    protected BlockLMRB(Material material)
    {
        super(material);
        this.presetStates = BlockStateUtils.getValidStatesForProperties(this.getDefaultState(), this.getPresetProperties());

        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }

    public BlockLMRB()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
    @Override
    public int damageDropped(IBlockState state)
    {
        return this.getMetaFromState(state);
    }
    public IProperty[] getPresetProperties()
    {
        return null;
    }
    public boolean hasPresetProperties()
    {
        return getPresetProperties() != null;
    }
    public String getStateName(IBlockState state, boolean fullName)
    {
        String unlocalizedName = state.getBlock().getUnlocalizedName();

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}
