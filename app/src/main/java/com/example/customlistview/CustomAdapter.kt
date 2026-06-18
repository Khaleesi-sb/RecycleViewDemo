package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(
    val context: Context,
    val list: MutableList<Fruits>,
) : BaseAdapter() {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?,
    ): View {
        var view: View
        var viewHolder: ViewHolder
        if (convertView != null) {
            view = convertView
            viewHolder = view.tag as ViewHolder
        } else {
            view =
                LayoutInflater.from(context).inflate(
                    R.layout.fruits_row,
                    parent,
                    false,
                )
            viewHolder =
                ViewHolder(
                    image = view.findViewById(R.id.imageView),
                    name = view.findViewById(R.id.fruitName),
                    price = view.findViewById(R.id.fruitPrice),
                    quantity = view.findViewById(R.id.fruitQuantity),
                )
            view.tag = viewHolder
        }
        val fruit = list[position]
        viewHolder.image.setImageResource(fruit.image)
        viewHolder.name.text = fruit.name
        viewHolder.price.text = "Rs. " + fruit.price.toString()
        viewHolder.quantity.text = fruit.quantity.toString() + " kg"
        return view
    }
}
