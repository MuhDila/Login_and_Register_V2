package com.example.loginandregisterv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity() {
    // Declaration
    private lateinit var editEmailText: EditText
    private lateinit var editPasswordText: EditText
    private lateinit var buttonSignInLogin: Button
    private lateinit var buttonSignUpLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialization variable
        editEmailText = findViewById(R.id.email_login)
        editPasswordText = findViewById(R.id.password_login)
        buttonSignInLogin = findViewById((R.id.button_signin_login))
        buttonSignUpLogin = findViewById((R.id.button_signup_login))

        // When button Sign In is clicked
        buttonSignInLogin.setOnClickListener {

        }

        // When button Sign Up is clicked
        buttonSignUpLogin.setOnClickListener {
            val i = Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }

        // Setting color status bar and navigator bar
        statusNavBar()
    }
    // Setting color status bar and navigator bar
    private fun statusNavBar() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
        // Set the status bar color
        val window = window
        val statusBarColor = ContextCompat.getColor(this, R.color.cosmic_latte)
        val navigatorBarColor = ContextCompat.getColor(this, R.color.cosmic_latte)
        window.statusBarColor = statusBarColor
        window.navigationBarColor = navigatorBarColor
    }
}