package xemistry.common;

import net.minecraft.src.BlockStationary;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import xemistry.common.XReference;

public class greenStill extends BlockStationary {

    protected greenStill(int id, Material material) {
        super(id, material);
        this.blockHardness = 100F;
        this.setLightOpacity(3);
        setBlockName("redWaterStill");
        disableStats();
        setRequiresSelfNotify();
        setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public String getTextureFile() {
        return XReference.SPRITE_SHEET_LOCATION + XReference.BLOCK_SPRITE_SHEET;
    }

}