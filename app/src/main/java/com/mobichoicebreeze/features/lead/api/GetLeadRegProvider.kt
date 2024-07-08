package com.mobichoicebreeze.features.lead.api

import com.mobichoicebreeze.features.NewQuotation.api.GetQuotListRegRepository
import com.mobichoicebreeze.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}