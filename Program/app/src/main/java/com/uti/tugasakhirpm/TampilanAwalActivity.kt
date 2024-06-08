package com.uti.tugasakhirpm

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TampilanAwalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tampilan_awal)

        val btnberanda= findViewById<ImageButton>(R.id.btn_beranda)
        btnberanda.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)

        }

        val btntransaksi = findViewById<ImageButton>(R.id.btn_transaksi)
        btntransaksi.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)

        }
    }
}