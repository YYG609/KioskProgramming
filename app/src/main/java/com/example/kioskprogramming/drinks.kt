package com.example.kioskprogramming

import java.lang.NumberFormatException

class drinks {
    fun drinkOrder() {
        println(" ")
        println("메뉴(번호)를 선택해주세요")
        println(" ")
        println("1. Shack-made Lemonade     | W 3.9(R) | 매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)")
        println("2. Fresh Brewed Iced Tea   | W 3.4(R) | 직접 유기농 홍차를 우려낸 아이스티")
        println("3. Fifty/Fifty             | W 3.5(R) | 레몬에이드와 아이스티의 만남")
        println("4. Fountain Soda           | W 2.7(R) | 코카콜라, 코카콜라 제로, 스프라티으, 환타 오렌지, 환타 그레이프")
        println("5. Abita Root Beer         | W 4.4(B) | 청량감 있는 독특한 미국식 무알콜 탄산음료")
        println("6. Bottled Water           | W 1.0(B) | 지리산 암반대수층으로 만든 프리미엄 생수")
        println("0. 뒤로가기                  | 뒤로가기")

        try {
            val drinkChoose = readLine()!!.toInt()
            val mainMenu = mainMenu()
            when (drinkChoose) {
                1 -> {
                    println("[ 1. Shack-made Lemonade   | W 3.9(R) | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }
                2 -> {
                    println("[ 2. Fresh Brewed Iced Tea | W 3.4(R) | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }
                3 -> {
                    println("[ 3. Fifty/Fifty           | W 3.5(R) | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }
                4 -> {
                    println("[ 4. Fountain Soda         | W 2.7(R) | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }
                5 -> {
                    println("[ 5. Abita Root Beer       | W 4.4(B) | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }
                6 -> {
                    println("[ 6. Bottled Water         | W 1.0(B) | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }
                0 -> {
                    println("[ 메인 메뉴 화면으로 이동합니다 ]")
                    return mainMenu.mainOrder()
                }
                else -> {
                    println("[ 번호를 다시 입력해주세요 ]")
                    return drinkOrder()
                }

            }
        } catch (e: NumberFormatException) {
            println("번호를 다시 입력해주세요")
            return drinkOrder()
        }
    }
}