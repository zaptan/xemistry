package xemistry;

import java.util.logging.Logger;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import xemistry.common.XReference;
import xemistry.common.ConfigurationHandler;
import xemistry.common.CommonProxy;
import xemistry.common.xblocks;

/**
 * Xemistry
 * 
 * Mod for Minecraft
 * 
 * @author Zaptan
 * @license No one is allowed to look at, reference or use this file or any part of.
 * 
 */

@Mod(modid = XReference.MOD_ID, name = XReference.MOD_NAME, version = XReference.VERSION)
@NetworkMod(channels = { XReference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false)
public class Xemistry {

	public static Logger xmLog = Logger.getLogger(XReference.LOGGER_PREFIX);

    @Instance(XReference.MOD_ID)
    public static Xemistry xinstance;

   // @SidedProxy(clientSide = "xemistry.client.ClientProxy", serverSide = "xemistry.common.CommonProxy")
   // public static CommonProxy proxy;

   // @PreInit
   // public void preInit(FMLPreInitializationEvent event) {
    	// Init Logs
   // 	xmLog.setParent(FMLLog.getLogger());
   // 	xmLog.info("Starting");
        // Initialize the configuration
   //     ConfigurationHandler.init(event.getSuggestedConfigurationFile());

   // }

    @Init
    public void load(FMLInitializationEvent event) {

    	// Initialize custom rendering and pre-load textures (Client only)
   // 	proxy.initRenderingAndTextures();
    	
    	xblocks.init();
    	
    	//LanguageRegistry.addName(xblocks.bucketGreen, "Green Bucket");
    	LanguageRegistry.addName(xblocks.greenStill, "Green Water (Still)");
    	LanguageRegistry.addName(xblocks.greenMoving, "Green Water (Flowing)");

    	//GameRegistry.registerBlock(bucketgreenId);
    	GameRegistry.registerBlock(xblocks.greenStill);
    	GameRegistry.registerBlock(xblocks.greenMoving);

    	

    }

    @PostInit
    public void modsLoaded(FMLPostInitializationEvent event) {

    }
}