package xemistry.common;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

//import ee3.common.tile.TileCalcinator;

/**
 * CommonProxy
 * 
 * The common proxy class between client and server. Client proxy extends this
 * for further client specific functionality
 * 
 * @author Zaptan
 * @license No one is allowed to look at, reference or use this file or any part of.
 * 
 */

public class CommonProxy implements IGuiHandler {

    
    public void initRenderingAndTextures() { }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

}
