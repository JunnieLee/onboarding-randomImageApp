package com.example.randomimageapp

import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ImageService {
    @Headers("Authorization: Client-ID 8k0Tb1GupXiQ5kCxAK2SBR5GcPT-3Rr85eTV_hO88nU")
    @GET("photos/random")
    fun getRandomImage(): Call<ImageResponse>

    @Headers("Authorization: Client-ID 8k0Tb1GupXiQ5kCxAK2SBR5GcPT-3Rr85eTV_hO88nU")
    @GET("photos/random")
    fun getRandomImageRx(): Single<ImageResponse>
}