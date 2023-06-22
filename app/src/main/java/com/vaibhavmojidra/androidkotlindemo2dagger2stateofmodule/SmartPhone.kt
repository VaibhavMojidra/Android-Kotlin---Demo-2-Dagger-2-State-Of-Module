package com.vaibhavmojidra.androidkotlindemo2dagger2stateofmodule

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(){
    init {
        Log.i("MyTag","SmartPhone class initialized.")
    }

    fun isSmartPhoneAvailable() {
        Log.i("MyTag","SmartPhone is available.")
    }
}
