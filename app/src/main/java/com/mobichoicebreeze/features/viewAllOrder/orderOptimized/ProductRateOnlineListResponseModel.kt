package com.mobichoicebreeze.features.viewAllOrder.orderOptimized

import com.mobichoicebreeze.app.domain.ProductOnlineRateTempEntity
import com.mobichoicebreeze.base.BaseResponse
import com.mobichoicebreeze.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}