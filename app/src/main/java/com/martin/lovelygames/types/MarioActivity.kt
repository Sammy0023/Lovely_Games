package com.martin.lovelygames.types

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.martin.lovelygames.R

class MarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mario)
    }
}