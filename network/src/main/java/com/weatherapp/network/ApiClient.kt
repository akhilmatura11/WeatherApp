package com.weatherapp.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiClient {
    companion object {
        fun getClient(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("http://api.weatherbit.io/v2.0/forecast/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
        }
    }
}