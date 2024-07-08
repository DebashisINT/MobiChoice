package com.mobichoicebreeze.features.login.model.productlistmodel

import com.mobichoicebreeze.app.domain.ModelEntity
import com.mobichoicebreeze.app.domain.ProductListEntity
import com.mobichoicebreeze.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}