package com.martin.lovelygames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.martin.lovelygames.databinding.ActivityGamesBinding
import com.martin.lovelygames.types.MarioActivity
import com.martin.lovelygames.types.PacManActivity
import com.martin.lovelygames.types.StarWarsActivity

class GamesActivity : AppCompatActivity() {

    lateinit var binding: ActivityGamesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pacmanTextView.setOnClickListener {
            startActivity(Intent(this, PacManActivity::class.java))
        }


        binding.marioTextView.setOnClickListener {
            startActivity(Intent(this, MarioActivity::class.java))
        }


        binding.starwarsTextView.setOnClickListener {
            startActivity(Intent(this, StarWarsActivity::class.java))
        }

    }
}