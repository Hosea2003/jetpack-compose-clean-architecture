package com.example.cleararchitecture.module

import android.content.Context
import androidx.room.Room
import com.example.cleararchitecture.config.AppDatabase
import com.example.cleararchitecture.dao.NoteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase=
        Room.databaseBuilder<AppDatabase>(context, "note.db")
            .build()

    @Provides
    fun provideNoteDao(db: AppDatabase): NoteDao = db.noteDao()
}