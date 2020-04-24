package com.example.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    override fun getView(postion: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val Holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            Holder = ViewHolder()
            Holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            Holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = Holder
        }

        else {
            Holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[postion]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        Holder.categoryImage?.setImageResource(resourceId)
        Holder.categoryName?.text = category.title

        return categoryView
    }

    override fun getItem(postion: Int): Any {
        return categories[postion]
    }

    override fun getItemId(postion: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? =null
    }

}