package com.mobichoicebreeze.features.stockCompetetorStock.api

import com.mobichoicebreeze.base.BaseResponse
import com.mobichoicebreeze.features.orderList.model.NewOrderListResponseModel
import com.mobichoicebreeze.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.mobichoicebreeze.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}