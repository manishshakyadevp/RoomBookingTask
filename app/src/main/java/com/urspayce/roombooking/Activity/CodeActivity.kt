package com.urspayce.roombooking.Activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.urspayce.roombooking.databinding.ActivityCodeBinding


class CodeActivity : AppCompatActivity() {
    var binding: ActivityCodeBinding? = null
    private val TIME_OUT = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCodeBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding!!.codeTextView.setOnClickListener {
            val i = Intent(this@CodeActivity, ConferenceRoomAvailableActivity::class.java)
            startActivity(i)
        }
    }
}