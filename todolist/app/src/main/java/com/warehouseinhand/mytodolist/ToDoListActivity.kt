package com.warehouseinhand.mytodolist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.warehouseinhand.mytodolist.databinding.ActivityMainBinding

class ToDoListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}