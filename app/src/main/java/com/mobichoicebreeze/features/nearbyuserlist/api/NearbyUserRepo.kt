package com.mobichoicebreeze.features.nearbyuserlist.api

import com.mobichoicebreeze.app.Pref
import com.mobichoicebreeze.features.nearbyuserlist.model.NearbyUserResponseModel
import com.mobichoicebreeze.features.newcollection.model.NewCollectionListResponseModel
import com.mobichoicebreeze.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}