package com.example.randomimageapp.mvi.repository

import com.example.randomimageapp.mvi.model.Image

interface ImageRepository {
    suspend fun getRandomImage(): Image
}