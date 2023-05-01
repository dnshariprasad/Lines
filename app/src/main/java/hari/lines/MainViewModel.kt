package hari.lines

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import hari.lines.repo.DataRepo
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val repo: DataRepo) : ViewModel() {
    val data get() = repo.data

    //View requested data
    //asking repo
    fun getData() {
        viewModelScope.launch {
            repo.getData()
        }
    }
}