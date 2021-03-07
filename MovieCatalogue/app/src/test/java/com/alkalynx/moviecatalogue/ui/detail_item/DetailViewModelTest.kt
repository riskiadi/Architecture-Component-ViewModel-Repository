package com.alkalynx.moviecatalogue.ui.detail_item

import com.alkalynx.moviecatalogue.data.MovieEntity
import com.alkalynx.moviecatalogue.utils.DataDummy
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovieItem: MovieEntity = DataDummy.generateDummyMovie()[0]
    private val dummyTvShowItem: MovieEntity = DataDummy.generateDummyTvShow()[0]
    private val movieIndex = 0

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        viewModel.selectedIndex(movieIndex)
    }

    @Test
    fun getMovie() {
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(movieEntity.title, dummyMovieItem.title)
        assertEquals(movieEntity.thumbnail, dummyMovieItem.thumbnail)
        assertEquals(movieEntity.description, dummyMovieItem.description)
        assertEquals(movieEntity.releaseDate, dummyMovieItem.releaseDate)
        assertEquals(movieEntity.category, dummyMovieItem.category)
        assertEquals(movieEntity.rating, dummyMovieItem.rating)
    }

    @Test
    fun getTvShow() {
        val tvShowEntity = viewModel.getTvShow()
        assertNotNull(tvShowEntity)
        assertEquals(tvShowEntity.title, dummyTvShowItem.title)
        assertEquals(tvShowEntity.thumbnail, dummyTvShowItem.thumbnail)
        assertEquals(tvShowEntity.description, dummyTvShowItem.description)
        assertEquals(tvShowEntity.releaseDate, dummyTvShowItem.releaseDate)
        assertEquals(tvShowEntity.category, dummyTvShowItem.category)
        assertEquals(tvShowEntity.rating, dummyTvShowItem.rating)
    }
}