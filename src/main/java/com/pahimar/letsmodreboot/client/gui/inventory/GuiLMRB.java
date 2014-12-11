package com.pahimar.letsmodreboot.client.gui.inventory;

import com.pahimar.letsmodreboot.utility.ResourceLocationHelper;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

/**
 * Created by stefanh on 6-12-2014.
 */
public class GuiLMRB extends GuiContainer

{
    protected ResourceLocation guiTexture;
    public GuiLMRB(Container container)
    {
        super(container);
    }
    public GuiLMRB(Container container, String texture)
    {
        this(container, ResourceLocationHelper.getResourceLocation(texture));
    }
    public GuiLMRB(Container container, ResourceLocation guiTexture)
    {
        super(container);
        this.guiTexture = guiTexture;
    }
    @Override
    public void initGui()
    {
        super.initGui();
    }
    @Override
    public void drawScreen(int x, int y, float partialTick)
    {
        super.drawScreen(x, y, partialTick);
    }
    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y)
    {
        super.drawGuiContainerForegroundLayer(x, y);
    }
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTick, int x, int y)
    {
    }
    @Override
    protected void keyTyped(char characterTyped, int keyPressed)
    {
    }
    @Override
    public void handleMouseInput()
    {
    }
    @Override
    protected void mouseClicked(int mX, int mY, int mouseButton)
    {
    }
//    @Override
//    protected void mouseMovedOrUp(int mX, int mY, int mouseButton)
    {
    }
    @Override
    protected void mouseClickMove(int mX, int mY, int lastClick, long timeSinceClick)
    {
    }
}
