package com.example.daggerpracticedemo.di

import javax.inject.Inject

class DemoClass {

    @Inject
    constructor()
    {

    }

    fun getDummyText() = "This is dummy text from injection"
}