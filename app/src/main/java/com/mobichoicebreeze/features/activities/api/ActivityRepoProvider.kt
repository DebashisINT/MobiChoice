package com.mobichoicebreeze.features.activities.api

import com.mobichoicebreeze.features.member.api.TeamApi
import com.mobichoicebreeze.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}