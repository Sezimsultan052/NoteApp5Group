package com.example.noteapp5group.domain.use_cases

import com.example.noteapp5group.domain.model.Note
import com.example.noteapp5group.domain.repository.NoteRepository

class DeleteNoteUseCase(private val repository: NoteRepository) {

    fun deleteNote(note: Note) = repository.deleteNote(note)
}