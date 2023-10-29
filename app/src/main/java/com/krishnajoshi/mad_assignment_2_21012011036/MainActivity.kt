package com.krishnajoshi.mad_assignment_2_21012011036

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodItems = arrayOf(
            "Rasmalai Trifle",
            "White Chocolate Nuts Cups",
            "Muskmelon Sago Pudding"
        )

        val listView: ListView = findViewById(R.id.foodListView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, foodItems)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedFoodItem = foodItems[position]
            val intent = Intent(this, RecipeDetailActivity::class.java)
            intent.putExtra("foodItem", selectedFoodItem)
            startActivity(intent)
        }
    }
}

