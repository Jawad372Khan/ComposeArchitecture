package com.example.composearchitecture

import android.app.Application
import com.example.composearchitecture.ui.di.DIManager


class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DIManager.initialize(this)
    }
}

