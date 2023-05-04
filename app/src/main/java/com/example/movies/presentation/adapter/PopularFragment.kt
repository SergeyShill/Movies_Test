package com.example.movies.presentation.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.R
import com.example.movies.databinding.FragmentPopularBinding
import com.example.movies.presentation.adapterRV.MoviesAdapter


class PopularFragment : Fragment() {


    private val viewModel: PopularViewModel by viewModels()


    private var _binding: FragmentPopularBinding? = null
    private val binding
        get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentPopularBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private var adapter = MoviesAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireView().findViewById<RecyclerView>(R.id.moviesRV).adapter = adapter
        binding.moviesRV.adapter = adapter

        viewModel.movies.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
    }
}