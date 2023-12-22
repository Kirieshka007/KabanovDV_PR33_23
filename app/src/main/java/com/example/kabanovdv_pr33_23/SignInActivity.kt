package com.example.kabanovdv_pr33_23

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.kabanovdv_pr33_23.databinding.ActivitySignInBinding


private lateinit var binding: ActivitySignInBinding
class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignIn.setOnClickListener {
            signIn()
        }
    }
    fun signIn() {
        if (binding.edEmail.length() > 3 && binding.edPassword.length() > 3) {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this, "Введите данные корректно", Toast.LENGTH_SHORT).show()
        }

    }
}