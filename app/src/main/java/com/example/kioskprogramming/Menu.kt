package com.example.kioskprogramming

class Menu {
    var name:String = ""
    var price:String = ""
    var info:String = ""

    constructor(_name: String, _price: String, _info: String){
        name = _name
        price = _price
        info = _info

        println("${_name} / ${_price} / ${_info}")
    }
}
