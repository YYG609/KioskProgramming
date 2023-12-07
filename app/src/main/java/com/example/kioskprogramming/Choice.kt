package com.example.kioskprogramming

class choice {
    var name : String = " "
    var price : Double = 0.0

    constructor(_name:String, _price:Double) {
        name = _name
        price = _price

        println("${_name} 선택하셨으며, 가격은 ${_price} 입니다.")
    }
}