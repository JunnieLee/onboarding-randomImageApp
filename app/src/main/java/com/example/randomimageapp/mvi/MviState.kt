package com.example.randomimageapp.mvi

import com.example.randomimageapp.mvi.model.Image

sealed class MviState{
    object Idle : MviState()
    object Loading : MviState()
    data class LoadedImage(val image: Image, val count:Int) : MviState()
}
