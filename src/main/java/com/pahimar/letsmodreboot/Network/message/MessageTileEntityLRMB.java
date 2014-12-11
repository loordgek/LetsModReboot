package com.pahimar.letsmodreboot.Network.message;

import com.pahimar.letsmodreboot.tileentity.TileEntityLMRB;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageTileEntityLRMB implements IMessage, IMessageHandler<MessageTileEntityLRMB, IMessage>
{
    public int x, y, z;
    public byte orientation, state;
    public String customName, owner;
    public MessageTileEntityLRMB()
    {
    }
    public MessageTileEntityLRMB(TileEntityLMRB TileEntityLMRB)
    {
        this.x = TileEntityLMRB.getPos().getX();
        this.y = TileEntityLMRB.getPos().getY();
        this.z = TileEntityLMRB.getPos().getZ();
        this.orientation = (byte) TileEntityLMRB.getOrientation().ordinal();
        this.state = (byte) TileEntityLMRB.getState();
        this.customName = TileEntityLMRB.getCustomName();
        this.owner = TileEntityLMRB.getOwner();
    }
    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
        this.orientation = buf.readByte();
        this.state = buf.readByte();
        int customNameLength = buf.readInt();
        this.customName = new String(buf.readBytes(customNameLength).array());
        int ownerLength = buf.readInt();
        this.owner = new String(buf.readBytes(ownerLength).array());
    }
    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeByte(orientation);
        buf.writeByte(state);
        buf.writeInt(customName.length());
        buf.writeBytes(customName.getBytes());
        buf.writeInt(owner.length());
        buf.writeBytes(owner.getBytes());
    }
    @Override
    public IMessage onMessage(MessageTileEntityLRMB message, MessageContext ctx)
    {
        TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getTileEntity(BlockPos.ORIGIN);
        {
            ((TileEntityLMRB) tileEntity).setOrientation(message.orientation);
            ((TileEntityLMRB) tileEntity).setState(message.state);
            ((TileEntityLMRB) tileEntity).setCustomName(message.customName);
            ((TileEntityLMRB) tileEntity).setOwner(message.owner);
        }
        return null;
    }
    @Override
    public String toString()
    {
        return String.format("MessageTileEntityEE - x:%s, y:%s, z:%s, orientation:%s, state:%s, customName:%s, owner:%s", x, y, z, orientation, state, customName, owner);
    }
}
