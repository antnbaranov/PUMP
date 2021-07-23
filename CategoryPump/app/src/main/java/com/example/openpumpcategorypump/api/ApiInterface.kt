package com.example.openpumpcategorypump.api

import retrofit2.Call
import retrofit2.http.GET

const val vs_currency = "usd"
const val quantity_per_pages = (100).toString()
const val current_page = (1).toString()
interface ApiInterface {
    @GET("coins/markets?vs_currency=$vs_currency&order=market_cap_desc&per_page=$quantity_per_pages&page=$current_page&sparkline=false")
    fun getData(): Call<List<apiItem>>
}