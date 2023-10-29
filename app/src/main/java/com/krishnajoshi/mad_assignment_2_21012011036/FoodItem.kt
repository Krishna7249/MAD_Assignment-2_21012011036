package com.krishnajoshi.mad_assignment_2_21012011036

data class FoodItem(
    val name: String,
    val description: String,
    val ingredients: List<String>,
    val instructions: String
)

val foodItems = listOf(
    FoodItem(
        "Rasmalai Trifle",
        "Receipe1",
        listOf(
            "½ cup chilled sweetened heavy whipping cream",
            "15-20 saffron strands (soaked in 1 tablespoon milk)",
            "½ teaspoon cardamom powder",
            "½ cup rabdi",
            "5-6 drops rasmalai essence (optional)",
            "1 cup crumbled sponge cake",
            "6 chopped rasmalai with milk",
            "2 tablespoons powdered pistachios",
            "mini rasmalai for garnishing"
        ),
        "Instructions:\n" +
                "Make The Cream\n" +
                "1. Whip the heavy cream using a hand mixer until stiff peaks are formed.\n" +
                "2. Gently fold in saffron soaked in milk, cardamom powder, rabdi, and rasmalai essence.\n" +
                "3. Transfer the cream to a piping bag fitted with a large nozzle.\n" +
                "Assemble The Dessert\n" +
                "1. Add ¼ cup of crumbled cake to a small serving glass or bowl and spread it evenly.\n" +
                "2. Top with some chopped rasmalai and drizzle a few tablespoons of rasmalai milk all over.\n" +
                "3. Pipe the cream on top until the glass is almost full.\n" +
                "4. Garnish with pistachio powder and mini rasmalai.\n" +
                "Assemble all the trifles in the same manner.\n" +
                "Serve chilled.\n\n" +
                "Notes: Instead of assembling the dessert in individual serving glasses, you can assemble it in a large tray and save some more time."
    ),
    FoodItem(
        "White Chocolate Nuts Cups",
        "Receipe2",
        listOf(
            "1 cup chopped white chocolate",
            "5-6 almonds (halved)",
            "5-6 cashew nuts (halved)",
            "5-6 pistachios (halved)",
            "1 teaspoon dried rose petals"
        ),
        "Instructions:\n" +
                "1. Dry roast almonds, cashew nuts, and pistachios over medium heat for 3-4 minutes, stirring frequently.\n" +
                "2. Remove the pan from the heat and set aside.\n" +
                "3. Add the chocolate to a bowl and microwave it for 30 seconds. Stir it and microwave for another 30 seconds.\n" +
                "4. Keep repeating this process until the chocolate is melted and smooth and shiny.\n" +
                "5. Pour the melted chocolate into mini cupcake molds until they are half full.\n" +
                "6. Top with chopped nuts and dried rose petals.\n" +
                "7. Refrigerate for 2 minutes. Un-mold and serve.\n\n" +
                "Notes: Double or triple the recipe if making for a bigger crowd."
    ),
    FoodItem(
        "Muskmelon Sago Pudding",
        "Receipe3",
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
    )
)

