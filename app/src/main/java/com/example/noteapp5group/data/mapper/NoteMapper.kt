package com.example.noteapp5group.data.mapper

import com.example.noteapp5group.data.model.NoteEntity
import com.example.noteapp5group.domain.model.Note

class NoteMapper {

    fun noteToNoteEntity(note: Note) = NoteEntity(
        id= note.id,
        title = note.title,
        description = note.description,
        creationDate = note.creationDate
    )

    fun noteEntityToNote(note: NoteEntity) = Note(
        id= note.id,
        title = note.title,
        description = note.description,
        creationDate = note.creationDate
    )
}