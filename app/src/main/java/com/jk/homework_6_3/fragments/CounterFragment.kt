package com.jk.homework_6_3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.jk.homework_6_3.databinding.FragmentCounterBinding
import com.jk.homework_6_3.viewmodel.SharedViewModel

class CounterFragment : Fragment() {
    private lateinit var binding: FragmentCounterBinding
    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentCounterBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[SharedViewModel::class.java]
        initObserver()
    }

    private fun initObserver() {
        viewModel.counterData.observe(viewLifecycleOwner) {
            binding.tvCounter.text = it.toString()
        }
    }
}