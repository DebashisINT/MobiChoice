package com.mobichoicebreeze.features.location.api

import com.mobichoicebreeze.features.location.shopdurationapi.ShopDurationApi
import com.mobichoicebreeze.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}