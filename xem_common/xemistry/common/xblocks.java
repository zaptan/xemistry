package xemistry.common;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.Material;

import xemistry.common.XReference;

public class xblocks {

    public static Block greenMoving;
    public static Block greenStill;
    public static Item bucketGreen;


	public static void init() {
		//bucketGreen = new BlockCalcinator(BlockIds.CALCINATOR).setBlockName(CALCINATOR_NAME);
		greenStill = new greenStill(XReference.greenWaterID, Material.water);
		greenMoving = new greenMoving(XReference.greenMovingID, Material.water);


	}
	
	
}
