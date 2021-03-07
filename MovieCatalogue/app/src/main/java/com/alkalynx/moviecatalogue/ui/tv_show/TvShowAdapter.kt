package com.alkalynx.moviecatalogue.ui.tv_show

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alkalynx.moviecatalogue.data.MovieCategoryEntity
import com.alkalynx.moviecatalogue.data.MovieEntity
import com.alkalynx.moviecatalogue.databinding.ItemMovieBinding
import com.alkalynx.moviecatalogue.ui.detail_item.DetailActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    private val listTvShow = ArrayList<MovieEntity>()

    fun setTvShows(tvShows: ArrayList<MovieEntity>?) {
        if (tvShows == null) return
        listTvShow.clear()
        listTvShow.addAll(tvShows)
    }

    override fun getItemCount(): Int = listTvShow.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowAdapter.TvShowViewHolder {
        val itemMovieBinding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: TvShowAdapter.TvShowViewHolder, position: Int) {
        val tvShow = listTvShow[position]
        holder.bind(tvShow, position)
    }

    inner class TvShowViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: MovieEntity, index: Int) {
            with(binding) {
                movieThumbnail.setImageResource(tvShow.thumbnail)
                movieTitle.text = tvShow.title
                movieDescription.text = tvShow.description
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DETAIL_MOVIE, MovieCategoryEntity(index, DetailActivity.CATEGORY_TV))
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

}