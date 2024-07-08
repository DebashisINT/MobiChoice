package com.mobichoicebreeze.features.dashboard.presentation.api.dayStartEnd

import com.mobichoicebreeze.features.stockCompetetorStock.api.AddCompStockApi
import com.mobichoicebreeze.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}