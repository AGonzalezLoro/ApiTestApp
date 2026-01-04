package com.example.apitestapp.data

import com.example.apitestapp.data.response.ResponseWrapper
import retrofit2.http.GET
import retrofit2.http.Query

interface CharactersApiService {

    @GET("/api/characters/")
    suspend fun getCharacters(@Query("page") page: Int): ResponseWrapper
}