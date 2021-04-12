package com.example.daggerpracticedemo.repo

import javax.inject.Inject

class RetrofitDummyClass {
    @Inject
    constructor()

    fun getRetrofitDummyText() = " This is from Retrofit dummy class"
}