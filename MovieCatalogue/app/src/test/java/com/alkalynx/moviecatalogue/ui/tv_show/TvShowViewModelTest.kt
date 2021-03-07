package com.alkalynx.moviecatalogue.ui.tv_show

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setup(){
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShow() {
        val movieEntity = viewModel.getTvShow()
        assertNotNull(movieEntity)
        assertEquals(10, movieEntity.size)
    }
}