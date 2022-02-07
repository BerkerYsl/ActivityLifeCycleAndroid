package com.berkeruysal.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        //main'de gönderilen değerleri on create altında alacağız ki sayfa yüklenirken değerler gelsin
        var intent=intent
        var username=intent.getStringExtra("username")
        var name=intent.getStringExtra("name")

        textView.text="Username: $username"
        textView2.text="Name: $name"

    }
}