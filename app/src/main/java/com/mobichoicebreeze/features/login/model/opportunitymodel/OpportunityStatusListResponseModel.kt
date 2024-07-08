package com.mobichoicebreeze.features.login.model.opportunitymodel

import com.mobichoicebreeze.app.domain.OpportunityStatusEntity
import com.mobichoicebreeze.app.domain.ProductListEntity
import com.mobichoicebreeze.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}