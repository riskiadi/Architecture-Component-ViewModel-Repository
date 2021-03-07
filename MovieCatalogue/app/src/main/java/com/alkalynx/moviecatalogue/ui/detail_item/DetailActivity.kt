package com.alkalynx.moviecatalogue.ui.detail_item

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.alkalynx.moviecatalogue.R
import com.alkalynx.moviecatalogue.data.MovieCategoryEntity
import com.alkalynx.moviecatalogue.data.MovieEntity
import com.alkalynx.moviecatalogue.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_DETAIL_MOVIE = "detail_movie"
        const val CATEGORY_MOVIE = "movie_category"
        const val CATEGORY_TV = "tv_category"
    }

    private lateinit var activityDetailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(activityDetailBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]

        val extras = intent.extras
        if(extras!=null){
            val movieCategory = extras.getParcelable<MovieCategoryEntity>(EXTRA_DETAIL_MOVIE) as MovieCategoryEntity
            with(activityDetailBinding) {

                viewModel.selectedIndex(movieCategory.index)
                val movie: MovieEntity = if(movieCategory.categoryName==CATEGORY_MOVIE) viewModel.getMovie() else viewModel.getTvShow()

                imageView.setImageResource(movie.thumbnail)
                movieTitleContent.text = movie.title
                movieReleaseContent.text = movie.releaseDate
                movieCategoryContent.text = categoriesString(movie.category)
                movieDescriptionContent.text = movie.description
                movieRatingContent.text = getString(R.string.rating_percentage, movie.rating.toString())
                ratingProgress.progress = movie.rating
                ratingProgress.progressDrawable.setTint(getColor(ratingColor(movie.rating)))
            }
        }


    }

    private fun ratingColor(count: Int): Int {
        return when {
            count in 0..25 -> {
                R.color.red
            }
            count in 26..50 -> {
                R.color.orange
            }
            else -> {
                R.color.green
            }
        }
    }

    private fun categoriesString(categories: ArrayList<String>): String{
        var temp = ""
        categories.forEachIndexed { index, element ->
            temp += element
            if (index < categories.size - 1) temp += ", "
        }
        return temp
    }

}