package com.mobichoicebreeze.features.viewAllOrder.interf

import com.mobichoicebreeze.app.domain.NewOrderGenderEntity
import com.mobichoicebreeze.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}