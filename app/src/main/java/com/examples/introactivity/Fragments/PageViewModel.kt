package com.examples.introactivity.Fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.examples.introactivity.Constants

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()


    val heading: LiveData<String> = Transformations.map(_index) {
        Constants.titles[it]
    }
    val message: LiveData<String> = Transformations.map(_index) {
        Constants.messages[it]
    }
    val image: LiveData<Int> = Transformations.map(_index) {
        Constants.drawables[it]
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}