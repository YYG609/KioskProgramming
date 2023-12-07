package com.example.kioskprogramming

//[ 필요한 기능 ]
//요구사항1: 메인 메뉴판 화면
//: 메뉴 선택시 상세 메뉴화면으로 이동
//: 잘못된 번호 선택 시 예외처리
//: 프로그램 종료을 위한 번호 정의
//: 결제를 위한 번호 정의

//요구사항2: 상세 메뉴판 화면
//: 잘못된 번호 선택 시 예외처리
//: 결제를 위한 번호 정의
//: 메인 메뉴판으로 돌아가는 번호 정의

fun main() {
    println("키오스크")
    println("원하는 메인메뉴를 고르시오")
    println("1.Burgers           | 앵거스 비프 통살을 다져만든 버거")
    println("2.Forzen Custard    | 매장에서 신선하게 만드는 아이스크림")
    println("3.Drinks            | 매장에서 직접 만드는 음료")
    println("4.Beer              | 뉴욕 브루클린 브루어리에서 양조한 맥주")
    println("0.종료               | 프로그램 종료")

    var num1 = readLine()!!.toInt()
    while (true){

        try {
            when (num1) {
                1 -> {
                    Burgers().num2()
                    break}
                2 -> {
                    Frozencustard().fro1()
                    break}
                3 -> {
                    Drinks().drk1()
                    break}
                4 -> {
                    Beer().bee1()
                    break}
                0 -> {
                    println("종료합니다")
                    break}
                else -> {
                    println("다시입력하시오")
                    return main()
                }
            }
        } catch (e:java.lang.NumberFormatException){
            println("숫자를 다시 입력하시오")
        }
    }
}