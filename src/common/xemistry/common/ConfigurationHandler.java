package xemistry.common;

import java.io.File;
import java.util.logging.Level;
import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import static net.minecraftforge.common.Configuration.*;

import static xemistry.common.Reference.*;
import static xemistry.common.xblocks.*;


/**
 * ConfigurationManager
 * 
 * Loads in configuration data from disk
 * 
 * @author Zaptan
 * @license No one is allowed to look at, reference or use this file or any part of.
 * 
 */
public class ConfigurationHandler {

    private static final String CATEGORY_KEYBIND = "keybinds";

    public static boolean AUTO_RESOLVE_IDS;
    public static boolean ENABLE_SOUNDS;
    public static boolean ENABLE_PARTICLES;

    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);

        try {
            configuration.load();

            /* General Configs */
            ENABLE_SOUNDS = configuration.getOrCreateBooleanProperty("enable_sounds", CATEGORY_GENERAL, false).getBoolean(false);
            ENABLE_PARTICLES = configuration.getOrCreateBooleanProperty("enable_particles", CATEGORY_GENERAL, true).getBoolean(false);


            AUTO_RESOLVE_IDS = configuration.getOrCreateBooleanProperty("auto_resolve_ids", CATEGORY_BLOCK, false).getBoolean(false);
            BlockIds.FIRSTBLOCK =  configuration.getOrCreateIntProperty("First", CATEGORY_BLOCK, 1999).getInt(1999);

            Property greenStillId = configuration.getOrCreateBlockIdProperty("greenStill", Reference.greenWaterID);
            Property greenMovingId = configuration.getOrCreateBlockIdProperty("greenMoving", Reference.greenMovingID);
            Property bucketgreenId = configuration.getOrCreateIntProperty("bucketGreen", Configuration.CATEGORY_ITEM, 1999);

        }
        catch (Exception e) {
            // TODO: Clean up the logging message
            FMLLog.log(Level.SEVERE, e, "Xemistry has had a problem loading its configuration");
        }
        finally {
            configuration.save();
        }
    }
}
