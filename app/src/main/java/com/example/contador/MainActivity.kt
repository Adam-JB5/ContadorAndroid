package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el layout usando binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ahora accede a las vistas directamente
        binding.btnIncrement.setOnClickListener {
            contador++
            binding.tvCounter.text = contador.toString()
        }
    }
}
