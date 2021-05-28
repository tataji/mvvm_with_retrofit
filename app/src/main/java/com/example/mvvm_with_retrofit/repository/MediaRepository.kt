import com.example.mvvm_with_retrofit.RetrofitInstance
import com.example.mvvm_with_retrofit.ui.photos.model.PhotoResponse
import retrofit2.Response

class MediaRepository {
    init{
        println("threadname: snsRepository ${Thread.currentThread().name}")
    }

    suspend fun getPhotoApi(): Response<MutableList<PhotoResponse>> {
        return RetrofitInstance.api.getPhotos()
    }
}