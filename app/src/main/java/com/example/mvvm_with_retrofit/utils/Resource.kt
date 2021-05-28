package com.example.mvvm_with_retrofit.utils
import com.example.mvvm_with_retrofit.ui.photos.model.PhotoResponse

sealed class Resource() {
    object ShowLoader : Resource()
    object HideLoader : Resource()
    class Success(val photoList: MutableList<PhotoResponse>) : Resource()
    class Error(val errorMessasge: String) : Resource()
    object Empty: Resource()
}