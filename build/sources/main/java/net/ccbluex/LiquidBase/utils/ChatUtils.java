package net.ccbluex.LiquidBase.utils;

import net.ccbluex.LiquidBase.Wrapper;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Project: LiquidBase
 * -----------------------------------------------------------
 * Copyright © 2017 | CCBlueX | All rights reserved.
 */
@SideOnly(Side.CLIENT)
public class ChatUtils {

    public static void displayMessage(final String s) {
        Wrapper.getMinecraft().thePlayer.addChatMessage(IChatComponent.Serializer.jsonToComponent("{text:\"" + s + "\"}"));
    }
}