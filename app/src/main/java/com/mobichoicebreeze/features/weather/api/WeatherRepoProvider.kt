package com.mobichoicebreeze.features.weather.api

import com.mobichoicebreeze.features.task.api.TaskApi
import com.mobichoicebreeze.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}