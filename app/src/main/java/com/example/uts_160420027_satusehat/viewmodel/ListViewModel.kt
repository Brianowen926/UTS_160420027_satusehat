package com.example.uts_160420027_satusehat.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.uts_160420027_satusehat.model.Notification
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ListViewModel (application: Application): AndroidViewModel(application) {
    val studentsLD = MutableLiveData<ArrayList<Notification>>()
    val studentLoadErrorLD = MutableLiveData<Boolean>()
    val loadingLD = MutableLiveData<Boolean>()
    val singleStudentLD = MutableLiveData<Notification>()

    fun refresh() {
        loadingLD.value = true
        studentLoadErrorLD.value = false

        queue = Volley.newRequestQueue(  getApplication() )
        val url = "https://jsonformatter.org/8cbada#save"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            {
                val sType = object : TypeToken<List<Notification>>() { }.type
                val result = Gson().fromJson<List<Notification>>(it, sType)

                studentsLD.value = result as ArrayList<Notification>?
                loadingLD.value = false

                Log.d("showvoley", result.toString())
//                loadingLD.value = false
//                Log.d("showvoley", it)
            },
            {
                Log.d("showvoley", it.toString())
                studentLoadErrorLD.value = false
                loadingLD.value = false
            })

        stringRequest.tag = TAG
        queue?.add(stringRequest)


    }

    val TAG = "volleyTag"
    private var queue: RequestQueue? = null

    override fun onCleared() {
        super.onCleared()
        queue?.cancelAll(TAG)
    }

}

