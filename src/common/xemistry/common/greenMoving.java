package xemistry.common;

import net.minecraft.src.BlockFlowing;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import xemistry.common.Reference;


public class greenMoving extends BlockFlowing {

    protected greenMoving(int id, Material material) {
        super(id, material);
        this.blockHardness = 100F;
        this.setLightOpacity(3);
        this.setBlockName("redWaterFlowing");
        this.setCreativeTab(CreativeTabs.tabDeco);
    }

    @Override
    public String getTextureFile() {
        return Reference.SPRITE_SHEET_LOCATION + Reference.BLOCK_SPRITE_SHEET;
    }

}