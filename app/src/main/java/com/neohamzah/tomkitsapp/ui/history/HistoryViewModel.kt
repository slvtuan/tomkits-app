package com.neohamzah.tomkitsapp.ui.history

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.neohamzah.tomkitsapp.data.pref.UserModel
import com.neohamzah.tomkitsapp.data.repository.Repository

class HistoryViewModel (
    private val repository: Repository,
) : ViewModel(){

    fun getSession(): LiveData<UserModel>{
        return repository.getSession().asLiveData()
    }
    fun getHistory(token: String) = repository.getHistory(token)
}

