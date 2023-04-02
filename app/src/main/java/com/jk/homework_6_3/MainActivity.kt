package com.jk.homework_6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jk.homework_6_3.adapter.ViewPagerAdapter
import com.jk.homework_6_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter by lazy {
        ViewPagerAdapter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPager.adapter = adapter
    }
}