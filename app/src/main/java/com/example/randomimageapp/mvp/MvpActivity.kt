package com.example.randomimageapp.mvp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.example.randomimageapp.R
import com.example.randomimageapp.databinding.ActivityMvpBinding
import com.example.randomimageapp.mvc.ImageCountModel
import com.example.randomimageapp.mvp.repository.ImageRepositoryImpl

class MvpActivity : AppCompatActivity(), MvpContractor.View {

    private lateinit var binding:ActivityMvpBinding
    private lateinit var presenter: MvpContractor.Presentor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvpBinding.inflate(layoutInflater).also{
            setContentView(it.root)
            it.view = this
        }

        presenter = MvpPresenter(ImageCountModel(), ImageRepositoryImpl())
        presenter.attachView(this)
    }

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }

    fun loadImage(){
        presenter.loadRandomImage()
    }

    override fun showImage(url: String, color: String) {
        binding.imageView.run{
            setBackgroundColor(Color.parseColor(color))
            load(url){
                crossfade(300)
            }
        }
    }

    override fun showImageCountText(count: Int) {
        binding.imageCountTextView.text = "불러온 이미지 수 : $count"
    }
}