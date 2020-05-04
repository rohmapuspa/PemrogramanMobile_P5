package ningrum.rohma.internet.api

import io.reactivex.Single
import ningrum.rohma.internet.model.Photo
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>

}