package com.example.guru30realreal_app.contentsList

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guru30realreal_app.R

class ContentsListActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_tip)

        val rv : RecyclerView = findViewById(R.id.rv)

        val items = ArrayList<ContentsModel>()
        items.add(ContentsModel("imageUrl1", "title1"))
        items.add(ContentsModel("imageUrl2", "title2"))
        items.add(ContentsModel("imageUrl3", "title3"))

        val rvAdapter = ContentsRVAdapter(items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this,2)
    }
}