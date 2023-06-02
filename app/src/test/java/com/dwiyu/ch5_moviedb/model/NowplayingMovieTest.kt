package com.dwiyu.ch5_moviedb.model

import com.google.gson.Gson
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class NowplayingMovieTest{
    private lateinit var gson: Gson

    @Before
    fun setup() {
        gson = Gson()
    }


    @Test
    fun testNowPlayingMovie() {
        val json = """
            {
                "page": 1,
                "results": [
                    {
                        "id": 1,
                        "title": "The Super Mario"
                    },
                    {
                        "id": 2,
                        "title": "Fast X"
                    }
                ],
                "total_pages": 3,
                "total_results": 6
            }
        """.trimIndent()

        val list = gson.fromJson(json, NowplayingMovie::class.java)

        assertEquals(1, list.page)
        assertEquals(2, list.results.size)
        assertEquals(3, list.totalPages)
        assertEquals(6, list.totalResults)

        assertEquals(1, list.results[0].id)
        assertEquals("The Super Mario", list.results[0].title)
        assertEquals(2, list.results[1].id)
        assertEquals("Fast X", list.results[1].title)
    }
}