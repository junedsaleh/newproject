package com.example.amir.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class secondActivity : AppCompatActivity() {
    var item = arrayOf("Pizza","Burger","Soup","Sandwich","Salad","Drink")
    var des = arrayOf("Vegetable","Vegetable","Manchow","Garlic","Vegetable","Coca Cola")
    var img = intArrayOf(R.drawable.pizza,R.drawable.burger,R.drawable.pizza,R.drawable.sqnd,R.drawable.salad,R.drawable.cola)
    var price = intArrayOf(25,10,12,16,4,2)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var myadp = CustomAdp(this,img,item,des,price)
        findViewById<ListView>(R.id.list).adapter = myadp
    }
}
