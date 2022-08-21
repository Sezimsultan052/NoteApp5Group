package com.example.noteapp5group.presentation.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.noteapp5group.R
import com.example.noteapp5group.core.BaseFragment
import com.example.noteapp5group.databinding.FragmentMainBinding

class MainFragment :  BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    private lateinit var viewModel: MainViewModel
    private val controller: NavController by lazy {
        val navHostFragment =
            requireActivity().supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        navHostFragment.navController
    }
    private lateinit var adapter: MainAdapter

    override fun setupUI() {
        initAdapter()
        initViewModel()
        getNote()
    }

    private fun getNote() {
    }

    override fun setupObserver() {
        super.setupObserver()
        openAddNoteFragment()
    }

    private fun openAddNoteFragment() {
        binding().btnAdd.setOnClickListener{
            controller.navigate(R.id.formFragment)
        }
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    private fun initAdapter() {
        adapter = MainAdapter()
        binding().rvNote.adapter = adapter
    }

}