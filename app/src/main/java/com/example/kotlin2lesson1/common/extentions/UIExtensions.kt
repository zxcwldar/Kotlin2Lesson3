package com.example.kotlin2lesson1.common.extentions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImageWithGlide(url: String) = Glide.with(this).load(url).into(this)
