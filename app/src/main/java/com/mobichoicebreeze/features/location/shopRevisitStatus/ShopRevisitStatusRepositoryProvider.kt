package com.mobichoicebreeze.features.location.shopRevisitStatus

import com.mobichoicebreeze.features.location.shopdurationapi.ShopDurationApi
import com.mobichoicebreeze.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}