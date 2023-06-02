package com.dwiyu.ch5_moviedb.model

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.MockitoAnnotations

class NowPlayingMovieResponseTest{

    private lateinit var data: NowPlayingMovieResponse

    @Before
    fun setUp() {
        // Persiapan sebelum setiap pengujian dilakukan
        MockitoAnnotations.openMocks(this)

        // Membuat objek Result dengan nilai-nilai yang diberikan
        data = NowPlayingMovieResponse(
            false,
            "backdropPath",
            listOf(1, 2, 3),
            123,
            "originalLanguage",
            "originalTitle",
            "overview",
            4.5,
            "posterPath",
            "2023-05-31",
            "title",
            true,
            7.8,
            100
        )
    }

    @Test
    fun testResultProperties() {
        // Persiapan data yang diperlukan untuk pengujian

        // Verifikasi nilai-nilai properti dalam kelas Result
        assert(data.adult == false)
        assert(data.backdropPath == "backdropPath")
        assert(data.genreIds == listOf(1, 2, 3))
        assert(data.id == 123)
        assert(data.originalLanguage == "originalLanguage")
        assert(data.originalTitle == "originalTitle")
        assert(data.overview == "overview")
        assert(data.popularity == 4.5)
        assert(data.posterPath == "posterPath")
        assert(data.releaseDate == "2023-05-31")
        assert(data.title == "title")
        assert(data.video == true)
        assert(data.voteAverage == 7.8)
        assert(data.voteCount == 100)
    }


    /*    @Before
        fun setUp() {
            val adult ="false"
            val backdropPath="/2klQ1z1fcHGgQPevbEQdkCnzyuS.jpg"
            val genreIds="16"
            val id="502356"
            val originalLanguage=""
            val originalTitle=""
            val overview=""
            val popularity=""
            val posterPath=""
            val releaseDate=""
            val title=""
            val video=""
            val voteAverage=""
            val voteCount=""


            // Membuat objek DetailMovieTop dengan nilai-nilai yang diberikan
            dates = NowPlayingMovieResponse(
                adult,
                backdropPath,
            genreIds,
            id,
            originalLanguage,
            originalTitle,
             overview,
             popularity,
             posterPath,
             releaseDate,
             title,
             video,
             voteAverage,
             voteCount
                )
        }

        @After
        fun tearDown() {

        }

        @Test
        fun testNowPlayingMovieResponse() {
            val id = "2023-06-07"
            val imagepath = "2023-04-20"

            assertEquals(id, dates.maximum)
            assertEquals(imagepath, dates.minimum)
        }*/
}