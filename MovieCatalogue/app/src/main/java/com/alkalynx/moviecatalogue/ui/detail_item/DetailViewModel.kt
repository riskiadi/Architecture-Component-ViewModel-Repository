package com.alkalynx.moviecatalogue.ui.detail_item

import androidx.lifecycle.ViewModel
import com.alkalynx.moviecatalogue.data.MovieEntity
import com.alkalynx.moviecatalogue.utils.DataDummy

class DetailViewModel: ViewModel() {

    private var movieIndex:Int = 0

    fun selectedIndex(index: Int){
        movieIndex = index
    }

    fun getMovie(): MovieEntity{
        val movies = DataDummy.generateDummyMovie()
        return movies[movieIndex]
    }

    fun getTvShow(): MovieEntity{
        val tvShow = DataDummy.generateDummyTvShow()
        return tvShow[movieIndex]
    }

}