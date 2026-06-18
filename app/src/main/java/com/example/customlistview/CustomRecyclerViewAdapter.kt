package com.example.customlistview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerViewAdapter(
    var data: MutableList<Fruits>,
) : RecyclerView.Adapter<CustomRecyclerViewAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RecyclerViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(
                R.layout.fruits_row,
                parent,
                false,
            )
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: RecyclerViewHolder,
        position: Int,
    ) {
        val item = data[position]
        holder.image.setImageResource(item.image)
        holder.fruitName.text = item.name
        holder.fruitQuality.text = item.quantity.toString()
        holder.fruitPrice.text = item.price.toString()
        holder.fruitCard.setCardBackgroundColor(
            if (item.isFresh) {
                "#AEFFAC".toColorInt()
            } else {
                "#FFD3AC".toColorInt()
            },
        )
    }

    override fun getItemCount(): Int = data.size

    class RecyclerViewHolder(
        itemView: View,
    ) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imageView)
        val fruitName: TextView = itemView.findViewById(R.id.fruitName)
        val fruitQuality: TextView = itemView.findViewById(R.id.fruitQuantity)
        val fruitPrice: TextView = itemView.findViewById(R.id.fruitPrice)
        val fruitCard: CardView = itemView.findViewById(R.id.cardView)
    }
}
