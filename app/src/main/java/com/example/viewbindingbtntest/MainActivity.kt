package com.example.viewbindingbtntest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import com.example.viewbindingbtntest.databinding.ActivityMainBinding //added

class MainActivity : AppCompatActivity() {

    private lateinit var mbinding: ActivityMainBinding //added

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main) // deleted
        mbinding = ActivityMainBinding.inflate(layoutInflater)//added
        setContentView(mbinding.root)//added

        //  view id, xml file name 파스칼케이스 -> 카멜케이스
        //  activity_main-> ActivityMain
        //  tv_button-> tvButton
        //  Tv_button-> TvButton
        //  tv_changebUtton-> tvChangebUtton
        //  tv_change_button-> tvChangeButton
        //  button-> button

        // [variable that lateinit binded with xml].[view id].[method]
        mbinding.button.setOnClickListener {
            mbinding.textView.setText("안녕 월드!")
        }
    }
}