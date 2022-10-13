package net.xalixilax.untitledmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xalixilax.untitledmod.UntitledMod;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(UntitledMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        UntitledMod.LOGGER.debug("Registering Mod Items for " + UntitledMod.MOD_ID);
    }
}
