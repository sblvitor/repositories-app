package com.lira.repositoriesapp

import android.app.Application
import com.lira.repositoriesapp.data.di.DataModule
import com.lira.repositoriesapp.domain.di.DomainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
    }

}