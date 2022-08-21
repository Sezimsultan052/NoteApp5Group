package com.example.noteapp5group

import android.app.Application
import androidx.room.Room
import com.example.noteapp5group.data.room.NoteDao
import com.example.noteapp5group.data.room.NoteDataBase

class App: Application() {

    companion object{
        lateinit var noteDao: NoteDao
    }
    lateinit var noteDataBase: NoteDataBase

    override fun onCreate() {
        super.onCreate()
        noteDataBase = Room.databaseBuilder(
            this,
            NoteDataBase::class.java,
            "note_database")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

        noteDao = noteDataBase.noteDao()
    }
}