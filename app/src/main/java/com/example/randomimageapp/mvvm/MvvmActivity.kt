package com.example.randomimageapp.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.randomimageapp.R
import com.example.randomimageapp.databinding.ActivityMvvmBinding
import com.example.randomimageapp.mvvm.repository.ImageRepositoryImpl

class MvvmActivity : AppCompatActivity() {

    private val viewModel: MvvmViewModel by viewModels {
        MvvmViewModel.MvvmViewModelFactory(ImageRepositoryImpl())
    }

    private lateinit var binding: ActivityMvvmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvvmBinding.inflate(layoutInflater).also{
            setContentView(it.root)
            it.lifecycleOwner = this // live data를 사용할꺼기 때문에 lifecycleOwner를 등록해줘야함
            it.view = this
            it.viewModel = viewModel
        }
    }

    fun loadImage(){
        viewModel.loadRandomImage()
    }
}