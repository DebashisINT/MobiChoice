package com.mobichoicebreeze.features.location.shopRevisitStatus

import com.mobichoicebreeze.base.BaseResponse
import com.mobichoicebreeze.features.location.model.ShopDurationRequest
import com.mobichoicebreeze.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}