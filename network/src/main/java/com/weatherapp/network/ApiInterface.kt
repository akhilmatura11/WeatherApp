package com.weatherapp.network

import com.weatherapp.network.data.HourlyForecastInfo
import com.weatherapp.network.data.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("current")
    suspend fun getDataByLatLon(
        @Query("key") apiKey: String,
        @Query("lat") lat: String,
        @Query("lon") lon: String
    ): Response<WeatherResponse>

    @GET("current")
    suspend fun getDataByCity(
        @Query("key") apiKey: String,
        @Query("city_id") city_id: String
    ): Response<WeatherResponse>

    @GET("current")
    suspend fun getDataByCityCountry(
        @Query("key") apiKey: String,
        @Query("city") city: String,
        @Query("country") country: String
    ): Response<WeatherResponse>

    @GET("forecast/hourly")
    suspend fun getHourlyForecastByLatLon(
        @Query("key") apiKey: String,
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("hours") hours: String
    ): Response<HourlyForecastInfo>

    @GET("forecast/hourly")
    suspend fun getHourlyForecastByCityCountry(
        @Query("key") apiKey: String,
        @Query("city") city: String,
        @Query("country") country: String,
        @Query("hours") hours: String
    ): Response<HourlyForecastInfo>
}