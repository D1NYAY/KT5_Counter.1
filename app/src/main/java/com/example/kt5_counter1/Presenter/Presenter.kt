package com.example.kt5_counter1.Presenter

import com.example.kt5_counter1.Model.CounterModel
import com.example.kt5_counter1.View.CounterView

class Presenter {
    private val model = CounterModel()
    lateinit var view: CounterView
    fun increment() {
        model.increment()
        view.updateCounter(model.count)
if (model.getCount() == 10){
    view.showToast()
}else if (model.getCount() == 15){
    view.setColor()

        }}


    fun attachView(view: CounterView) {
        this.view = view
    }}
