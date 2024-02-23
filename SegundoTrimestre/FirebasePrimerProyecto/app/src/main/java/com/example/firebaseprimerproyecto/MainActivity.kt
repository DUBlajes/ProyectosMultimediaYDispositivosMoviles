package com.example.firebaseprimerproyecto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {

    private lateinit var welcomeText: TextView
    private lateinit var logoutButton: Button
    private var mAuth: FirebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeText = findViewById(R.id.welcome_text)
        logoutButton = findViewById(R.id.logout_button)

        val currentUser = mAuth.currentUser
        updateUI(currentUser)

        logoutButton.setOnClickListener {
            mAuth.signOut()
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            finish()
        }
    }

    private fun updateUI(user: FirebaseUser?) {
        welcomeText.text = if (user != null) {
            "Bienvenido, ${user.email}"
        } else {
            "Bienvenido"
        }
    }
}
