package com.example.guru30realreal_app.contentsList

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guru30realreal_app.R

class ContentsListActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_tip)

        val rv : RecyclerView = findViewById(R.id.rv)

        val items = ArrayList<ContentsModel>()
        items.add(ContentsModel("title1", "https://images.mypetlife.co.kr/content/uploads/2023/03/02115658/AdobeStock_19383271-1536x1024.jpeg"))
        items.add(ContentsModel("title2", "https://mypetlife.co.kr/wp-content/uploads/2019/06/adorable-animal-backyard-247937-1024x683.jpg"))
        items.add(ContentsModel("title3", "https://images.mypetlife.co.kr/content/uploads/2020/05/09150624/12ecb492d8b24c03dc5af9da09e05678.jpg"))
        items.add(ContentsModel("title4", "https://images.mypetlife.co.kr/content/uploads/2021/12/17143555/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B760-edited.png"))
        items.add(ContentsModel("title5", "https://images.mypetlife.co.kr/content/uploads/2019/12/09151727/GettyImages-510961828-610x660.jpg"))
        items.add(ContentsModel("title6", "https://images.mypetlife.co.kr/content/uploads/2022/12/09112810/AdobeStock_292378907-1536x1024.jpeg"))
        items.add(ContentsModel("title7", "https://images.mypetlife.co.kr/content/uploads/2019/04/09153958/animal-breed-cat-205975-scaled.jpg"))
        items.add(ContentsModel("title8", "https://images.mypetlife.co.kr/content/uploads/2023/03/23102938/AdobeStock_125073757-1-1536x1024.jpeg"))
        items.add(ContentsModel("title9", "https://images.mypetlife.co.kr/content/uploads/2021/04/09145335/IMG_0889-1-1536x1260.jpeg"))
        items.add(ContentsModel("title10", "https://images.mypetlife.co.kr/content/uploads/2023/07/24193039/AdobeStock_273330906-1536x1024.jpeg"))
        items.add(ContentsModel("title11", "https://images.mypetlife.co.kr/content/uploads/2022/04/18113500/florencia-potter-yxmNWxi3wCo-unsplash-edited-scaled.jpg"))
        items.add(ContentsModel("title12", "https://images.mypetlife.co.kr/content/uploads/2022/04/12142152/%EC%8A%AC%EA%B0%9C%EA%B3%A8.png"))

        val rvAdapter = ContentsRVAdapter(baseContext, items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this,2)
    }
}