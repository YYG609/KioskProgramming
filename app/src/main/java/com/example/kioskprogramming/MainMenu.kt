package com.example.kioskprogramming

class MainMenu {
    fun mainOrder(){
        try {
            println("\n아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n")
            println("[ SHAKESHACK MENU ]")
            println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
            println("2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림")
            println("3. Drinks          | 매장에서 직접 만드는 음료")
            println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
            println("0. 주문 종료         | 주문 종료")

            val mainChoose = readLine()!!.toInt()
            val burgers = Burgers()
            val frozenCustard = FrozenCustard()
            val drinks = Drinks()
            val beer = Beer()

            when (mainChoose) {
                1 -> burgers.burgerOrder()
                2 -> frozenCustard.frozenOrder()
                3 -> drinks.drinkOrder()
                4 -> beer.beerOrder()
                0 -> {
                    println(" ")
                    println("주문을 종료합니다")
                }
                else -> {
                    println("번호를 다시 입력해주세요")
                    return mainOrder()
                }
            }
        } catch (e: NumberFormatException){
            println("번호를 다시 입력해주세요")
            return mainOrder()
        }
    }
}