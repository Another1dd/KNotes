package com.another1dd.knotes.mvp.presenters

import com.another1dd.knotes.KNoteApplication
import com.another1dd.knotes.mvp.models.NoteDao
import com.another1dd.knotes.mvp.views.MainView
import com.arellomobile.mvp.MvpPresenter
import javax.inject.Inject

class MainPresenter : MvpPresenter<MainView>() {

    @Inject
    lateinit var mNoteDao: NoteDao

    init {
        KNoteApplication.graph.inject(this)
    }
}