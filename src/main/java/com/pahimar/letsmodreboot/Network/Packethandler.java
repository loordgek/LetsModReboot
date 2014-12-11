package com.pahimar.letsmodreboot.Network;


import com.pahimar.letsmodreboot.Network.message.MessageTileEntityLRMB;
import com.pahimar.letsmodreboot.reference.Reference;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by stefanh on 6-12-2014.
 */
public class Packethandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID.toLowerCase());
    public static void init()
    {
        INSTANCE.registerMessage(MessageTileEntityLRMB.class, MessageTileEntityLRMB.class, 0, Side.CLIENT);

    }
}
