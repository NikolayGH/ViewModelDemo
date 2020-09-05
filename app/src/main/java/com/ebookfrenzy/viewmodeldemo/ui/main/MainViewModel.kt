package com.ebookfrenzy.viewmodeldemo.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val usd_to_eu_rate = 0.7f
    public val dollarValue: MutableLiveData<String> = MutableLiveData()
    var result: MutableLiveData<Float> = MutableLiveData()

    fun convertValue(){
        dollarValue.let {
            if(!it.value.equals("")){
                result.value= it.value?.toFloat()?.times(usd_to_eu_rate)
            } else {
                result.value = 0f
            }

        }
    }
}