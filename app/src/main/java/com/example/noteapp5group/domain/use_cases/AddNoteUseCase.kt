package com.example.noteapp5group.domain.use_cases

import com.example.noteapp5group.domain.model.Note
import com.example.noteapp5group.domain.repository.NoteRepository

class AddNoteUseCase(private val repository: NoteRepository) {
    fun addNote(note: Note) = repository.addNote(note)
}