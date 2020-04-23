package jp.techacademy.hisashi.kotlinlog

abstract class Animal{
    //プロパティ
    var name: String
    var age: Int

    //コンストラクタ
    constructor(name: String,age: Int){
        this.name = name
        this.age = age
    }

    abstract fun say()
}