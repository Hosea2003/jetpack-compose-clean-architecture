package com.example.cleararchitecture.config

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cleararchitecture.dao.NoteDao
import com.example.cleararchitecture.entities.Note

@Database(entities = [Note::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao
}