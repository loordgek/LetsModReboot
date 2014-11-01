package com.pahimar.letsmodreboot.utility;

import com.pahimar.letsmodreboot.reference.Reference;
import net.minecraft.util.ResourceLocation;

/**
 * Created by stefanh on 31-10-2014.
 */
public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String modId, String path)
    {
        return new ResourceLocation(modId, path);
    }

    public static  ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(Reference.MOD_ID.toLowerCase(), path);
    }
}
