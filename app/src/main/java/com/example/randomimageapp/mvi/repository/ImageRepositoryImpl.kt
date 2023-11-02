package com.example.randomimageapp.mvi.repository

import com.example.randomimageapp.RetrofitManager
import com.example.randomimageapp.mvi.model.Image
import com.example.randomimageapp.mvi.repository.ImageRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ImageRepositoryImpl(private val dispatcher:CoroutineDispatcher = Dispatchers.IO) : ImageRepository {
    override suspend fun getRandomImage()
     = withContext(dispatcher){
         RetrofitManager.imageService.getRandomImageSuspend().let{
             Image(it.urls.regular, it.color)
         }
    }
}