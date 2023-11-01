package com.example.randomimageapp.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.randomimageapp.R
import com.example.randomimageapp.databinding.ActivityMvpBinding

class MvpActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMvpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvpBinding.inflate(layoutInflater).also{
            setContentView(it.root)
            it.view = this
        }
    }

    fun loadImage(){

    }
}