package com.dwiyu.ch5_moviedb.viewmodel

import com.dwiyu.ch5_moviedb.network.ApiService
import org.junit.Assert.*
import org.mockito.Mock

class ViewModelFilmTest{

    @Mock
    lateinit var service: ApiService

    lateinit var viewModel: ViewModelFilm

    /*
        @Before
        fun setUp(){
            //fungsi mockk() untuk membuat objek palsu (mock) dari kelas yang ingin kita uji. -> APiService
            service = mockk()
        }

        @Test
        fun testRetriveData(): Unit = runBlocking {
            //membuat objek palsu (mock) responseRetrive dari kelas Call<List<Source>>
            //Objek palsu ini akan digunakan sebagai respons palsu dari pemanggilan service.getAllSources().
            val responseRetrive = mockk<Call<List<NowplayingMovie>>>()

            every {
                runBlocking {
                    service.getMovie()
                }
            } returns responseRetrive
            val result = service.getMovie()

            //verify, kita memastikan bahwa metode service.getAllSources() benar-benar dipanggil dengan argumen yang sesuai.

            verify {
                runBlocking {
                    service.getMovie()
                }
            }

            //assertEquals, kita membandingkan nilai result yang diperoleh dari pemanggilan service.getAllSources()
            // dengan objek palsu responseRetrive, untuk memastikan bahwa hasilnya sesuai dengan yang diharapkan.
            assertEquals(result,responseRetrive)
    */

}

/*    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        viewModel = ViewModelFilm(apiService)
    }

    @Test
    fun testCallApi(){
        val expectedSources = listOf(
            Dates("2023-06-06", "2023-04-19")
        )

        val response = Response.success(expectedSources)

        Mockito.`when`(apiService.getMovie()).thenReturn(
            Response.success(expectedSources) as Call<NowplayingMovie>
        )

        viewModel.callApi()

        val liveDataSource = viewModel.movie

        Assert.assertEquals(expectedSources, liveDataSource.value)
    }

    @Test
    fun testCallApiSourceError() {
        // Given
        val errorMessage = "Error getting sources"

        val throwable = Throwable(errorMessage)

        Mockito.`when`(apiService.getMovie()).thenThrow(throwable)

        // When
        viewModel.callApi()

        // Then
        val liveDataSource = viewModel.movie

        Assert.assertNull(liveDataSource.value)
    }*/
