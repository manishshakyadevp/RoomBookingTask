package com.urspayce.roombooking.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.urspayce.roombooking.Adapter.DatesAdapter
import com.urspayce.roombooking.databinding.ActivityConferenceRoomAvailableBinding

class ConferenceRoomAvailableActivity : AppCompatActivity() {
    var binding: ActivityConferenceRoomAvailableBinding? = null
    val list: ArrayList<String>? = ArrayList()
    var adapter: DatesAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConferenceRoomAvailableBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        // add item in list
        initList()
        initView()
    }

    fun initList() {

        list!!.add("11:00 to 12:30")
        list!!.add("12:30 to 01:00")
        list!!.add("01:00 to 01:30")
        list!!.add("01:30 to 02:00")
        list!!.add("02:00 to 02:30")
        list!!.add("02:30 to 03:00")
        list!!.add("04:00 to 04:30")
        list!!.add("05:00 to 05:30")
        list!!.add("06:00 to 06:30")
        list!!.add("06:30 to 07:30")
    }

    fun initView() {
        adapter = DatesAdapter(this@ConferenceRoomAvailableActivity, list!!)
        val mLayoutManager: RecyclerView.LayoutManager =
            GridLayoutManager(this@ConferenceRoomAvailableActivity, 3)
        binding!!.recyclerView.layoutManager = mLayoutManager
        binding!!.recyclerView.itemAnimator = DefaultItemAnimator()
        binding!!.recyclerView.setHasFixedSize(true)
        binding!!.recyclerView.adapter = adapter


        binding!!.cardView.setOnClickListener {
            val i = Intent(this@ConferenceRoomAvailableActivity, ConferenceRoomActivity2::class.java)
            startActivity(i)
        }
    }
}