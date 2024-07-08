package com.mobichoicebreeze.features.viewAllOrder.interf

import com.mobichoicebreeze.app.domain.NewOrderGenderEntity
import com.mobichoicebreeze.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}