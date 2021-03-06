package com.rainy.simplewire.registry;

import com.rainy.simplewire.SimpleWire;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item SOFTMETAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(SimpleWire.MOD_ID, "softmetal"), SOFTMETAL);
    }
}
