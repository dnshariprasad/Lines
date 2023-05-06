package hari.lines

import hari.lines.model.Line
import retrofit2.Response
import retrofit2.http.GET

interface Api {
    @GET("/todos/1")
    suspend fun getLines(): Response<Line>
}