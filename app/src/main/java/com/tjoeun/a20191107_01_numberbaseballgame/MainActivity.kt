package com.tjoeun.a20191107_01_numberbaseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random

class MainActivity : BaseActivity() {


    //471 -> 4, 7, 1 로 배열로 저장


    var questionNumArray=ArrayList<Int>()





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
        createQuestion()
    }

    fun createQuestion(){
        while(true){
            val number = Random.nextInt(1,9)
            if(!questionNumArray.contains(number)){
                questionNumArray.add(number)
            }
           if( questionNumArray.size==3){
               break
           }
        }

        for (num in questionNumArray){
            Log.d("출제 숫자",num.toString())
        }

    }




    override fun setupEvents() {

    }

    override fun setValues() {

    }
}
