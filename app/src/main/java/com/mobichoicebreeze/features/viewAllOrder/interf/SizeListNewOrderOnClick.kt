package com.mobichoicebreeze.features.viewAllOrder.interf

import com.mobichoicebreeze.app.domain.NewOrderProductEntity
import com.mobichoicebreeze.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}