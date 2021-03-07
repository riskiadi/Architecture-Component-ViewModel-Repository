package com.alkalynx.moviecatalogue.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieCategoryEntity(
    var index:Int,
    var categoryName:String,
):Parcelable
