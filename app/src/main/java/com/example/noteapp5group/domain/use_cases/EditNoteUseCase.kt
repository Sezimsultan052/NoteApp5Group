package com.example.noteapp5group.domain.use_cases

import com.example.noteapp5group.domain.model.Note
import com.example.noteapp5group.domain.repository.NoteRepository

class EditNoteUseCase(private val repository: NoteRepository) {

    fun editNote(note: Note) = repository.editNote(note.id, note)
}