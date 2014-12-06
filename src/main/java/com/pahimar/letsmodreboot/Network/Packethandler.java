package com.pahimar.letsmodreboot.Network;

import com.pahimar.letsmodreboot.Network.message.MessageTileEntityEE;
import com.pahimar.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

/**
 * Created by stefanh on 6-12-2014.
 */
public class Packethandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID.toLowerCase());
    public static void init()
    {
        INSTANCE.registerMessage(MessageTileEntityEE.class, MessageTileEntityEE.class, 0, Side.CLIENT);

    }
}
