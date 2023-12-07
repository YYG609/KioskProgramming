package com.example.kioskprogramming

fun main() {

    println("어서오십시오. 쉑쉡입니다")
    println("1.매장식사, 2.포장")
    var choice = readLine()!!.toString()
    var choose = when(choice) {
        "1" -> "매장식사"
        "2" -> "포장"
        else -> "돌아가기"
    }
    println("메뉴를 선택해 주세요")
    println("1.burgurs, 2.frozen custard, 3.drinks, 4.beer")

    var num = readLine()!!.toInt()
    var menu = Shakeshake()

    println("{choose} 입니다. 준비되면 알려드리겠습니다. 감사합니다. Made by ${menu.order(num)}")
}

class Shakeshake {
    fun order(pick:Int): String {

        var one = burgers()
//        var two = frozen custard()
//        var three = drinks()
//        var four = beer()
        var result: String

        when(pick) {
            1 -> result = (one.order1(pick.toString()))
//            2 -> result = (two.order2(pick.toString()))
//            3 -> result = (three.order3(pick.toString()))
//            4 -> result = (four.order4(pick.toString()))
            6 -> result = println("돌아가기").toString() //readLine 복귀
            0 -> result = println("주문 취소").toString() // 0입력시 터미널 종료
            else -> result = println("돌아가기").toString()
        }
        return result
    }
}

class burgers {
    fun order1(pick: String): String {
        println("햄버거를 선택 하셨습니다. 원하시는 햅버거를 선택해 주세요")
        println("1.ShackBurgur, 2.SmokeShack, 3.`Shrome Burgur, 4.CheeseBurgur, 5.HamBurgur")
        var pick = readLine()!!.toInt()
        var detail = hamburgerDetail()
        var result:String

        when(pick) {
            1-> result = (detail.menu1()).toString()
            2-> result = (detail.menu2()).toString()
            3-> result = (detail.menu3()).toString()
            4-> result = (detail.menu4()).toString()
            5-> result = (detail.menu5()).toString()
            else-> result = println("처음으로 돌아가기").toString()
        }
        return result
    }
}

class hamburgerDetail{
    fun menu1(){
        var price = 6900
        var name = "ShackBurgur"
        println(name)
        println("가격 : ${price}원")
        println("수량을 입력해 주세요")
        var quantity = readLine()!!.toInt()
        println("${name} ${quantity}인분, 총합 ${price * quantity}원 입니다")
    }
    fun menu2(){
        var price = 8900
        var name = "SmokeShack"
        println(name)
        println("가격 : ${price}")
        println("수량을 입력해 주세요")
        var quantity = readLine()!!.toInt()
        println("${name} ${quantity}인분, 총합 ${price * quantity}원 입니다")
    }
    fun menu3(){
        var price = 9400
        var name = "`Shrome Burgur"
        println(name)
        println("가격 : ${price}")
        println("수량을 입력해 주세요")
        var quantity = readLine()!!.toInt()
        println("${name} ${quantity}인분, 총합 ${price * quantity}원 입니다")
    }
    fun menu4(){
        var price = 6900
        var name = "CheeseBurgur"
        println(name)
        println("가격 : ${price}")
        println("수량을 입력해 주세요")
        var quantity = readLine()!!.toInt()
        println("${name} ${quantity}인분, 총합 ${price * quantity}원 입니다")
    }
    fun menu5(){
        var price = 5400
        var name = "HamBurger"
        println(name)
        println("가격 : ${price}")
        println("수량을 입력해 주세요")
        var quantity = readLine()!!.toInt()
        println("${name} ${quantity}인분, 총합 ${price * quantity}원 입니다")
    }
}