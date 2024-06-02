package com.uti.tugasakhirpm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var btn_Login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        btn_Login = findViewById(R.id.btn_Login)

        btn_Login.setOnClickListener {
            val email = email.text.toString()
            val password = password.text.toString()

            if ( email == "admin@gmail.com" && password == "admin12") {
                // Login berhasil, pindah ke HomeActivity
                val intent = Intent(this, TampilanAwalActivity::class.java)
                startActivity(intent)
                finish() // Optional: finish MainActivity if you don't want to go back to it
            } else {
                // Login gagal
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }

        }
    }
