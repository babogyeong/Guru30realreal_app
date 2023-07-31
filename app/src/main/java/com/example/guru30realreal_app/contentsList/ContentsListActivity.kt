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
        items.add(ContentsModel("https://images.mypetlife.co.kr/content/uploads/2023/03/02115658/AdobeStock_19383271-1536x1024.jpeg", "title1"))
        items.add(ContentsModel("https://mypetlife.co.kr/wp-content/uploads/2019/06/adorable-animal-backyard-247937-1024x683.jpg", "title2"))
        items.add(ContentsModel("https://images.mypetlife.co.kr/content/uploads/2020/05/09150624/12ecb492d8b24c03dc5af9da09e05678.jpg", "title3"))

        val rvAdapter = ContentsRVAdapter(items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this,2)
    }
}