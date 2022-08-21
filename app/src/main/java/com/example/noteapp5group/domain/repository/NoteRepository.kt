package com.example.noteapp5group.domain.repository

import androidx.lifecycle.LiveData
import com.example.noteapp5group.domain.model.Note
import com.example.noteapp5group.utils.Resource


interface NoteRepository {

    fun addNote(note: Note): LiveData<Resource<Unit>>

    fun getAllNotes(): LiveData<Resource<List<Note>>>

    fun deleteNote(note: Note) : LiveData<Resource<Unit>>

    fun editNote(id: Int, note: Note) : LiveData<Resource<Unit>>

}