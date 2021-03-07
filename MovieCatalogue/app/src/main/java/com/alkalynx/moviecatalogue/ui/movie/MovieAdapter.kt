package com.alkalynx.moviecatalogue.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alkalynx.moviecatalogue.data.MovieCategoryEntity
import com.alkalynx.moviecatalogue.data.MovieEntity
import com.alkalynx.moviecatalogue.databinding.ItemMovieBinding
import com.alkalynx.moviecatalogue.ui.detail_item.DetailActivity

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private val listMovie = ArrayList<MovieEntity>()

    fun setMovies(movies: ArrayList<MovieEntity>?) {
        if (movies == null) return
        listMovie.clear()
        listMovie.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MovieViewHolder {
        val itemMovieBinding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie, position)
    }

    override fun getItemCount(): Int = listMovie.size

    inner class MovieViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity, index: Int) {
            with(binding){
                movieThumbnail.setImageResource(movie.thumbnail)
                movieTitle.text = movie.title
                movieDescription.text = movie.description
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DETAIL_MOVIE, MovieCategoryEntity(index, DetailActivity.CATEGORY_MOVIE))
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

}