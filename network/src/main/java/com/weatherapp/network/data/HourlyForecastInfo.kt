package com.weatherapp.network.data

data class HourlyForecastInfo(
    var data: List<HourlyForecast>,
    var city_name: String,
    var lat: String,
    var lon: String,
    var country_code: String,
    var state_code: String
)

data class HourlyForecast(
    var wind_cdir: String,
    var timestamp_utc: String,
    var wind_spd: String,
    var temp: String,
    var app_temp: String,
    var pop: String,
    var slp: String,
    var pres: String,
    var rh: String,
    var clouds: String,
    var weather: Weather,
    var vis: String
)
