package com.mobichoicebreeze.features.viewAllOrder.interf

import com.mobichoicebreeze.app.domain.NewOrderColorEntity
import com.mobichoicebreeze.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}