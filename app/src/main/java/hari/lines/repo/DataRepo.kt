package hari.lines.repo

import androidx.lifecycle.MutableLiveData
import hari.lines.Api
import hari.lines.model.Data
import javax.inject.Inject

class DataRepo @Inject constructor(val api: Api) {
    private val _data = MutableLiveData<Data>()
    val data get() = _data

    // ViewModel requested data
    // Getting form server
    suspend fun getData() {
        val response = api.getData()
        if (response.isSuccessful) {
            _data.postValue(response.body())
        }
    }
}