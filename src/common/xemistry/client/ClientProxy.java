package xemistry.client;

import java.io.File;

import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraftforge.client.EnumHelperClient;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

import xemistry.Xemmestry;
import xemistry.common.CommonProxy;
import xemistry.common.Reference;


/**
 * ClientProxy
 * 
 * Client specific functionality that cannot be put into CommonProxy
 * 
 * @author Zaptan
 * @license No one is allowed to look at, reference or use this file or any part of.
 * 
 */
public class ClientProxy extends CommonProxy {

    
    @Override
    public void initRenderingAndTextures() {
    	MinecraftForgeClient.preloadTexture(Reference.SPRITE_SHEET_LOCATION + Reference.BLOCK_SPRITE_SHEET);
        MinecraftForgeClient.preloadTexture(Reference.SPRITE_SHEET_LOCATION + Reference.ITEM_SPRITE_SHEET);
        
        //public static Item myItem = (new Item(ID)).setTextureIndex().setIconIndex(0).setItemName("name");
    }
    
}
