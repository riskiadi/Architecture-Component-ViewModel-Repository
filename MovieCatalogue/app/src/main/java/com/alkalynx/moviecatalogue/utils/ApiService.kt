package com.alkalynx.moviecatalogue.utils

import com.alkalynx.moviecatalogue.data.source.remote.response.MovieResponse
import com.alkalynx.moviecatalogue.data.source.remote.response.TvShowResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI4OGRjNTAxN2YxODBlZjI5Y2ZhNWM3YmM0YzNmMWE1NiIsInN1YiI6IjYwNDE5MTNlOGVmZTczMDA2ZWI5NTFlNSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.ehn-Wt-yNd4YR33LWAASnjVD5vkNnFB62GzCsXwUVGw")
    @GET("movie/popular?lang=en-US")
    fun getMovies(@Query("page") page: String): Call<MovieResponse>

    @Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI4OGRjNTAxN2YxODBlZjI5Y2ZhNWM3YmM0YzNmMWE1NiIsInN1YiI6IjYwNDE5MTNlOGVmZTczMDA2ZWI5NTFlNSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.ehn-Wt-yNd4YR33LWAASnjVD5vkNnFB62GzCsXwUVGw")
    @GET("tv/popular?lang=en-US")
    fun getTvShows(@Query("page") page: String): Call<TvShowResponse>

}
