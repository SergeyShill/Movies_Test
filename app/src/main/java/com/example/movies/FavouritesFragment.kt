package com.example.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movies.databinding.FragmentFavouritesBinding
import com.example.movies.databinding.FragmentHomeBinding
import com.example.movies.repository.MovieRepository

class FavouritesFragment : Fragment() {

    private lateinit var binding: FragmentFavouritesBinding

    val repository = MovieRepository()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentFavouritesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textFavorites.text = repository.getMovie250List().first().title
    }

    companion object {
         @JvmStatic
        fun newInstance() = FavouritesFragment()
    }
}