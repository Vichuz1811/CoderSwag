package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataServices {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Dev green hat","Rs200","hat1"),
        Product("Dev black hat","Rs300","hat2"),
        Product("Dev blue hat","Rs250","hat3"),
        Product("Dev red hat","Rs100","hat4"),
        Product("Dev green hat","Rs200","hat1"),
        Product("Dev black hat","Rs300","hat2"),
        Product("Dev blue hat","Rs250","hat3"),
        Product("Dev red hat","Rs100","hat4"),
        Product("Dev green hat","Rs200","hat1"),
        Product("Dev black hat","Rs300","hat2"),
        Product("Dev blue hat","Rs250","hat3"),
        Product("Dev red hat","Rs100","hat4")
    )


    val shirts = listOf(
        Product("Dev green shirt","Rs2300","shirt1"),
        Product("Dev black shirt","Rs3000","shirt2"),
        Product("Dev blue shirt","Rs2500","shirt3"),
        Product("Dev red shirt","Rs1000","shirt4"),
        Product("Dev green shirt","Rs2300","shirt1"),
        Product("Dev black shirt","Rs3000","shirt2"),
        Product("Dev blue shirt","Rs2500","shirt3"),
        Product("Dev red shirt","Rs1000","shirt4"),
        Product("Dev green shirt","Rs2300","shirt1"),
        Product("Dev black shirt","Rs3000","shirt2"),
        Product("Dev blue shirt","Rs2500","shirt3"),
        Product("Dev red shirt","Rs1000","shirt4")
    )

    val hoodies = listOf(
        Product("Dev green hoodie","Rs700","hoodie1"),
        Product("Dev black hoodie","Rs800","hoodie2"),
        Product("Dev blue hoodie","Rs500","hoodie3"),
        Product("Dev red hoodie","Rs1000","hoodie4"),
        Product("Dev green hoodie","Rs700","hoodie1"),
        Product("Dev black hoodie","Rs800","hoodie2"),
        Product("Dev blue hoodie","Rs500","hoodie3"),
        Product("Dev red hoodie","Rs1000","hoodie4"),
        Product("Dev green hoodie","Rs700","hoodie1"),
        Product("Dev black hoodie","Rs800","hoodie2"),
        Product("Dev blue hoodie","Rs500","hoodie3"),
        Product("Dev red hoodie","Rs1000","hoodie4")
    )

    val digitalgoods = listOf<Product>()

    fun  getProducts(category: String) : List<Product> {
    return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalgoods
        }
    }

}