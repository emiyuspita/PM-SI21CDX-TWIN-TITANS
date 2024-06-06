package com.uti.tugasakhirpm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.ImageView
import androidx.core.view.WindowInsetsCompat
import android.content.Intent;
import android.net.Uri;


class BerandaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_beranda)

        val imageView1: ImageView = findViewById(R.id.img_igg)
        imageView1.setOnClickListener {
            val url = "https://www.instagram.com/pahawang.island.lampung"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val imageView2: ImageView = findViewById(R.id.img_mapp)
        imageView2.setOnClickListener {
            val url = "https://maps.app.goo.gl/UXZFEvKzp5gCYnRE9"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val imageView4: ImageView = findViewById(R.id.img_cuaca)
        imageView4.setOnClickListener {
            val url = "https://www.weather.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
        }
    }
