package com.example.noteapp5group.data.room

import androidx.room.*
import com.example.noteapp5group.data.model.NoteEntity

@Dao
interface NoteDao {

    @Query("SELECT * FROM 'note_db'")
    fun getAllNotes() : List<NoteEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNote(noteEntity: NoteEntity)

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity)

    @Update
    suspend fun editNote(noteEntity: NoteEntity)
}