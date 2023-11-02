package com.example.randomimageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.randomimageapp.databinding.ActivityMainBinding
import com.example.randomimageapp.mvc.MvcActivity
import com.example.randomimageapp.mvp.MvpActivity

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
        startActivity(Intent(this, MvcActivity::class.java))
    }
    fun openMvp(){
        startActivity(Intent(this, MvpActivity::class.java))
    }
    fun openMvvm(){

    }
    fun openMvi(){

    }
}