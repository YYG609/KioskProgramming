package com.example.kioskprogramming

class FrozenCustard {
    fun frozenOrder(){
        println("\n메뉴(번호)를 선택해주세요\n")
        Menu("1. Shake", "W 5.9", "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피")
        Menu("2. Shake of the Week", "W 6.5", "특별한 커스터드 플레이버")
        Menu("3. Red Bean Shake", "W 6.5", "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크")
        Menu("4. Floats", "W 5.9", "루트 비어, 퍼플 카우, 크림시클")
        println("0. 뒤로가기")

        try {
            val frozenChoose = readLine()!!.toInt()
            val mainMenu = MainMenu()
            when (frozenChoose) {
                1 -> {
                    Menu("1. Shake", "W 5.9", "주문")
                    return mainMenu.mainOrder()
                }
                2 -> {
                    Menu("2. Shake of the Week", "W 6.5", "주문")
                    return mainMenu.mainOrder()
                }
                3 -> {
                    Menu("3. Red Bean Shake", "W 6.5", "주문")
                    return mainMenu.mainOrder()
                }
                4 -> {
                    Menu("4. Floats", "W 5.9", "주문")
                    return mainMenu.mainOrder()
                }
                0 -> {
                    println("[ 메인 메뉴 화면으로 이동합니다 ]")
                    return mainMenu.mainOrder()
                }
                else -> {
                    println("[ 번호를 다시 입력해주세요 ]")
                    return frozenOrder()
                }
            }
        } catch (e: NumberFormatException) {
            println("번호를 다시 입력해주세요")
            return frozenOrder()
        }
    }
}