package com.urspayce.roombooking.Activity

import android.app.Dialog
import android.os.Bundle
import android.view.Window
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.urspayce.roombooking.Adapter.DatesAdapter
import com.urspayce.roombooking.R
import com.urspayce.roombooking.databinding.ActivityConferenceRoom2Binding

class ConferenceRoomActivity2 : AppCompatActivity() {
    var binding: ActivityConferenceRoom2Binding? = null
    val list: ArrayList<String>? = ArrayList()
    var adapter: DatesAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConferenceRoom2Binding.inflate(layoutInflater)
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
        adapter = DatesAdapter(this@ConferenceRoomActivity2, list!!)
        val mLayoutManager: RecyclerView.LayoutManager =
            GridLayoutManager(this@ConferenceRoomActivity2, 3)
        binding!!.recyclerView.layoutManager = mLayoutManager
        binding!!.recyclerView.itemAnimator = DefaultItemAnimator()
        binding!!.recyclerView.setHasFixedSize(true)
        binding!!.recyclerView.adapter = adapter

        binding!!.extendButton.setOnClickListener {
            showDialog()
        }
    }

    fun showDialog() {
        var dialog = Dialog(this@ConferenceRoomActivity2)
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog!!.setCancelable(true)
        dialog!!.setContentView(R.layout.edit_item_dialog_layout2)
        dialog!!.window!!.setBackgroundDrawableResource(R.color.blacktrans);
        dialog!!.show()
        val window = dialog!!.window
        window!!.setLayout(
            FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT
        )
    }
}