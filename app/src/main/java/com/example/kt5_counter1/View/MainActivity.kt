package com.example.kt5_counter1.View

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kt5_counter1.Presenter.Presenter
import com.example.kt5_counter1.R
import com.example.kt5_counter1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),CounterView {
    var presenter  = Presenter()
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }
    private fun initClicker(){
        with(binding){
                btnPlus.setOnClickListener {
                 presenter.increment()
                }
        }
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show()
    }

    override fun setColor() {
      binding.tvResult.setBackgroundColor(Color.GREEN)
    }

    override fun updateCounter(count: Int) {
binding.tvResult.text = count.toString()


        }

    }
