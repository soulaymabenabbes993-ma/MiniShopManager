package com.example.minishopmanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btnSuivant = findViewById<Button>(R.id.btnSuivant)

        btnSuivant.setOnClickListener {

            Toast.makeText(
                this,
                "Bouton cliqué !",
                Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(this, ProfilActivity::class.java)

            startActivity(intent)
        }
    }
}