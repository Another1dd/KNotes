package com.another1dd.knotes.di

import com.another1dd.knotes.mvp.models.NoteDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NoteDaoModule {
    @Provides
    @Singleton
    fun provideNoteDao(): NoteDao = NoteDao()
}