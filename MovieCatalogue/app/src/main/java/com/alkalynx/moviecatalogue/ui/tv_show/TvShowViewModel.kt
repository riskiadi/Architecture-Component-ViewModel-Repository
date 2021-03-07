package com.alkalynx.moviecatalogue.ui.tv_show

import androidx.lifecycle.ViewModel
import com.alkalynx.moviecatalogue.data.MovieEntity
import com.alkalynx.moviecatalogue.utils.DataDummy

class TvShowViewModel: ViewModel() {

    fun getTvShow(): ArrayList<MovieEntity> = DataDummy.generateDummyTvShow()

}