package com.krishnajoshi.mad_assignment_2_21012011036

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class FoodItemAdapter(private val context: Context, private val items: List<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val foodItem = getItem(position) as String
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.food_item, parent, false)
        val foodName = view.findViewById<TextView>(R.id.foodName)
        foodName.text = foodItem
        return view
    }
}