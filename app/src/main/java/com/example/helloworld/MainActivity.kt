package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//AppCompatActivity 클래스를 상속
class MainActivity : AppCompatActivity() {
    //클래스가 생성될 때 맨 처음에 호출되는 콜백 함수 - 초기화 코드를 넣으면 됨
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)              //super의 onCreate를 먼저
        setContentView(R.layout.activity_main)          //보여줄 레이아웃을 저장, activity_main.xml
        //R은 res 폴더에 접근하는 자동 생성 클래스
    }
}