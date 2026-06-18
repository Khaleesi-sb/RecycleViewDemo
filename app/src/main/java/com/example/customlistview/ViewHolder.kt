package com.example.customlistview

import android.graphics.Color
import android.widget.ImageView
import android.widget.TextView

data class ViewHolder(
    val image: ImageView,
    val name: TextView,
    val quantity: TextView,
    val price: TextView,
    val color: Color? = null,
)
