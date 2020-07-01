package com.phongbm.moolacalendar

import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by PhongBM on 07/02/2020
 */

object MoolaCalendarUtil {
    fun getDates(): List<Date> {
        val dates = ArrayList<Date>()
        val calendar = Calendar.getInstance()

        // Determine the cell for current month's beginning
        calendar.set(Calendar.DAY_OF_MONTH, 1)
        val monthBeginningCell = calendar.get(Calendar.DAY_OF_WEEK) - 2

        // Move calendar backwards to the beginning of the week
        calendar.add(Calendar.DAY_OF_MONTH, -monthBeginningCell)

        while (dates.size < 60) {
            dates.add(calendar.time)
            calendar.add(Calendar.DAY_OF_MONTH, 1)
        }

        return dates
    }

}