package com.example.noteapp5group.domain.use_cases

import com.example.noteapp5group.domain.repository.NoteRepository

class GetAllNotesUseCase(private val repository: NoteRepository) {

    fun getAllNotes() = repository.getAllNotes()
}