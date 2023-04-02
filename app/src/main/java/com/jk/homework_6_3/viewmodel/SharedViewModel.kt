package com.jk.homework_6_3.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private var count = 0
    var counterData = MutableLiveData<Int>()
    var history = MutableLiveData<String>()

    fun increment() {
        ++count
        counterData.value = count
        history.value = "+"
    }

    fun decrement() {
        --count
        counterData.value = count
        history.value = "-"
    }
}