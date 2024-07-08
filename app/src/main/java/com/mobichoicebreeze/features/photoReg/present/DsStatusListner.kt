package com.mobichoicebreeze.features.photoReg.present

import com.mobichoicebreeze.app.domain.ProspectEntity
import com.mobichoicebreeze.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}