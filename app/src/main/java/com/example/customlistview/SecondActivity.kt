package com.example.customlistview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val fruits =
            mutableListOf(
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = true),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = false),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = true),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = false),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = true),
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = true),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = false),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = true),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = false),
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = true),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = true),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = false),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = false),
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = false),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = true),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = true),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = true),
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = true),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = false),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = false),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = false),
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = false),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = true),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = true),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = true),
            )
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = CustomRecyclerViewAdapter(data = fruits)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}
