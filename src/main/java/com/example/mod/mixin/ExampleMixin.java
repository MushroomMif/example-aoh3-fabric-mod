package com.example.mod.mixin;

import aoc.kingdoms.lukasz.menu.MenuManager;
import aoc.kingdoms.lukasz.menu.View;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MenuManager.class)
public class ExampleMixin {
    @Inject(method = "getViewID(Laoc/kingdoms/lukasz/menu/View;)I", at = @At("HEAD"))
    private void exampleInject(View eView, CallbackInfoReturnable<Integer> cir) {
        System.out.println(eView + " menu was opened");
    }
}
