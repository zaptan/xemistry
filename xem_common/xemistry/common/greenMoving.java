package xemistry.common;

import net.minecraft.src.BlockFlowing;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import xemistry.common.XReference;


public class greenMoving extends BlockFlowing {

    protected greenMoving(int id, Material material) {
        super(id, material);
        this.blockHardness = 100F;
        this.setLightOpacity(3);
        this.setBlockName("redWaterFlowing");
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public String getTextureFile() {
        return XReference.SPRITE_SHEET_LOCATION + XReference.BLOCK_SPRITE_SHEET;
    }

}