package com.martin.lovelygames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.martin.lovelygames.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val anim1 = AnimationUtils.loadAnimation(this, R.anim.splash)
        val anim2 = AnimationUtils.loadAnimation(this, R.anim.splashtwo)
        binding.favoriteTextView.startAnimation(anim2)
        binding.gamesTextView.startAnimation(anim1)

        anim1.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(Intent(this@MainActivity,GamesActivity::class.java))
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })

    }
}