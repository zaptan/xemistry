package xemistry.common;

import net.minecraft.src.BlockStationary;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import xemistry.common.Reference;

public class greenStill extends BlockStationary {

    protected greenStill(int id, Material material) {
        super(id, material);
        this.blockHardness = 100F;
        this.setLightOpacity(3);
        setBlockName("redWaterStill");
        disableStats();
        setRequiresSelfNotify();
        setCreativeTab(CreativeTabs.tabDeco);
    }

    @Override
    public String getTextureFile() {
        return Reference.SPRITE_SHEET_LOCATION + Reference.BLOCK_SPRITE_SHEET;
    }

}