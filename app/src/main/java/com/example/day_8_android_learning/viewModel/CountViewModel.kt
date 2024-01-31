package com.example.day_8_android_learning.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel  : ViewModel(){
    var mutableLiveData = MutableLiveData<Int>()
    init {
        mutableLiveData.value = 0
    }
    fun increment(){
        mutableLiveData.value = mutableLiveData.value?.plus(1)
    }
}