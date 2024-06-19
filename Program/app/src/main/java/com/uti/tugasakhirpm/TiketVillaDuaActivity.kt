package com.uti.tugasakhirpm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast
import android.widget.EditText
import android.widget.TextView
class TiketVillaDuaActivity : AppCompatActivity() {
        private lateinit var txt_name: EditText
        private lateinit var txt_no: EditText
        private lateinit var txt_checkin : EditText
        private lateinit var txt_checkout:   EditText
        private lateinit var txt_tiket : EditText
        private lateinit var txt_permintaan : EditText
        private lateinit var txt_alamat: EditText
        private lateinit var txt_total : TextView
        private lateinit var btn_pesan : Button
        private val TICKET_PRICE = 950000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tiket_villa_dua)
        txt_name = findViewById(R.id.txt_name)
        txt_no = findViewById(R.id.txt_no)
        txt_checkin = findViewById(R.id.txt_checkin)
        txt_checkout = findViewById(R.id.txt_checkout)
        txt_tiket = findViewById(R.id.txt_tiket)
        txt_permintaan = findViewById(R.id.txt_permintaan)
        txt_alamat = findViewById(R.id.txt_alamat)
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