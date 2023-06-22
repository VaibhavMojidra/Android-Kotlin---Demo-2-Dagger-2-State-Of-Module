package com.vaibhavmojidra.androidkotlindemo2dagger2stateofmodule

import dagger.Module
import dagger.Provides

@Module
class GameModule(val gameSize:Int) {
    @Provides
    fun providesGame():Game{
        return Game(gameSize)
    }
}