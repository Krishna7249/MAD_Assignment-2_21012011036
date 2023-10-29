package com.krishnajoshi.mad_assignment_2_21012011036

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RecipeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        val recipeName = intent.getStringExtra("recipeName")

        val recipeTitleTextView: TextView = findViewById(R.id.recipeTitleTextView)
        val recipeDescriptionTextView: TextView = findViewById(R.id.recipeDescriptionTextView)

        val selectedFoodItem = foodItems.find { it.name == recipeName }

        if (selectedFoodItem != null) {
            recipeTitleTextView.text = selectedFoodItem.name
            recipeDescriptionTextView.text = "Ingredients:\n" +
                    selectedFoodItem.ingredients.joinToString("\n") + "\n\n" +
                    selectedFoodItem.instructions
        }
    }
}
