package com.roga.santander_dev_week.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.roga.santander_dev_week.data.Conta
import com.roga.santander_dev_week.local.FakeData

class MainViewModel: ViewModel() {
    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()
    fun buscarContaCliente(): LiveData<Conta> {
        mutableLiveData.value= FakeData().getLocalData()
        return mutableLiveData
    }
}