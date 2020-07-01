package com.phongbm.moolacalendar

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.view_moola_calendar.view.*

/**
 * Created by PhongBM on 07/01/2020
 * References:
 * https://medium.com/meetu-engineering/create-your-custom-calendar-view-10ff41f39bfe
 *
 */

class MoolaCalendarView
@JvmOverloads
constructor(context: Context,
            attrs: AttributeSet? = null,
            defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr) {
    private var moolaCalendarAdapter: MoolaCalendarAdapter

    init {
        inflate(context, R.layout.view_moola_calendar, this)

        lstCalendar.setHasFixedSize(true)

        val dates = MoolaCalendarUtil.getDates()
        moolaCalendarAdapter = MoolaCalendarAdapter(context, dates)
        lstCalendar.adapter = moolaCalendarAdapter

        moolaCalendarAdapter.notifyDataSetChanged()
    }

}