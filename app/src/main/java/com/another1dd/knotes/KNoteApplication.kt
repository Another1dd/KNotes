package com.another1dd.knotes

import com.activeandroid.app.Application
import com.another1dd.knotes.di.AppComponent
import com.another1dd.knotes.di.DaggerAppComponent
import com.another1dd.knotes.di.NoteDaoModule

class KNoteApplication : Application() {

    companion object {
        lateinit var graph: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        graph = DaggerAppComponent.builder().noteDaoModule(NoteDaoModule()).build()
    }
}
