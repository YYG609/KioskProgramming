package com.example.kioskprogramming

class Burgers {
    fun num2() {
        println("원하는 버거를 고르시오")
        println("1. ShackBurger     | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeBurger     | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. ShroomBurger    | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("4. CheeseBurger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("5. Hamburger       | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
        println("0. 뒤로가기          | 뒤로가기")

        var num3 = readLine()!!.toInt()

        while (true) {
            try {

                when (num3) {
                    1 -> {
                        choice("1. ShackBurger", 6.9)
                        break
                    }
                    2 -> {
                        choice("2. SmokeBurger", 8.9)
                        break
                    }
                    3 -> {
                        choice("3. ShroomBurger", 9.4)
                        break
                    }
                    4 -> {
                        choice("4. CheeseBurger", 6.9)
                        break
                    }
                    5 -> {
                        choice("5. Hamburger", 5.4)
                        break
                    }
                    0 -> {
                        println("0. 뒤로가기")
                        return main()
                    }
                    else -> {
                        println("다시 입력하시오")
                        return num2()
                    }
                }
            } catch (e: java.lang.NumberFormatException) {
                println("숫자를 다시 입력하시오")
            }
        }
    }
}