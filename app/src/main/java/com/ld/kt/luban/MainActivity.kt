package com.ld.kt.luban

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val TAG: String = "LubanKt"
    private val RANGE: Int = 3
    private var mImageList: List<ImageBean> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
