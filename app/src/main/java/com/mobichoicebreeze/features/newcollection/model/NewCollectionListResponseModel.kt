package com.mobichoicebreeze.features.newcollection.model

import com.mobichoicebreeze.app.domain.CollectionDetailsEntity
import com.mobichoicebreeze.base.BaseResponse
import com.mobichoicebreeze.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}