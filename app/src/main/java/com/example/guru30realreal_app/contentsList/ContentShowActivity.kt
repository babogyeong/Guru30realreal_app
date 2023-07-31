package com.example.guru30realreal_app.contentsList

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast
import com.example.guru30realreal_app.R

class ContentShowActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_show)

        val getUrl = intent.getStringExtra("url")
        val webView: WebView = findViewById(R.id.webView) //웹뷰의 아이디 받아오기
        webView.loadUrl(getUrl.toString()) // 웹뷰에 url을 STRING으로 가져오기
    }
}