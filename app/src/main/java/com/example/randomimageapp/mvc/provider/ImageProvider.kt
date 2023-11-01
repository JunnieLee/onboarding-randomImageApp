package com.example.randomimageapp.mvc.provider

import com.example.randomimageapp.ImageResponse
import com.example.randomimageapp.RetrofitManager
import retrofit2.Call
import retrofit2.Response

class ImageProvider(private val callback:Callback) {

    fun getRandomImage(){
        RetrofitManager.imageService.getRandomImage()
            .enqueue(object :retrofit2.Callback<ImageResponse>{
                override fun onResponse(
                    call: Call<ImageResponse>,
                    response: Response<ImageResponse>
                ) {
                    if (response.isSuccessful){
                        response.body()?.let{
                            callback.loadImage(it.urls.regular, it.color)
                        }
                    }
                }
                override fun onFailure(call: Call<ImageResponse>, t: Throwable) {
                    t.printStackTrace()
                }

            })
    }

    interface Callback {
        fun loadImage(url:String, color:String)
    }
}