package com.example.composearchitecture.ui.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class DIManager private constructor(private val application: Application) {

    companion object {
        fun initialize(application: Application) {
            DIManager(application)
        }
    }

    init {
        startKoin {
            androidLogger()
            androidContext(application)
        }
    }
}

//private val viewModelList
//    get() = listOf()
//val moduleList
//    get() = listOf(
//        viewModelList
//    )
//
//private fun getModules(): List<Module> {
//    return moduleList.flatten()
//}