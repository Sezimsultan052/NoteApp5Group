package com.example.noteapp5group.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapp5group.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDataBase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}