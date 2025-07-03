package com.sayhello.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.sayhello.R
import com.sayhello.ui.fragment.GreenFragment
import com.sayhello.ui.fragment.RedFragment
import com.sayhello.ui.fragment.SplashFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set a default status bar color (e.g., white)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)

        // Optional: make layout draw under status bar
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        // Get the string extra from the intent
        val keyExtra = intent.getStringExtra("keyExtra")

        // Decide which fragment to load
        val fragment = when (keyExtra?.lowercase()) {
            "red" -> RedFragment()
            "green" -> GreenFragment()
            else -> SplashFragment()
        }

        // Load the fragment into the container
        supportFragmentManager.beginTransaction()
            .replace(R.id.main, fragment)
            .commit()
    }
}
