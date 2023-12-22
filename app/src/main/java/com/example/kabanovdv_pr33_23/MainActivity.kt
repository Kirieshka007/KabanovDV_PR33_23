package com.example.kabanovdv_pr33_23

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.kabanovdv_pr33_23.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnIntentSignIn.setOnClickListener {
            signIn()
        }

    }
    fun signIn() {
        var intent = Intent (this, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}