package com.vaibhavmojidra.androidkotlindemo2dagger2stateofmodule

import dagger.Component

@Component(modules = [GameModule::class])
interface PlayGameComponent {
    fun getPlayGame():PlayGame
}