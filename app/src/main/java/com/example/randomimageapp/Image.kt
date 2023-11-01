package com.example.randomimageapp

data class ImageResponse(
    val id:String,
    val urls:UrlResponse,
    val color:String
)

data class UrlResponse(
    val raw:String,
    val full:String,
    val regular:String,
    var small:String,
    val thumb: String,
)