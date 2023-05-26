package net.azo.stringy;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class CottonBlock extends CropBlock {
    public CottonBlock(Settings settings) {
        super(settings);
    }
    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.COTTON_BOLL;
    }
}