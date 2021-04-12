package com.example.daggerpracticedemo.repo

import android.util.Log
import com.example.daggerpracticedemo.di.component.DaggerMyComponent
import javax.inject.Inject

class DummyRepo() {

    init {
        DaggerMyComponent.builder().build().inject(this)
    }

    @Inject
    lateinit var retrofitDummyClass: RetrofitDummyClass


    fun testMethod() {
        Log.d("abc", retrofitDummyClass.getRetrofitDummyText())
    }

}