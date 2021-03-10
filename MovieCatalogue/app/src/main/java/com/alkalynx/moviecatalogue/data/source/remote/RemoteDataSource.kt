package com.alkalynx.moviecatalogue.data.source.remote


import android.os.Handler
import com.alkalynx.moviecatalogue.data.source.remote.response.MovieResponse
import com.alkalynx.moviecatalogue.data.source.remote.response.TvShowResponse
import com.alkalynx.moviecatalogue.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

    private val handler = Handler()

    companion object {
        private const val SERVICE_LATENCY_IN_MILLIS: Long = 2000

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper)
            }
    }

    fun getAllMovies(callback: LoadMoviesCallback) {
        handler.postDelayed({ callback.onAllMoviesReceived(jsonHelper.loadMovies()) }, SERVICE_LATENCY_IN_MILLIS)
    }

    fun getAllTvShows(callback: LoadTvShowsCallback) {
        handler.postDelayed({ callback.onAllTvShowsReceived(jsonHelper.loadTvShows()) }, SERVICE_LATENCY_IN_MILLIS)
    }

    interface LoadMoviesCallback {
        fun onAllMoviesReceived(movieResponses: MovieResponse)
    }

    interface LoadTvShowsCallback {
        fun onAllTvShowsReceived(tvShowResponses: TvShowResponse)
    }

}
