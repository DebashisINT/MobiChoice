package com.mobichoicebreeze.features.document.api

import com.mobichoicebreeze.features.dymanicSection.api.DynamicApi
import com.mobichoicebreeze.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}