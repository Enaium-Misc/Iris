package cn.enaium.iris.mixins;

import cn.enaium.cf4m.CF4M;
import cn.enaium.iris.client.events.Events;
import net.minecraft.client.KeyboardHandler;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Project: Iris
 * Author: Enaium
 */
@Mixin(KeyboardHandler.class)
public class KeyboardHandlerMixin {
    @Inject(at = @At("HEAD"), method = "keyPress(JIIII)V")
    public void keyPress(long window, int key, int var4, int action, int var6, CallbackInfo callbackInfo) {
        if (action == GLFW.GLFW_PRESS) {
            CF4M.MODULE.onKey(key);
            CF4M.EVENT.post(new Events.KeyboardEvent(key));
        }
    }
}
