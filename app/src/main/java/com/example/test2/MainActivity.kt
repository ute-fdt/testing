package com.example.test2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Khai báo biến binding
    private lateinit var binding: ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Cập nhật giá trị ban đầu
        updateCounterText()

        // Xử lý sự kiện nút "Tăng"
        binding.btnIncrease.setOnClickListener {
            count++
            updateCounterText()
        }

        // Xử lý sự kiện nút "Giảm"
        binding.btnDecrease.setOnClickListener {
            count--
            updateCounterText()
        }
    }

    private fun updateCounterText() {
        // update for testing commitcommit 2
        binding.tvCounter.text = count.toString()
    }
}