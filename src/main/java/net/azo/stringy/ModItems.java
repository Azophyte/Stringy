package net.azo.stringy;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item COTTON_BOLL = registerItem("cotton_boll",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Stringy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Stringy.LOGGER.debug("Registering Mod Items for " + Stringy.MOD_ID);
    }
}