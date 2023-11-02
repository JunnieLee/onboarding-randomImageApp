package com.example.randomimageapp.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.randomimageapp.R
import com.example.randomimageapp.databinding.ActivityMvvmBinding

class MvvmActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMvvmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvvmBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}