package com.example.mvvm_with_retrofit

import com.example.mvvm_with_retrofit.ui.photos.model.PhotoResponse
import retrofit2.Response
import retrofit2.http.GET

interface MediaService {
    @GET("photos")
    suspend fun getPhotos():Response<MutableList<PhotoResponse>>
}