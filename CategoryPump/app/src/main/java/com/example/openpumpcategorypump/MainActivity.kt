package com.example.openpumpcategorypump

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragment)

        /*
        val appBarConfiguration = AppBarConfiguration(

            setOf(
                R.id.homeFragment,
                R.id.exploreFragment,
                R.id.pumpFragment,
                R.id.chatFragment,
                R.id.assetsFragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        */

        bottomNavigationView.setupWithNavController(navController)
    }
}