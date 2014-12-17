package com.pahimar.letsmodreboot.init;

import com.pahimar.letsmodreboot.LetsModReboot;
import com.pahimar.letsmodreboot.block.BlockLMRB;
import com.pahimar.letsmodreboot.block.Blockflag;
import com.pahimar.letsmodreboot.block.BlocksLMRB;
import com.pahimar.letsmodreboot.reference.Reference;
import com.pahimar.letsmodreboot.utility.ItemBlockWithVariants;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks extends BlocksLMRB
{



    public static void init()
    {
        flag = registerBlock(new Blockflag(), "flag");


    }

    private static Block registerBlock(BlockLMRB block, String name)
    {
        block.setUnlocalizedName(name);
        if (block.hasPresetProperties())
        {
            GameRegistry.registerBlock(block, ItemBlockWithVariants.class, name);
            for (IBlockState state : block.presetStates)
            {
                String stateName = block.getStateName(state, true);
                ModelBakery.addVariantName(Item.getItemFromBlock(block), Reference.MOD_ID + ":" + stateName);
                LetsModReboot.proxy.registerBlockForMeshing(block, block.getMetaFromState(state), stateName);
            }
        }
        else
        {
            GameRegistry.registerBlock(block, name);
            ModelBakery.addVariantName(Item.getItemFromBlock(block), Reference.MOD_ID + ":" + name);
            LetsModReboot.proxy.registerBlockForMeshing(block, 0, name);
        }
        return block;
    }
}