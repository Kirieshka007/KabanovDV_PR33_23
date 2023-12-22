package com.example.kabanovdv_pr33_23

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.kabanovdv_pr33_23.databinding.ActivityResultBinding


private lateinit var binding: ActivityResultBinding
class ResultActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnToast.setOnClickListener {
            take_result()
        }
    }
    fun take_result() {
        Toast.makeText(this, "Успешно", Toast.LENGTH_SHORT).show()
    }
}