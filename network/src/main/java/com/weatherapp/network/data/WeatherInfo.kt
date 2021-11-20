package com.weatherapp.network.data

data class WeatherResponse(
    var data: List<WeatherData>
)

data class WeatherData(
    var sunrise: String,
    var sunset: String,
    var city_name: String,
    var country_code: String,
    var state_code: String,
    var pres: String,
    var slp: String,
    var wind_spd: String,
    var wind_cdir: String,
    var temp: String,
    var app_temp: String,
    var rh: String,
    var clouds: String,
    var vis: String,
    var aqi: String,
    var precip: String,
    var weather: Weather
)

data class Weather(
    var icon: String,
    var code: String,
    var description: String
)
