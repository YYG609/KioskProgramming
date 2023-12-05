package com.example.kioskprogramming

import java.lang.NumberFormatException

class burgers {
    fun burgerOrder() {
        println(" ")
        println("메뉴(번호)를 선택해주세요")
        println(" ")
        println("1. ShackBurger     | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeBurger     | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. ShroomBurger    | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("4. CheeseBurger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("5. Hamburger       | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
        println("0. 뒤로가기         | 뒤로가기")

        try {
            val burgerChoose = readLine()!!.toInt()
            val mainMenu = mainMenu()
            when (burgerChoose) {
                1 -> {
                    println("[ 1. ShackBurger   | W 6.9 | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }

                2 -> {
                    println("[ 2. SmokeBurger   | W 8.9 | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }

                3 -> {
                    println("[ 3. ShroomBurger  | W 9.4 | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }

                4 -> {
                    println("[ 4. CheeseBurger  | W 6.9 | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }

                5 -> {
                    println("[ 5. HamBurger     | W 5.4 | 를 주문하셨습니다 ]")
                    return mainMenu.mainOrder()
                }

                0 -> {
                    println("[ 메인 메뉴 화면으로 이동합니다 ]")
                    return mainMenu.mainOrder()
                }

                else -> {
                    println("[ 번호를 다시 입력해주세요 ]")
                    return burgerOrder()
                }

            }
        } catch (e: NumberFormatException) {
            println("번호를 다시 입력해주세요")
            return burgerOrder()
        }
    }
}