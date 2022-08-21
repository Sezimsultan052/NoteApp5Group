package com.example.noteapp5group.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.noteapp5group.App
import com.example.noteapp5group.data.mapper.NoteMapper
import com.example.noteapp5group.domain.model.Note
import com.example.noteapp5group.domain.repository.NoteRepository
import com.example.noteapp5group.utils.Resource
import kotlinx.coroutines.Dispatchers

class NoteRepositoryImpl: NoteRepository {

    private val noteMapper = NoteMapper()
    private val noteDao = App.noteDao


    override fun addNote(note: Note): LiveData<Resource<Unit>> = liveData(Dispatchers.IO) {
        noteDao.addNote(noteMapper.noteToNoteEntity(note))
    }

    override fun getAllNotes(): LiveData<Resource<List<Note>>> = liveData(Dispatchers.IO) {
        noteDao.getAllNotes()
    }

    override fun deleteNote(note: Note): LiveData<Resource<Unit>> = liveData(Dispatchers.IO) {
        noteDao.deleteNote(noteMapper.noteToNoteEntity(note))
    }

    override fun editNote(id: Int, note: Note): LiveData<Resource<Unit>> = liveData(Dispatchers.IO) {
        noteDao.editNote(noteMapper.noteToNoteEntity(note))
    }


}