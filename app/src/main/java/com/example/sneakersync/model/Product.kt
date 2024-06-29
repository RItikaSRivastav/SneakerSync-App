package com.example.sneakersync.model

import android.media.Rating
import androidx.annotation.DrawableRes
import androidx.annotation.Size
import androidx.compose.ui.graphics.Color

data class Product (
      var  id : String,
      var name : String,
      var color : Color,
      var price : Float,
      var dicountPrice : Float,
      var size: Int,
      var rating: Float,
  @DrawableRes val imageRes : Int
  )
