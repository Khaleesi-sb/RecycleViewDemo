package com.example.customlistview

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        listView = findViewById(R.id.listView)

        // Array Adapter

        /*
        val arrayOfFruits = mutableListOf("Mango", "Banana", "Apple", "Orange", "Grapes", "Watermelon")
        val adapter =
            ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_checked,
                android.R.id.text1,
                arrayOfFruits,
            )
        adapter.add("hello")
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked on ${arrayOfFruits[position]}", Toast.LENGTH_LONG).show()
        }
        listView.adapter = adapter
         */

        // Simple adapter

        /*
        val fruitsItem =
            listOf(
                mapOf("name" to "Mango", "price" to "10"),
                mapOf("name" to "Banana", "price" to "20"),
                mapOf("name" to "Apple", "price" to "30"),
                mapOf("name" to "Orange", "price" to "40"),
            )
        val simpleAdapter =
            SimpleAdapter(
                this,
                fruitsItem,
                android.R.layout.simple_list_item_2,
                arrayOf("name", "price"),
                intArrayOf(android.R.id.text1, android.R.id.text2),
            )
        listView.adapter = simpleAdapter
        listView.setOnItemClickListener { parent, _, index, _ ->
            val item = parent.getItemAtPosition(index) as Map<*, *>
            val name = item["name"]
            val price = item["price"]
            Toast
                .makeText(
                    this,
                    "Clicked on $name with price $price",
                    Toast.LENGTH_LONG,
                ).show()
        }
         */

        // Custom adapter
        val fruits =
            mutableListOf<Fruits>(
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = true),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = true),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = true),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = true),
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = true),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = true),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = true),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = true),
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = true),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = true),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = true),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = true),
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = true),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = true),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = true),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = true),
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = true),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = true),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = true),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = true),
                Fruits(name = "Mango", image = R.drawable.mango, price = 10.0, quantity = 15, isFresh = true),
                Fruits(name = "Banana", image = R.drawable.banana, price = 20.5, quantity = 25, isFresh = true),
                Fruits(name = "Apple", image = R.drawable.apple, price = 30.69, quantity = 35, isFresh = true),
                Fruits(name = "Lichi", image = R.drawable.lichi, price = 40.0, quantity = 35, isFresh = true),
                Fruits(name = "Grape", image = R.drawable.grape, price = 15.0, quantity = 35, isFresh = true),
            )
        val adapter = CustomAdapter(this, fruits)
        listView.adapter = adapter
        listView.setOnItemClickListener { _, _, index, _ ->
            Toast.makeText(this, fruits[index].name, Toast.LENGTH_LONG).show()
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
