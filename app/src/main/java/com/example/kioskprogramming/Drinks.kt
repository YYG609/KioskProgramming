package com.example.kioskprogramming

class Drinks {
    fun drinkOrder() {
        println("\n메뉴(번호)를 선택해주세요\n")
        Menu("1. Shack-made Lemonade","W 3.9","매장에서 직접 만드는 상큼한 레몬에이드")
        Menu("2. Fresh Brewed Iced Tea","W 3.9","직접 유기농 홍차를 우려낸 아이스티")
        Menu("3. Fifty/Fifty","W 3.5","레몬에이드와 아이스티의 만남")
        Menu("4. Fountain Soda","W 2.7","코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프")
        Menu("5. Aibta Root Beer","W 4.4","청량감 있는 독특한 미국식 무알콜 탄산음료")
        Menu("6. Bottled Water","W 1.0","지리산 암반대수층으로 만든 프리미엄 생수")
        println("0. 뒤로가기")

        try {
            val drinkChoose = readLine()!!.toInt()
            val mainMenu = MainMenu()
            when (drinkChoose) {
                1 -> {
                    Menu("1. Shack-made Lemonade","W 3.9","주문")
                    return mainMenu.mainOrder()
                }
                2 -> {
                    Menu("2. Fresh Brewed Iced Tea","W 3.9","주문")
                    return mainMenu.mainOrder()
                }
                3 -> {
                    Menu("3. Fifty/Fifty","W 3.5","주문")
                    return mainMenu.mainOrder()
                }
                4 -> {
                    Menu("4. Fountain Soda","W 2.7","주문")
                    return mainMenu.mainOrder()
                }
                5 -> {
                    Menu("5. Aibta Root Beer","W 4.4","주문")
                    return mainMenu.mainOrder()
                }
                6 -> {
                    Menu("6. Bottled Water","W 1.0","주문")
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