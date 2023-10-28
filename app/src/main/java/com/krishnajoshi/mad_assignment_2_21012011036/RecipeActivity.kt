package com.krishnajoshi.mad_assignment_2_21012011036

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_activity)

        val recipeText = findViewById<TextView>(R.id.recipeText)

        val recipe = intent.getStringExtra("recipe")
        recipeText.text = recipe
    }
}