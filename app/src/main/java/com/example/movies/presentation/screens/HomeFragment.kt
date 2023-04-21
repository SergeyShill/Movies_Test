package com.example.movies.presentation.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movies.R
import com.example.movies.presentation.adapter.PagerAdapter
import com.example.movies.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initial()

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root

    }


    private fun initial() {
        binding.pagerHome.adapter = PagerAdapter(this)
        binding.tabHome.tabIconTint = null
        TabLayoutMediator (binding.tabHome, binding.pagerHome){
            tab, pos ->
            when (pos) {
                0 -> {tab.setText(R.string.popular_1)}
                1 -> {tab.setText(R.string.popular_2)}
                else -> {tab.setText(R.string.popular_3)}

            }


        }.attach()
    }


    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }

}