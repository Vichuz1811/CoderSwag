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
        Product("Dev green hat","Rs200","hat01"),
        Product("Dev black hat","Rs300","hat02"),
        Product("Dev blue hat","Rs250","hat03"),
        Product("Dev red hat","Rs100","hat04")
    )


    val shirts = listOf(
        Product("Dev green shirt","Rs2300","shirt01"),
        Product("Dev black shirt","Rs3000","shirt2"),
        Product("Dev blue shirt","Rs2500","shirt03"),
        Product("Dev red shirt","Rs1000","shirt04")
    )

    val hoodies = listOf(
        Product("Dev green hoodie","Rs700","hoodie01"),
        Product("Dev black hoodie","Rs800","hoodie02"),
        Product("Dev blue hoodie","Rs500","hoodie03"),
        Product("Dev red hoodie","Rs1000","hoodie04")
    )
}