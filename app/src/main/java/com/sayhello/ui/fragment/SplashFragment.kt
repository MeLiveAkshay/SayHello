package com.sayhello.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.sayhello.R
import com.sayhello.ui.activity.MasterActivity

class SplashFragment : Fragment() {

    private lateinit var logoImage: ImageView
    private lateinit var appTitle: TextView
    private lateinit var slogan1: TextView
    private lateinit var slogan2: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }
/**
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set status bar color
//        requireActivity().window.statusBarColor =
//            ContextCompat.getColor(requireContext(), R.color.white)

        // Find views by ID
        logoImage = view.findViewById(R.id.logoImage)
        appTitle = view.findViewById(R.id.appTitle)
        slogan1 = view.findViewById(R.id.slogan1)
        slogan2 = view.findViewById(R.id.slogan2)

        // Apply animations
        val fadeIn = AnimationUtils.loadAnimation(requireContext(), android.R.anim.fade_in)
        val slideUp = AnimationUtils.loadAnimation(requireContext(), android.R.anim.slide_in_left)

        logoImage.startAnimation(fadeIn)
        appTitle.startAnimation(slideUp)
        slogan1.startAnimation(slideUp)
        slogan2.startAnimation(slideUp)

        // Navigate to MasterActivity after 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(requireContext(), MasterActivity::class.java))
            requireActivity().finish()
        }, 3000)
    }

    **/

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    // Find views by ID
    logoImage = view.findViewById(R.id.logoImage)
    appTitle = view.findViewById(R.id.appTitle)
    slogan1 = view.findViewById(R.id.slogan1)
    slogan2 = view.findViewById(R.id.slogan2)

    // Load animations (fade in + slide up)
    val fadeIn = AnimationUtils.loadAnimation(requireContext(), android.R.anim.fade_in)
    val slideUp = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_up) // Custom anim

    logoImage.startAnimation(fadeIn)
    appTitle.startAnimation(slideUp)
    slogan1.startAnimation(slideUp)
    slogan2.startAnimation(slideUp)

    // Navigate after delay
    Handler(Looper.getMainLooper()).postDelayed({
        startActivity(Intent(requireContext(), MasterActivity::class.java))
        requireActivity().finish()
    }, 3000)
}

}
