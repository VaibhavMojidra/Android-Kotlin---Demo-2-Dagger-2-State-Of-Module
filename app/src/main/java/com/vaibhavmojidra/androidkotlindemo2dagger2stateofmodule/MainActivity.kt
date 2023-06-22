package com.vaibhavmojidra.androidkotlindemo2dagger2stateofmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerPlayGameComponent.builder().gameModule(GameModule(3000)).build().getPlayGame()
    }
}