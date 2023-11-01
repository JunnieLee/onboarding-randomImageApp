package com.example.randomimageapp.mvp.repository

import com.example.randomimageapp.ImageResponse
import com.example.randomimageapp.RetrofitManager
import retrofit2.Call
import retrofit2.Response

class ImageRepositoryImpl : ImageRepository {
    override fun getRandomImage(callBack: ImageRepository.Callback) {
        RetrofitManager.imageService.getRandomImage()
            .enqueue(object:retrofit2.Callback<ImageResponse>{
                override fun onResponse(
                    call: Call<ImageResponse>,
                    response: Response<ImageResponse>
                ) {
                    if (response.isSuccessful){
                        response.body()?.let{
                            callBack.loadImage(it.urls.regular, it.color)
                        }
                    }
                }
                override fun onFailure(call: Call<ImageResponse>, t: Throwable) {
                    t.printStackTrace()
                }
            })
    }

}