package com.dwiyu.ch5_moviedb.room

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DataFavTest{
    private lateinit var data: DataFav

    @Before
    fun setUp() {
        data = DataFav(
            id = 1,
            title = "The Super Mario",
            releasedate = "2025-09-09",
            posterPath = "poster.jpg",
        )
    }


    @Test
    fun DataFavtest() {
        assertEquals(1, data.id)
        assertEquals("The Super Mario", data.title)
        assertEquals("2025-09-09", data.releasedate)
        assertEquals("poster.jpg", data.posterPath)
    }
}