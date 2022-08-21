package com.example.noteapp5group.presentation.main

import com.example.noteapp5group.core.BaseViewModel
import com.example.noteapp5group.data.repository.NoteRepositoryImpl
import com.example.noteapp5group.domain.model.Note
import com.example.noteapp5group.domain.use_cases.AddNoteUseCase

class MainViewModel: BaseViewModel() {

    private val repository = NoteRepositoryImpl()
    private val addNoteUseCase= AddNoteUseCase(repository)

    fun addNote(note: Note){
        addNoteUseCase.addNote(note)
    }

}