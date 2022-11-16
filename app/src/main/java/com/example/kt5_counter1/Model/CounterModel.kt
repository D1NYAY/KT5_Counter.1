package com.example.kt5_counter1.Model

class CounterModel {
    var count = 0
    fun increment() {
        ++count

    }

    @JvmName("getCount1")
    fun getCount():Int{
        return count

    }
}