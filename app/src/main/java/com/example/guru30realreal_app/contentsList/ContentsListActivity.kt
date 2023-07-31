package com.example.guru30realreal_app.contentsList

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guru30realreal_app.R
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class ContentsListActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_tip)

        // Write a message to the database
        val database = Firebase.database
        val myRef = database.getReference("contents")

        //데이터가 파이어베이스에 잘 들어가는지 확인 후 주석처리함.
        /*myRef.push().setValue(
            ContentsModel("title1", "https://images.mypetlife.co.kr/content/uploads/2023/03/02115658/AdobeStock_19383271-1536x1024.jpeg","https://mypetlife.co.kr/144708/")
        )*/


        val rv : RecyclerView = findViewById(R.id.rv)

        //북마크에 띄울 아이템 생성(ContentsModel바탕으로 함.)
        val items = ArrayList<ContentsModel>()
        /* 데이터가 파이어베이스에 잘 들어가는지 확인 후 주석처리함.
        items.add(ContentsModel("title1", "https://images.mypetlife.co.kr/content/uploads/2023/03/02115658/AdobeStock_19383271-1536x1024.jpeg","https://mypetlife.co.kr/144708/"))
        items.add(ContentsModel("title2", "https://mypetlife.co.kr/wp-content/uploads/2019/06/adorable-animal-backyard-247937-1024x683.jpg","https://mypetlife.co.kr/32243/"))
        items.add(ContentsModel("title3", "https://images.mypetlife.co.kr/content/uploads/2020/05/09150624/12ecb492d8b24c03dc5af9da09e05678.jpg","https://mypetlife.co.kr/87306/"))
        items.add(ContentsModel("title4", "https://images.mypetlife.co.kr/content/uploads/2021/12/17143555/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B760-edited.png","https://mypetlife.co.kr/110480/"))
        items.add(ContentsModel("title5", "https://images.mypetlife.co.kr/content/uploads/2019/12/09151727/GettyImages-510961828-610x660.jpg","https://mypetlife.co.kr/70193/"))
        items.add(ContentsModel("title6", "https://images.mypetlife.co.kr/content/uploads/2022/12/09112810/AdobeStock_292378907-1536x1024.jpeg","https://mypetlife.co.kr/139763/"))
        items.add(ContentsModel("title7", "https://images.mypetlife.co.kr/content/uploads/2019/04/09153958/animal-breed-cat-205975-scaled.jpg","https://mypetlife.co.kr/26896/"))
        items.add(ContentsModel("title8", "https://images.mypetlife.co.kr/content/uploads/2023/03/23102938/AdobeStock_125073757-1-1536x1024.jpeg","https://mypetlife.co.kr/145659/"))
        items.add(ContentsModel("title9", "https://images.mypetlife.co.kr/content/uploads/2021/04/09145335/IMG_0889-1-1536x1260.jpeg","https://mypetlife.co.kr/100837/"))
        items.add(ContentsModel("title10", "https://images.mypetlife.co.kr/content/uploads/2023/07/24193039/AdobeStock_273330906-1536x1024.jpeg","https://mypetlife.co.kr/149027/"))
        items.add(ContentsModel("title11", "https://images.mypetlife.co.kr/content/uploads/2022/04/18113500/florencia-potter-yxmNWxi3wCo-unsplash-edited-scaled.jpg","https://mypetlife.co.kr/114046/"))
        items.add(ContentsModel("title12", "https://images.mypetlife.co.kr/content/uploads/2022/04/12142152/%EC%8A%AC%EA%B0%9C%EA%B3%A8.png","https://mypetlife.co.kr/113673/"))
*/
        val rvAdapter = ContentsRVAdapter(baseContext, items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this,2)

        rvAdapter.itemClick = object : ContentsRVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {
                //이미지 클릭시 해당 items의 title을 Toast메세지로 띄움
                Toast.makeText(baseContext,items[position].title, Toast.LENGTH_LONG).show()

                val intent = Intent(this@ContentsListActivity, ContentShowActivity::class.java)
                intent.putExtra("url",items[position].webUrl)
                startActivity(intent)
            }
        }
    }
}