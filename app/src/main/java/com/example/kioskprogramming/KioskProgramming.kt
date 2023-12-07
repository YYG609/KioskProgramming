package com.example.kioskprogramming

//[ 필요한 기능 ]
//요구사항1: 메인 메뉴판 화면
//: 메뉴 선택시 상세 메뉴화면으로 이동
//: 잘못된 번호 선택 시 예외처리
//: 프로그램 종료을 위한 번호 정의
//: 메뉴판 번호 제외 번호 입력시 재입력
//요구사항2: 상세 메뉴화면에서 추가주문 여부
//: 장바구니에 선택한 목록 저장
//요구사항3: 결제 화면과 금액 표출
//:
//요구사항4: ~~~
fun main() {
    var picks = mapOf(1 to "Burgers", 2 to "Shackes", 3 to "Drinks", 0 to "종료")
    var burgerpicks = mapOf(1 to "Shack Burger", 2 to "Smoke Shack", 3 to "Shack Shack", 0 to "뒤로가기")
    var Shackespicks = mapOf(1 to "Shack of the Week", 2 to "Red Bean Shacke", 3 to "Floats", 0 to "뒤로가기")
    var Drinkspicks = mapOf(1 to "Fresh Brewed Iced Tea", 2 to "Fifty/Fifty", 3 to "Fountain Soda", 0 to "뒤로가기")

    for (menupick in picks) {

        println("아래 메뉴판을 보시고 메뉴를 골라 입력해 주세요.")
        println("[SHAKESHACKE MENU]")
        println("1. Burgers     | 앵거스 비프 통살을 다져만든 버거")
        println("2. Shackes     | 매장에서 신선하게 만드는 쉐이크")
        println("3. Drinks      | 매장에서 직접 만드는 음료")
        println("0. 종료         | 프로그램 종료")
        var menupick = 0
        var menupick1 = 0
        try {
            menupick = readln()!!.toInt()
            println("${picks[menupick]}를 선택했습니다")


        } catch (e: NumberFormatException) {
            e.printStackTrace()
            println("메뉴에 해당하는 숫자를 입력해 주세요")
            continue
        }
        if (menupick > 3) {
            println("1, 2, 3, 0번 중에 선택해주세요")
            continue

        } else if (menupick == 1) {
            println("-----------------Burgers-----------------")
            println("1. Shack Burger    | W 7.0 |   (토마토, 양상추, 쉑소스가 토핑된 치즈버거")
            println("2. Smoke Shack     | W 9.0 |   (애플 무드 칩으로 훈연한 베이컨, 매콤한 체리 페퍼에 쉑소스가 토핑된 치즈 버거)")
            println("3. Shack Shack     | W13.0 |    (슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴)")
            println("0. 뒤로가기         | 뒤로가기")
            for (menupick in burgerpicks) {

                try {
                    menupick1 = readln()!!.toInt()
                    println("${burgerpicks[menupick1]}를 선택했습니다")


                } catch (e: NumberFormatException) {  //숫자가 아닌 값을 입력했을때 예외처리
                    e.printStackTrace()
                    println("메뉴에 해당하는 숫자를 입력해 주세요")
                    continue

                }
                if (menupick1 > 3) {  //메뉴 숫자외 다른 숫자 입력했을떄 다시 입력
                    println("1, 2, 3, 0번 중에 선택해주세요")
                    continue

                }
                println("추가 주문 하시겠습니까?")
                menupick1 = readln()!!.toInt()
                if (menupick1 < 4) {
                    println("${burgerpicks[menupick1]}를 선택했습니다")
                    println("추가 주문 하시겠습니까?")
                    continue
                } else if (menupick1 > 3) {
                    println("1, 2, 3, 0번 중에 선택해주세요")
                    continue
                } else if (menupick1 == 0) {
                    println("메인화면으로 돌아갑니다")
                    break
                }
            }


        } else if (menupick == 2) {
            println("-----------------Shackes-----------------")
            println("1. Shack of the Week   | W 7.0 |   (특별한 커스터드 플레이버)")
            println("2. Red Bean Shacke     | W 7.0 |   (신선한 커스터드와 함꼐 우유와 레드빈이 블렌딩 된 시즈널 쉐이크")
            println("3. Floats              | W 6.0 |   (루트 비어, 퍼플 카우, 크림시클")
            println("0. 뒤로가기             | 뒤로가기")
            var pick2 = readln()!!.toInt()
            if (pick2 == 0) {
                continue
            }


        } else if (menupick == 3) {
            println("-----------------Drinks-----------------")
            println("1. Fresh Brewed Iced Tea   | W 4.0 |   (직접 유기농 홍차를 우려낸 아이스티")
            println("2. Fifty/Fifty             | W 4.0 |   (레몬에이드와 아이스티의 만남")
            println("3. Fountain Soda           | W 3.0 |   (코카콜라, 스프라이트, 환타")
            println("0. 뒤로가기                 | 뒤로가기")
            var pick3 = readln()!!.toInt()
            if (pick3 == 0) {
            }


        } else if (menupick == 0) {

            println("프로그램을 종료합니다")
            break

        }
    }


}