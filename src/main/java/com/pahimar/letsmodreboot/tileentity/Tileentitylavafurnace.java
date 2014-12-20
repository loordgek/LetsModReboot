package com.pahimar.letsmodreboot.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidContainerRegistry;

/**
 * Created by stefanh on 6-12-2014.
 */
public class Tileentitylavafurnace extends TileEntityLMRB
{
    public final int maxLiquid = FluidContainerRegistry.BUCKET_VOLUME * 16;
    public static final int INVENTORY_SIZE = 3;
    public static final int TANK_INDEX = 0;
    public static final int INPUT_INVENTORY_INDEX = 1;
    public static final int OUTPUT_INVENTORY_INDEX = 2;

    @Override
    public int[] getAccessibleSlotsFromSide(int side)
    {
        return side == ForgeDirection.DOWN.ordinal() ? new int[]{TANK_INDEX,INPUT_INVENTORY_INDEX , OUTPUT_INVENTORY_INDEX} : new int[]{INPUT_INVENTORY_INDEX, OUTPUT_INVENTORY_INDEX, };
    }
    @Override
    public boolean canExtractItem(int slotIndex, ItemStack itemStack, int side)
    {
        return slotIndex == OUTPUT_INVENTORY_INDEX || slotIndex == OUTPUT_INVENTORY_INDEX;
    }
}
