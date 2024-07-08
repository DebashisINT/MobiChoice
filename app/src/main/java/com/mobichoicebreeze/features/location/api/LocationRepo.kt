package com.mobichoicebreeze.features.location.api

import com.mobichoicebreeze.app.Pref
import com.mobichoicebreeze.base.BaseResponse
import com.mobichoicebreeze.features.location.model.AppInfoInputModel
import com.mobichoicebreeze.features.location.model.AppInfoResponseModel
import com.mobichoicebreeze.features.location.model.GpsNetInputModel
import com.mobichoicebreeze.features.location.model.ShopDurationRequest
import com.mobichoicebreeze.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}