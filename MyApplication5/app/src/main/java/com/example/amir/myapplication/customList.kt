package com.example.amir.myapplication

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdp(var context:Activity,
                var img:IntArray,
                var item:Array<String>,
                var desc:Array<String>,
                var price:IntArray) :BaseAdapter(){
    override fun getCount(): Int {
        return  item.size
    }

    override fun getItemId(position: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var l_inf = context.layoutInflater
        var view = l_inf.inflate(R.layout.listitem,null,false)
        view.findViewById<ImageView>(R.id.img).setImageResource(img[position])
        view.findViewById<TextView>(R.id.item).text = item[position]
        view.findViewById<TextView>(R.id.desc).text = desc[position]
        view.findViewById<TextView>(R.id.price).text = "$${price[position].toString()}"
        return view
    }

    override fun getItem(position: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}