package com.example.kioskprogramming

class Drinks {
    fun drk1() {
        println("원하는 음료를 고르시오")
        println("1. Lemonade                  | W 4.5 | 매장에서 직접 만드는 상큼한 레몬에이드")
        println("2. Fresh Brewed Iced Tea     | W 3.9 | 직접 유기농 홍차를 우려낸 아이스 티")
        println("3. Fifty/Fifty™              | W 4.4 | 레몬에이드와 유기농 아이스 티가 만나 탄생한 시그니처 음료")
        println("4. Bottled Water             | W 1.5| 지리산 암반대수층으로 만든 생수")
        println("5. Fountain Soda             | W 3.3 | 탄산음료")
        println("6. Abita Root Beer           | W 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료")
        println("7. Hot Tea                   | W 3.4 | 보성 유기농 찻잎을 우련낸 녹차,홍차,페퍼민트&레몬그라스")
        println("0. 뒤로가기                   | 뒤로 가기")

        var drk2 = readLine()!!.toInt()

        while (true) {
            try {
                when (drk2) {
                    1 -> {
                        choice("1. Lemonade", 4.5)
                        break
                    }
                    2 -> {
                        choice("2. Fresh Brewed Iced Tea", 3.9)
                        break
                    }
                    3 -> {
                        choice("3. Fifty/Fifty™", 4.4)
                        break
                    }
                    4 -> {
                        choice("4. Bottled Water", 1.5)
                        break
                    }
                    5 -> {
                        choice("5. Fountain Soda", 3.3)
                        break
                    }
                    6 -> {
                        choice("6. Abita Root Beer", 4.4)
                        break
                    }
                    7 -> {
                        choice("7. Hot Tea", 3.4)
                        break
                    }
                    0 -> {
                        println("0. 뒤로가기")
                        return main()
                    }
                    else -> {
                        println("다시 입력하시오")
                        return drk1()
                    }
                }
            } catch (e: java.lang.NumberFormatException) {
                println("숫자를 다시 입력하시오")
            }
        }
    }
}