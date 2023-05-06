package hari.lines.repo

import androidx.lifecycle.MutableLiveData
import hari.lines.Api
import hari.lines.model.Line
import javax.inject.Inject

class LineRepo @Inject constructor(val api: Api) {
    private val _line = MutableLiveData<Line>()
    val line get() = _line

    // ViewModel requested data
    // Getting form server
    suspend fun getLines() {
        val response = api.getLines()
        if (response.isSuccessful) {
            _line.postValue(response.body())
        }
    }
}