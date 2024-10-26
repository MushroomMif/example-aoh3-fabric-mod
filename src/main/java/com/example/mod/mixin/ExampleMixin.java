package com.example.mod.mixin;

import aoc.kingdoms.lukasz.jakowski.AA_Game;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AA_Game.class)
public class ExampleMixin {
    @Inject(method = "create", at = @At("HEAD"))
    private void exampleInject(CallbackInfo ci) {
        System.out.println("Hello Fabric world!");
    }
}
