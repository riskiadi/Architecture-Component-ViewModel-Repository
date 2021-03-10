package com.alkalynx.moviecatalogue.utils

import android.content.Context
import com.alkalynx.moviecatalogue.data.source.remote.response.MovieResponse
import com.alkalynx.moviecatalogue.data.source.remote.response.ResultsMovieItem
import com.alkalynx.moviecatalogue.data.source.remote.response.ResultsTvItem
import com.alkalynx.moviecatalogue.data.source.remote.response.TvShowResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): MovieResponse {
        val result = ArrayList<ResultsMovieItem>()
        var page = 0
        var totalPages = 0
        var totalResults = 0
        try {
            val responseObject = JSONObject(parsingFileToString("MovieResponses.json").toString())
            val listArray = responseObject.getJSONArray("results")
            page = responseObject.getInt("page")
            totalPages = responseObject.getInt("total_pages")
            totalResults = responseObject.getInt("total_results")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val adult = movie.getBoolean("adult")
                val backdrop_path = movie.getString("backdrop_path")
                val id = movie.getInt("id")
                val original_language = movie.getString("original_language")
                val original_title = movie.getString("original_title")
                val overview = movie.getString("overview")
                val popularity = movie.getDouble("popularity")
                val poster_path = movie.getString("poster_path")
                val release_date = movie.getString("release_date")
                val title = movie.getString("title")
                val video = movie.getBoolean("video")
                val vote_average = movie.getDouble("vote_average")
                val vote_count = movie.getInt("vote_count")

                val movieResponse = ResultsMovieItem(
                    overview,
                    original_language,
                    original_title,
                    video,
                    title,
                    poster_path,
                    backdrop_path,
                    release_date,
                    popularity,
                    vote_average,
                    id,
                    adult,
                    vote_count
                )
                result.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return MovieResponse(page, totalPages, result, totalResults)
    }

    fun loadTvShows(): TvShowResponse {
        val result = ArrayList<ResultsTvItem>()
        var page = 0
        var totalPages = 0
        var totalResults = 0
        try {
            val responseObject = JSONObject(parsingFileToString("TvResponses.json").toString())

            page = responseObject.getInt("page")
            totalPages = responseObject.getInt("total_pages")
            totalResults = responseObject.getInt("total_results")

            val listArray = responseObject.getJSONArray("results")
            for (i in 0 until listArray.length()) {
                val tvShow = listArray.getJSONObject(i)

                val firstAirDate = tvShow.getString("first_air_date")
                val overview = tvShow.getString("overview")
                val originalLanguage = tvShow.getString("original_language")
                val posterPath = tvShow.getString("poster_path")
                val backdropPath = tvShow.getString("backdrop_path")
                val originalName = tvShow.getString("original_name")
                val popularity = tvShow.getDouble("popularity")
                val voteAverage = tvShow.getDouble("vote_average")
                val name = tvShow.getString("name")
                val id = tvShow.getInt("id")
                val voteCount = tvShow.getInt("vote_count")

                val tvShowResponse = ResultsTvItem(
                    firstAirDate,
                    overview,
                    originalLanguage,
                    posterPath,
                    backdropPath,
                    originalName,
                    popularity,
                    voteAverage,
                    name,
                    id,
                    voteCount
                )
                result.add(tvShowResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return TvShowResponse(page, totalPages, result, totalResults)
    }

}