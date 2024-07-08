package com.mobichoicebreeze.features.viewAllOrder.model

import com.mobichoicebreeze.app.domain.NewOrderColorEntity
import com.mobichoicebreeze.app.domain.NewOrderGenderEntity
import com.mobichoicebreeze.app.domain.NewOrderProductEntity
import com.mobichoicebreeze.app.domain.NewOrderSizeEntity
import com.mobichoicebreeze.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

