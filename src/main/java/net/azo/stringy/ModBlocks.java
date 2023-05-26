package net.azo.stringy;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block COTTON = registerBlockWithoutItem("cotton",
            new CottonBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Stringy.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        Stringy.LOGGER.debug("Registering ModBlocks for " + Stringy.MOD_ID);
    }
}