package ningrum.rohma.internet.api

class PhotosService {
    private val BASE_URL = "https://jsonplaceholder.typicode.com/"
    private val api: PhotosApi

    init {
        api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(PhotosApi::class.java)
    }

    fun getPhotos(): Single<List<Photo>> {
        return api.getPhotos()
    }
}