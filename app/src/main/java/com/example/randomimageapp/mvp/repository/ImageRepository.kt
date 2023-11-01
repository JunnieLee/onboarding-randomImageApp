package com.example.randomimageapp.mvp.repository

interface ImageRepository {

    fun getRandomImage(callBack:Callback)

    interface Callback{
        fun loadImage(url:String, color:String)
    }
}