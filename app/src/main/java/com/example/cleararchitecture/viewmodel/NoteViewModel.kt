package com.example.cleararchitecture.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleararchitecture.dao.NoteDao
import com.example.cleararchitecture.entities.Note
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val noteDao: NoteDao
) : ViewModel() {
    fun createNote(){
        viewModelScope.launch {
            noteDao.create(
                Note(title = "Learn kotlin", content = "It's difficult")
            )
        }
    }
}