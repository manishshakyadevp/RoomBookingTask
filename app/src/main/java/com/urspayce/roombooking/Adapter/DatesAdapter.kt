package com.urspayce.roombooking.Adapter

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.urspayce.roombooking.R

class DatesAdapter(
    private val context: Context,
    private val assignment: ArrayList<String>,
) : RecyclerView.Adapter<DatesAdapter.DatesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.dates_item_layout, parent, false)
        return DatesViewHolder(view)
    }

    override fun onBindViewHolder(holder: DatesViewHolder, position: Int) {
        holder.textView?.text = assignment[position]
        if (position == 0 || position == 7 || position == 8 || position == 9) {
            holder.layout.setBackgroundResource(R.drawable.button_shape_1)
            holder.textView.setTextColor(Color.parseColor("#808080"))
        } else if (position == 1 || position == 6) {
            holder.layout.setBackgroundResource(R.drawable.button_shape_2)
            holder.textView.setTextColor(Color.parseColor("#1FC9AA"))
        } else if (position == 2 || position == 4) {
            holder.layout.setBackgroundResource(R.drawable.button_shape_1)
            holder.textView.setTextColor(Color.parseColor("#1FC9AA"))
        } else if (position == 3) {
            holder.layout.setBackgroundResource(R.drawable.button_shape_2)
            holder.textView.setTextColor(Color.parseColor("#808080"))
        } else {
            holder.layout.setBackgroundResource(R.drawable.button_shape_3)
            holder.textView.setTextColor(Color.parseColor("#FFFFFF"))
        }

        holder.itemView.setOnClickListener {
            showDialog()
        }
    }

    override fun getItemCount(): Int {
        return assignment.size
    }

    class DatesViewHolder(containerView: View) : RecyclerView.ViewHolder(containerView) {
        val textView = containerView.findViewById<TextView>(R.id.textView)
        val layout = containerView.findViewById<RelativeLayout>(R.id.layout)
    }

    companion object {
        private val TAG = DatesAdapter::class.java.simpleName
    }

    fun showDialog() {
        var dialog = Dialog(context)
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog!!.setCancelable(true)
        dialog!!.setContentView(R.layout.edit_item_dialog_layout)
        dialog!!.window!!.setBackgroundDrawableResource(R.color.blacktrans);
        dialog!!.show()
        val window = dialog!!.window
        window!!.setLayout(
            FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT
        )
    }
}
