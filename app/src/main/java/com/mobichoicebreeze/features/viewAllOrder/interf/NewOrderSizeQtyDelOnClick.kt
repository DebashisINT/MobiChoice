package com.mobichoicebreeze.features.viewAllOrder.interf

import com.mobichoicebreeze.app.domain.NewOrderGenderEntity
import com.mobichoicebreeze.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}