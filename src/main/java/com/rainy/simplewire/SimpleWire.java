package com.rainy.simplewire;

import com.rainy.simplewire.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class SimpleWire implements ModInitializer {


    public static final String MOD_ID = "rainysimplewire";


    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
