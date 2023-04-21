package com.example.movies.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.commitNow
import com.example.movies.presentation.screens.FavouritesFragment
import com.example.movies.R
import com.example.movies.databinding.ActivityMainBinding
import com.example.movies.presentation.screens.HomeFragment
import com.example.movies.presentation.screens.SearchFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.commitNow {
                setReorderingAllowed(true)
                add(R.id.fragmentContainer, HomeFragment.newInstance())
            }
        }

//        binding.navigationView.setOnNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.main_page -> {
//                    addFragment(
//                        fragment = HomeFragment(), title = R.string.home
//                    )
//                }
//                R.id.favourites -> {
//                    addFragment(
//                        FavouritesFragment(), R.string.favourites
//                    )
//                }
//                R.id.search -> {
//                    replaceFragment(
//                        SearchFragment(), R.string.search
//                    )
//                }
//            }

//            true
        }
    }


//    private fun addFragment(fragment: Fragment, @StringRes title: Int) {
//        supportFragmentManager
//            .beginTransaction()
//            .add(R.id.fragmentContainer, fragment)
//            .commit()
//        binding.toolbar.title = getString(title)
//    }
//
//    private fun replaceFragment(fragment: Fragment, @StringRes title: Int) {
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.fragmentContainer, fragment)
//            .commit()
//        binding.toolbar.title = getString(title)
//
//    }
