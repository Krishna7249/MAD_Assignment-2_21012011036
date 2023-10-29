package com.krishnajoshi.mad_assignment_2_21012011036

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RecipeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        val foodItem = intent.getSerializableExtra("foodItem") as FoodItem

        val recipeTitleTextView: TextView = findViewById(R.id.recipeTitleTextView)
        val recipeDescriptionTextView: TextView = findViewById(R.id.recipeDescriptionTextView)

        recipeTitleTextView.text = foodItem.name
        recipeDescriptionTextView.text = "Ingredients:\n" + foodItem.ingredients.joinToString("\n") + "\n\n" + foodItem.instructions
    }
}
