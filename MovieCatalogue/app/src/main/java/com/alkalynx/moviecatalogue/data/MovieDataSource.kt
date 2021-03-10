package com.alkalynx.moviecatalogue.data
import androidx.lifecycle.LiveData
import com.alkalynx.moviecatalogue.data.source.local.entity.ResultsMovieItem

interface MovieDataSource {
    fun getAllMovies(): LiveData<List<ResultsMovieItem>>
    fun getAllTvShows(): LiveData<List<ResultsMovieItem>>
}