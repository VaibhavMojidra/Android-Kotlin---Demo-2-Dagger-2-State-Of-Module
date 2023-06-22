package com.vaibhavmojidra.androidkotlindemo2dagger2stateofmodule

import android.util.Log
import javax.inject.Inject

class PlayGame @Inject constructor(smartPhone:SmartPhone,game:Game) {
    init {
        smartPhone.isSmartPhoneAvailable()
        game.getGameSize()
        Log.i("MyTag","PlayGame class initialized.")
    }

    fun playGame(){
        Log.i("MyTag","Game started...")
    }
}