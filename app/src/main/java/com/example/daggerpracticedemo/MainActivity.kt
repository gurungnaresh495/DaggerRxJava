package com.example.daggerpracticedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerpracticedemo.di.DemoClass
import com.example.daggerpracticedemo.di.component.DaggerMyComponent
import com.example.daggerpracticedemo.repo.DummyRepo
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var demoClass: DemoClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        DaggerMyComponent.builder().build().inject(this)
        var dummyRepo = DummyRepo()
        dummyRepo.testMethod()
        demoClass.getDummyText()
    }
}