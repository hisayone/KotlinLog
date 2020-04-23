package jp.techacademy.hisashi.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hisashi = Human("hisashi",34,"読書")
        hisashi.say()
        hisashi.think()

        val hisao = Human("hisao",35,"釣り")
        hisao.say()
        hisao.think()
    }



}
