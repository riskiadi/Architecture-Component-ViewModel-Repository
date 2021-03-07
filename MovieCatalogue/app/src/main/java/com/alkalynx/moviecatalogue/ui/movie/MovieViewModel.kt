package com.alkalynx.moviecatalogue.ui.movie

import androidx.lifecycle.ViewModel
import com.alkalynx.moviecatalogue.data.MovieEntity
import com.alkalynx.moviecatalogue.utils.DataDummy

class MovieViewModel: ViewModel() {

    fun getMovies(): ArrayList<MovieEntity> = DataDummy.generateDummyMovie()

}