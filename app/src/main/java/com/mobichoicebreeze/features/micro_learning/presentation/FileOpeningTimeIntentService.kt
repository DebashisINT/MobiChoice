package com.mobichoicebreeze.features.micro_learning.presentation

import android.app.IntentService
import android.content.Intent
import com.mobichoicebreeze.R
import com.mobichoicebreeze.app.NetworkConstant
import com.mobichoicebreeze.app.Pref
import com.mobichoicebreeze.app.utils.AppUtils
import com.mobichoicebreeze.app.utils.Toaster
import com.mobichoicebreeze.base.BaseResponse
import com.mobichoicebreeze.base.presentation.BaseActivity
import com.mobichoicebreeze.features.dashboard.presentation.DashboardActivity
import com.mobichoicebreeze.features.micro_learning.api.MicroLearningRepoProvider

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

// Revision History
// 1.0 ExoPlayerActivity AppV 4.0.7 Saheli    02/03/2023 Timber Log Implementation
class FileOpeningTimeIntentService : IntentService("") {

    override fun onHandleIntent(p0: Intent?) {

        val id = p0?.getStringExtra("id")
        val startTime = p0?.getStringExtra("start_time")

        val repository = MicroLearningRepoProvider.microLearningRepoProvider()
        BaseActivity.compositeDisposable.add(
                repository.updateFileOpeningTime(id!!, startTime!!)
                        .subscribe({ result ->
                            val response = result as BaseResponse
//                            XLog.d("UPDATE FILE OPENING TIME: " + "RESPONSE : " + response.status + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + response.message)
                            Timber.d("UPDATE FILE OPENING TIME: " + "RESPONSE : " + response.status + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + response.message)
                        }, { error ->
//                            XLog.d("UPDATE FILE OPENING TIME: " + "ERROR : " + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + error.localizedMessage)
                            Timber.d("UPDATE FILE OPENING TIME: " + "ERROR : " + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + error.localizedMessage)
                            error.printStackTrace()
                        })
        )
    }
}