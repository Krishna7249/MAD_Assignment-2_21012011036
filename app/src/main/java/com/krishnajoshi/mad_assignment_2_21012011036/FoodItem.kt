package com.krishnajoshi.mad_assignment_2_21012011036

data class FoodItem(
    val name: String,
    val description: String,
    val ingredients: List<String>,
    val instructions: String
){
    val foodItems = listOf(
        FoodItem(
            "Muskmelon Sago Pudding",
            "Description 3",
            listOf(
                "2 musk melon",
                "2 teaspoons sabja seeds (basil seeds)",
                "1 cup water (divided, plus more for soaking, cooking, etc.)",
                "0.5 cup sago pearls (sabudana, tapioca pearls)",
                "2 tablespoons custard powder",
                "4 cups whole milk (full-fat milk)",
                "0.5 cup sweetened condensed milk"
            ),
            "Instructions:\n" +
                    "1. Make Musk Melon Puree\n" +
                    "2. Soak The Basil Seeds\n" +
                    "3. Cook The Sago\n" +
                    "4. Make The Custard\n" +
                    "5. Assembly"
        ),
        // Add more food items with ingredients and instructions
    )

}