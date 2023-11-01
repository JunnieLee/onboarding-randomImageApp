package com.example.randomimageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.randomimageapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also{
            setContentView(it.root)
            it.view = this // 뷰쪽에 선언한 variable 연결
        }
    }

    fun openMvc(){

    }
    fun openMvp(){

    }
    fun openMvvm(){

    }
    fun openMvi(){

    }
}