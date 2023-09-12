package com.example.randomgame.api

import retrofit2.http.GET

interface RandomApi {

    @GET("integers/?num=1&min=1&max=100&col=1&base=10&format=plain&rnd=new")
    suspend fun getRandomNumber(): Int
}