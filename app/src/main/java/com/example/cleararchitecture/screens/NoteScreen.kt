package com.example.cleararchitecture.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.example.cleararchitecture.viewmodel.NoteViewModel

@Composable
fun NoteScreen(
    modifier: Modifier = Modifier,
    noteViewModel: NoteViewModel = hiltViewModel()
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Button(
            onClick = {noteViewModel.createNote()}
        ) {
            Text(text = "New note")
        }
    }
}