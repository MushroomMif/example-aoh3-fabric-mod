package com.example.mod.mixin;

import aoh.kingdoms.history.menu.MenuManager;
import aoh.kingdoms.history.menu.View;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MenuManager.class)
public class ExampleMixin {
    @Inject(method = "getViewID(Laoh/kingdoms/history/menu/View;)I", at = @At("HEAD"))
    private void exampleInject(View eView, CallbackInfoReturnable<Integer> cir) {
        System.out.println(eView + " menu was opened");
    }
}
