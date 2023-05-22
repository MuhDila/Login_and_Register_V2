package com.example.loginandregisterv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Setting color status bar and navigator bar
        statusNavBar()
    }

    // Setting color status bar and navigator bar
    public fun statusNavBar() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
        // Set the status bar color
        val window = window
        val statusBarColor = ContextCompat.getColor(this, R.color.cosmic_latte)
        val navigatorBarColor = ContextCompat.getColor(this, R.color.cosmic_latte)
        window.statusBarColor = statusBarColor
        window.navigationBarColor = navigatorBarColor
    }
}