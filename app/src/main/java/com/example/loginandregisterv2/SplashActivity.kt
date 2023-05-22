package com.example.loginandregisterv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.core.content.ContextCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Setting color status bar and navigator bar
        statusNavBar()

        // Animation
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 3000)
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