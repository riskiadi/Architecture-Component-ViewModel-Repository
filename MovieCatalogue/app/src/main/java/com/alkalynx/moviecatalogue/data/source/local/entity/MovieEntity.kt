package com.alkalynx.moviecatalogue.data.source.local.entity

data class MovieEntity(
    var thumbnail:Int,
    var title:String,
    var description:String,
    var releaseDate:String,
    var category:ArrayList<String>,
    var rating:Int,
)
