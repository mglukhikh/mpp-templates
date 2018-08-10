package org.jetbrains.kotlin.android

import test.hello
import android.support.v7.app.AppCompatActivity
import android.R
import android.os.Bundle
import test.testMe

class MainActivity : AppCompatActivity() {

    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        hello()
        testMe()
        setContentView(R.layout.activity_main)
    }
}