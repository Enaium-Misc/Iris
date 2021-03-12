package cn.enaium.iris.utils;

/**
 * Project: Iris
 * -----------------------------------------------------------
 * Copyright © 2020-2021 | Enaium | All rights reserved.
 */
public class Mapping {
    public static String net_minecraft_client_Minecraft = "djz";
    public static String net_minecraft_client_Minecraft_getInstance = getName(net_minecraft_client_Minecraft, "C");
    public static String net_minecraft_client_Minecraft_getInstance_desc = getDesc(net_minecraft_client_Minecraft_getInstance, "()V");
    public static String net_minecraft_client_Minecraft_run = getName(net_minecraft_client_Minecraft, "e");
    public static String net_minecraft_client_Minecraft_run_desc = getDesc(net_minecraft_client_Minecraft_run, "()V");
    public static String net_minecraft_client_Minecraft_player = getName(net_minecraft_client_Minecraft, "s");
    public static String net_minecraft_client_player_LocalPlayer = "dzm";
    public static String net_minecraft_client_player_LocalPlayer_tick = getName(net_minecraft_client_player_LocalPlayer, "j");
    public static String net_minecraft_client_player_LocalPlayer_tick_desc = getDesc(net_minecraft_client_player_LocalPlayer_tick, "()V");
    public static String net_minecraft_client_player_LocalPlayer_setSprint = getName(net_minecraft_client_player_LocalPlayer, "g");
    public static String net_minecraft_client_player_LocalPlayer_setSprint_desc = getDesc(net_minecraft_client_player_LocalPlayer_setSprint, "(Z)V");
    public static String net_minecraft_client_KeyboardHandler = "djx";
    public static String net_minecraft_client_KeyboardHandler_keyPress = getName(net_minecraft_client_KeyboardHandler, "a");
    public static String net_minecraft_client_KeyboardHandler_keyPress_desc = getDesc(net_minecraft_client_KeyboardHandler_keyPress, "(JIIII)V");
    public static String net_minecraft_client_gui_Gui = "dkv";
    public static String net_minecraft_client_gui_Gui_render = getName(net_minecraft_client_gui_Gui, "a");
    public static String net_minecraft_client_gui_Gui_render_desc = getDesc(net_minecraft_client_gui_Gui_render, "(Ldfm;F)V");


    private static String getName(String type, String name) {
        return type + "." + name;
    }

    private static String getDesc(String method, String desc) {
        return method + desc;
    }
}