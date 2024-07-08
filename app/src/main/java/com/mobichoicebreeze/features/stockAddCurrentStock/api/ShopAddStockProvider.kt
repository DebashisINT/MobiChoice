package com.mobichoicebreeze.features.stockAddCurrentStock.api

import com.mobichoicebreeze.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.mobichoicebreeze.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}