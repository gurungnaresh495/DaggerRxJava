package com.example.daggerpracticedemo.di.module

import com.example.daggerpracticedemo.di.DemoClass
import com.example.daggerpracticedemo.repo.RetrofitDummyClass
import dagger.Module
import dagger.Provides

@Module
class MyModule {

    @Provides
    fun getDemoClass(): DemoClass
    {
        return DemoClass()
    }
    @Provides
    fun getRetrofitDemoClass(): RetrofitDummyClass
    {
        return RetrofitDummyClass()
    }


}