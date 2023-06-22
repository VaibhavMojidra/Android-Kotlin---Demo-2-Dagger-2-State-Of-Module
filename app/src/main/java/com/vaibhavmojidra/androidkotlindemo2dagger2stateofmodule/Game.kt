package com.vaibhavmojidra.androidkotlindemo2dagger2stateofmodule

import android.util.Log
import javax.inject.Inject

class Game @Inject constructor(val gameSize:Int){
    init {
        Log.i("MyTag","Game class initialized.")
    }

    fun getGameSize() {
        Log.i("MyTag","Game size is $gameSize.")
    }
}
