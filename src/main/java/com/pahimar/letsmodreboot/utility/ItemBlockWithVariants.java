package com.pahimar.letsmodreboot.utility;

import com.google.common.collect.ImmutableSet;
import com.pahimar.letsmodreboot.block.BlockLMRB;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by stefan on 11-12-2014.
 */
public class ItemBlockWithVariants extends ItemBlock
{
    public ImmutableSet<IBlockState> presetStates;
    public ItemBlockWithVariants(Block block)
    {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }
    @Override
    public int getMetadata(int metadata)
    {
        return metadata;
    }
    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        BlockLMRB block = (BlockLMRB)this.block;
        if (block.hasPresetProperties())
        {
            return super.getUnlocalizedName() + "." + block.getStateName(block.getStateFromMeta(stack.getMetadata()), false);
        }
        else return super.getUnlocalizedName();
    }
}
