package com.mobichoicebreeze.features.newcollectionreport

import com.mobichoicebreeze.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}