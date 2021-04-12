package com.example.daggerpracticedemo.di.component

import com.example.daggerpracticedemo.MainActivity
import com.example.daggerpracticedemo.di.module.MyModule
import com.example.daggerpracticedemo.repo.DummyRepo
import dagger.Component

@Component(modules = [MyModule::class])
interface MyComponent {
    fun inject(targetClass: MainActivity)
    fun inject(targetClass: DummyRepo)
}