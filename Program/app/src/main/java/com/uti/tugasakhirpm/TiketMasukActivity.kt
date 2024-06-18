package com.uti.tugasakhirpm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TiketMasukActivity : AppCompatActivity() {

    private lateinit var txt_name: EditText
    private lateinit var txt_No: EditText
    private lateinit var txt_tiket : EditText
    private lateinit var txt_tgl:   EditText
    private lateinit var txt_alamat: EditText
    private lateinit var txt_catatan: EditText
    private lateinit var txt_total : TextView
    private lateinit var btn_pesan : Button
    private val TICKET_PRICE = 80000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tiket_masuk)

        txt_name = findViewById(R.id.txt_name)
        txt_No = findViewById(R.id.txt_No)
        txt_tiket = findViewById(R.id.txt_tiket)
        txt_tgl = findViewById(R.id.txt_tgl)
        txt_alamat = findViewById(R.id.txt_alamat)
        txt_catatan = findViewById(R.id.txt_catatan)
        txt_total = findViewById(R.id.txt_total)
        btn_pesan = findViewById(R.id.btn_pesan)


        btn_pesan.setOnClickListener {
            calculalatetotal()
        }
    }

    private fun calculalatetotal() {
        val ticketCountStr = txt_tiket.text.toString()
        if (ticketCountStr.isNotEmpty()) {
            val ticketCount = ticketCountStr.toInt()
            val totalPrice = ticketCount * TICKET_PRICE
            txt_total.text = "Total Harga: Rp $totalPrice"
        } else {
            txt_total.text = "Total Harga: Rp 0"
        }


    }
}