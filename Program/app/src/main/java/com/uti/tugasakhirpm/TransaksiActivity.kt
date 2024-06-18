package com.uti.tugasakhirpm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.content.Intent


class TransaksiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transaksi)

        val gambar1: ImageView = findViewById(R.id.gambar1)
        val gambar2: ImageView = findViewById(R.id.gambar2)

        gambar1.setOnClickListener {
            val intent = Intent(this, TiketMasukActivity::class.java)
            intent.putExtra("image_id", R.drawable.pahawang1)
            startActivity(intent)
        }

        gambar2.setOnClickListener {
            val intent = Intent(this, TiketMasukSatuActivity::class.java)
            intent.putExtra("image_id", R.drawable.pahawang2)
            startActivity(intent)
        }



    }
}