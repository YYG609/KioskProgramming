package com.example.kioskprogramming

//      [필요한 기능]
//      요구사항1: 메인 메뉴판 화면
//      : 메뉴 선택시 상세 메뉴화면으로 이동
//      : 잘못된 번호 선택 시 예외처리
//      : 프로그램 종료를 위한 번호 정의

//      요구사항2: 상세 메뉴판 화면
//      : 메뉴 선택시 카운트 후, 메인메뉴로 이동
//      : 메인메뉴로 이동하는 뒤로가기 번호 정의

fun main(){
    val mainMenu = mainMenu()
    mainMenu.mainOrder()
}