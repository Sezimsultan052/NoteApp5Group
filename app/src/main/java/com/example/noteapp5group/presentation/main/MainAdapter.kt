package com.example.noteapp5group.presentation.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noteapp5group.databinding.NoteItemBinding
import com.example.noteapp5group.domain.model.Note

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>(){

    var list = listOf<Note>()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            NoteItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size


    inner class ViewHolder(private val binding: NoteItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(note: Note){
            binding.tvItemNoteTitle.text = note.title
            binding.tvItemNoteText.text = note.description
        }
    }
}