package com.uti.tugasakhirpm

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.net.Uri
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

        val btnchat = findViewById<ImageButton>(R.id.btn_chat)
        btnchat.setOnClickListener {
            val phoneNumber = "+6281272147213" // Ganti dengan nomor WhatsApp yang ingin Anda tuju
            val uri = "https://wa.me/$6281272147213"

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(uri)
            startActivity(intent)
        }
    }
}