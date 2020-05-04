package ningrum.rohma.internet.api

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}