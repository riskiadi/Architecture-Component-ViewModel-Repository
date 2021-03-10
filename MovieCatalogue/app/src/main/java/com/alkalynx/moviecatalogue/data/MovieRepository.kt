package com.alkalynx.moviecatalogue.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.alkalynx.moviecatalogue.data.source.local.entity.ResultsMovieItem
import com.alkalynx.moviecatalogue.data.source.local.entity.ResultsTvItem
import com.alkalynx.moviecatalogue.data.source.remote.RemoteDataSource
import com.alkalynx.moviecatalogue.data.source.remote.response.MovieResponse
import com.alkalynx.moviecatalogue.data.source.remote.response.TvShowResponse

class MovieRepository private constructor(private val remoteDataSource: RemoteDataSource) : MovieDataSource {

    companion object {
        @Volatile
        private var instance: MovieRepository? = null

        fun getInstance(remoteData: RemoteDataSource): MovieRepository =
            instance ?: synchronized(this) {
                instance ?: MovieRepository(remoteData)
            }
    }

    override fun getAllMovies(): LiveData<List<ResultsMovieItem>> {
        val movieResults = MutableLiveData<List<ResultsMovieItem>>()
        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMoviesCallback {
            override fun onAllMoviesReceived(movieResponses: MovieResponse) {
                val movieList = ArrayList<ResultsMovieItem>()
                for (response in movieList) {
                    val item = ResultsMovieItem(
                        response.overview,
                        response.originalLanguage,
                        response.originalTitle,
                        response.video,
                        response.title,
                        response.posterPath,
                        response.backdropPath,
                        response.releaseDate,
                        response.popularity,
                        response.voteAverage,
                        response.id,
                        response.adult,
                        response.voteCount
                    )
                    movieList.add(item)
                }
                movieResults.postValue(movieList)
            }
        })

        return movieResults
    }

    override fun getAllTvShows(): LiveData<List<ResultsTvItem>> {
        val tvShowResults = MutableLiveData<List<ResultsTvItem>>()
        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowsCallback {
            override fun onAllTvShowsReceived(tvShowResponses: TvShowResponse) {
                val tvShowList = ArrayList<ResultsTvItem>()
                for (response in tvShowList) {
                    val item = ResultsTvItem(
                        response.firstAirDate,
                        response.overview,
                        response.originalLanguage,
                        response.posterPath,
                        response.backdropPath,
                        response.originalName,
                        response.popularity,
                        response.voteAverage,
                        response.name,
                        response.id,
                        response.voteCount
                        )
                    tvShowList.add(item)
                }
                tvShowResults.postValue(tvShowList)
            }
        })

        return tvShowResults
    }

}