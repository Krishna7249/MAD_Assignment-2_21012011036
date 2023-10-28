package com.krishnajoshi.mad_assignment_2_21012011036

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodList = findViewById<ListView>(R.id.foodList)

        val items = listOf(
            "Food Item 1",
            "Food Item 2",
            // Add more food items here
        )

        /*val adapter = FoodItemAdapter(this, items)
        foodList.adapter = adapter
        foodList.setOnItemClickListener { _, _, position, _ ->
            val selectedFoodItem = items[position]
            val intent = Intent(this, RecipeActivity::class.java)
            intent.putExtra("recipe", selectedFoodItem.recipe)
            startActivity(intent)
        }*/

    }
}