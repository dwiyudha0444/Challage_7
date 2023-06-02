package com.dwiyu.ch5_moviedb.model

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DatesTest{
    private lateinit var dates: Dates

    @Before
    fun setUp() {
        val maximum = "2023-06-07"
        val minimum = "2023-04-20"

        dates = Dates(maximum,minimum)
    }


    @Test
    fun testDates() {
        val maximum = "2023-06-07"
        val minimum = "2023-04-20"

        assertEquals(maximum, dates.maximum)
        assertEquals(minimum, dates.minimum)
    }
}