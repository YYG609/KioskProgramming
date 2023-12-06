package com.example.kioskprogramming

class Beer {

    fun beerOrder() {
        println("\n메뉴(번호)를 선택해주세요\n")
        Menu("1. ShackMeister Ale","W 9.8","쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주")
        Menu("2. Magpie Brewing Co.","W 6.8"," ")
        println("0. 뒤로가기")

        try {
            val beerChoose = readLine()!!.toInt()
            val mainMenu = MainMenu()
            when (beerChoose) {
                1 -> {
                    Menu("1. ShackMeister Ale","W 9.8","주문")
                    return mainMenu.mainOrder()
                }
                2 -> {
                    Menu("2. Magpie Brewing Co.","W 6.8","주문")
                    return mainMenu.mainOrder()
                }
                0 -> {
                    println("[ 메인 메뉴 화면으로 이동합니다 ]")
                    return mainMenu.mainOrder()
                }
                else -> {
                    println("[ 번호를 다시 입력해주세요 ]")
                    return beerOrder()
                }
            }
        } catch (e: NumberFormatException) {
            println("번호를 다시 입력해주세요")
            return beerOrder()
        }
    }
}