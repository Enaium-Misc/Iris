package cn.enaium.iris.client.modules.render;

import cn.enaium.cf4m.annotation.Event;
import cn.enaium.cf4m.annotation.module.Module;
import cn.enaium.iris.client.events.Events;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

/**
 * Project: Iris
 * -----------------------------------------------------------
 * Copyright © 2020-2021 | Enaium | All rights reserved.
 */
@Module(value = "HUD", key = GLFW.GLFW_KEY_O, type = "RENDER")
public class HUD {
    @Event
    public void onRender(Events.Render2DEvent event) {
        Minecraft.getInstance().font.draw(event.getPoseStack(), "Enaium No.1", 1, 1, 0xFFFFFFFF);
    }
}
