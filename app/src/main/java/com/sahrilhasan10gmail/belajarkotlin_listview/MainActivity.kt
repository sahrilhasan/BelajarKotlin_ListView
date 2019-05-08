package com.sahrilhasan10gmail.belajarkotlin_listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.R.layout.simple_list_item_1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data yang digunkan->array
        val languages =
            //mendeklarasikan variabel languages
            listOf("Java","Kotlin","Javascript","PHP","Pyhton")
        //mmendeklarasikan  list dan mengisi konten adapter
        lv_languages.adapter = ArrayAdapter(this,simple_list_item_1, languages)
        //membuat simple list view

        //deklarasikan event click listener
        lv_languages.setOnItemClickListener {parent, view,position, id ->
            Toast.makeText(this, "Anda memilih :${languages[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}
