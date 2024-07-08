package com.mobichoicebreeze.features.survey.api

import com.mobichoicebreeze.features.photoReg.api.GetUserListPhotoRegApi
import com.mobichoicebreeze.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}