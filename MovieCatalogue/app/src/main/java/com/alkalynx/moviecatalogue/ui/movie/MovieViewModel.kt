package com.alkalynx.moviecatalogue.ui.movie

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alkalynx.moviecatalogue.data.source.local.entity.MovieEntity
import com.alkalynx.moviecatalogue.data.source.remote.response.MovieResponse
import com.alkalynx.moviecatalogue.data.source.remote.response.ResultsMovieItem
import com.alkalynx.moviecatalogue.utils.ApiConfig
import com.alkalynx.moviecatalogue.utils.DataDummy
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieViewModel: ViewModel() {

    //fun getMovies(): ArrayList<MovieEntity> = DataDummy.generateDummyMovie()

    // ========== new

    private val _movies = MutableLiveData<List<ResultsMovieItem?>?>()
    val movies: LiveData<List<ResultsMovieItem?>?> = _movies

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    companion object{
        private const val TAG = "MovieViewModel"
        private const val MOVIE_ID = "1"
    }

    fun getMovies(){
        _isLoading.value = true
        val client = ApiConfig.getApiService().getMovies(MOVIE_ID)
        client.enqueue(object: Callback<MovieResponse> {
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                _isLoading.value = false
                if (response.isSuccessful) {
                    _movies.value = response.body()?.results
                } else {
                    Log.e(TAG, "onFailure: ${response.message()}")
                }
            }
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                _isLoading.value = false
                Log.e(TAG, "onFailure: ${t.message.toString()}")
            }
        })
    }

}