package com.mobichoicebreeze.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.mobichoicebreeze.app.FileUtils
import com.mobichoicebreeze.app.Pref
import com.mobichoicebreeze.base.BaseResponse
import com.mobichoicebreeze.features.addshop.model.AddLogReqData
import com.mobichoicebreeze.features.addshop.model.AddShopRequestData
import com.mobichoicebreeze.features.addshop.model.AddShopResponse
import com.mobichoicebreeze.features.addshop.model.LogFileResponse
import com.mobichoicebreeze.features.addshop.model.UpdateAddrReq
import com.mobichoicebreeze.features.contacts.CallHisDtls
import com.mobichoicebreeze.features.contacts.CompanyReqData
import com.mobichoicebreeze.features.contacts.ContactMasterRes
import com.mobichoicebreeze.features.contacts.SourceMasterRes
import com.mobichoicebreeze.features.contacts.StageMasterRes
import com.mobichoicebreeze.features.contacts.StatusMasterRes
import com.mobichoicebreeze.features.contacts.TypeMasterRes
import com.mobichoicebreeze.features.dashboard.presentation.DashboardActivity
import com.mobichoicebreeze.features.login.model.WhatsappApiData
import com.mobichoicebreeze.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}