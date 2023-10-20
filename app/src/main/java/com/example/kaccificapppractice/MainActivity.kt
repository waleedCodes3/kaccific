package com.example.kaccificapppractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kaccificapppractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.apply {
            engLangOptionTv.root.text = "English"
            engLangOptionTv.root.setCompoundDrawablesWithIntrinsicBounds(
                0,0,R.drawable.englishcountryflag,0
            )  // Set the drawable
            tagalogLangOptionTv.root.apply {
                text = "Tagalog"
                setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.tagalogflag,0)
            }


            bashaLangOptionTv.root.apply {
                text = "Bhasha Indonesia"
                setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.indonesiaflag,0)

            }
        }
    }
}