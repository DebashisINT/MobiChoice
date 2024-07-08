package com.mobichoicebreeze.features.orderList.model

import com.mobichoicebreeze.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}