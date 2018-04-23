package net.ccbluex.LiquidBase;

import net.minecraft.client.Minecraft;

/**
 * Project: LiquidBase
 * -----------------------------------------------------------
 * Copyright © 2017 | CCBlueX | All rights reserved.
 */
public class Wrapper {

    private static final Minecraft minecraft = Minecraft.getMinecraft();

    public static Minecraft getMinecraft() {
        return minecraft;
    }
}