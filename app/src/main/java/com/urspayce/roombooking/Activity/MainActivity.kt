package com.urspayce.roombooking.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.urspayce.roombooking.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        clickListener()
    }

    fun clickListener(){
        binding!!.pairDeviceButton.setOnClickListener {
            val i = Intent(this@MainActivity, CodeActivity::class.java)
            startActivity(i)
        }
    }
}