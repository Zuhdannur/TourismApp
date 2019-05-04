package studio.pro.ma.tourismapps.Api

import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import studio.pro.ma.tourismapps.Model.Responses.MessageResponses

interface ApiInterface {
    @POST("login")
    @FormUrlEncoded
    fun login(@Field("email")email:String,
              @Field("password")password:String) : Observable<MessageResponses>

    @GET("pariwisata")
    fun getPariwisata()
    companion object {
        fun create() : ApiInterface
        {
            var loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client:OkHttpClient = OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()


            val retrofit = Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("http://toured.derazu.tech/")
                .build()
            return retrofit.create(ApiInterface::class.java)
        }
    }
}