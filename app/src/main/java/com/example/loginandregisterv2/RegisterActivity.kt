package com.example.loginandregisterv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat

class RegisterActivity : AppCompatActivity() {

    // Declaration
    private lateinit var editNameText: EditText
    private lateinit var editEmailText: EditText
    private lateinit var editPasswordText: EditText
    private lateinit var editRepeatPasswordText: EditText
    private lateinit var buttonSignUpRegister: Button
    private lateinit var buttonSignInRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Initialization variable
        editNameText = findViewById(R.id.nameRegister)
        editEmailText = findViewById(R.id.emailRegister)
        editPasswordText = findViewById(R.id.passwordRegister)
        editRepeatPasswordText = findViewById(R.id.repeatPasswordRegister)
        buttonSignUpRegister = findViewById((R.id.button_signup_register))
        buttonSignInRegister = findViewById((R.id.button_signin_register))

        // When button Sign Up is clicked
        buttonSignUpRegister.setOnClickListener {

        }

        // When button Sign In is clicked
        buttonSignInRegister.setOnClickListener {
            val i = Intent(this, LoginActivity::class.java)
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