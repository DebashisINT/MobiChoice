package com.mobichoicebreeze.features.weather.api

import com.mobichoicebreeze.base.BaseResponse
import com.mobichoicebreeze.features.task.api.TaskApi
import com.mobichoicebreeze.features.task.model.AddTaskInputModel
import com.mobichoicebreeze.features.weather.model.ForeCastAPIResponse
import com.mobichoicebreeze.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}