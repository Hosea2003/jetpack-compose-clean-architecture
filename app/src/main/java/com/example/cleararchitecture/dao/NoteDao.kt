package com.example.cleararchitecture.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.cleararchitecture.entities.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    @Insert
    suspend fun create(note: Note)
}