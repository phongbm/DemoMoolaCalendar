package com.phongbm.moolacalendar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_moola_calendar.view.*
import java.util.*

/**
 * Created by PhongBM on 07/02/2020
 */

class MoolaCalendarAdapter(private val context: Context,
                           private val dates: List<Date>) :
        RecyclerView.Adapter<MoolaCalendarAdapter.ViewHolder>() {
    private val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = inflater.inflate(R.layout.item_moola_calendar, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = dates.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindViews(position)
    }

    // ---------------------------------------------------------------------------------------------
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindViews(position: Int) {
            val date = dates[position]
            val calendar = Calendar.getInstance()
            calendar.time = date

            itemView.txtDay.text = calendar.get(Calendar.DATE).toString()
        }
    }

}