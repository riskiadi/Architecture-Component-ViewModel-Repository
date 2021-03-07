package com.alkalynx.moviecatalogue.data.source.remote

import com.alkalynx.moviecatalogue.data.source.remote.response.MovieResponse
import com.alkalynx.moviecatalogue.data.source.remote.response.TvShowResponse

class RemoteDataSource {

    interface LoadMoviesCallback {
        fun onAllMoviesReceived(courseResponses: List<MovieResponse>)
    }

    interface LoadTvShowsCallback {
        fun onAllTvShowsReceived(moduleResponses: List<TvShowResponse>)
    }

}