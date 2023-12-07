package com.example.kioskprogramming

class Frozencustard {
    fun fro1() {
        println("원하는 쉐이크를 고르시오")
        println("1. Classic Shakes    | W 5.9 | 쫀득하고 진한 커스타드가 들어간 클래식 쉐이크")
        println("2. Floats            | W 5.9 | 부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료")
        println("3. Cups              | W 5.9 | 매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림")
        println("0. 뒤로가기          | 뒤로가기")

        var fro2 = readLine()!!.toInt()

        while (true) {
            try {
                when (fro2) {
                    1 -> {
                        choice("1. Classic Shakes", 5.9)
                        break
                    }
                    2 -> {
                        choice("2. Floats", 5.9)
                        break
                    }
                    3 -> {
                        choice("3. Cups", 5.9)
                        break
                    }
                    0 -> {
                        println("0. 뒤로가기")
                        return main()
                    }
                    else -> {
                        println("다시 입력하시오")
                        return fro1()
                    }
                }
            } catch (e: java.lang.NumberFormatException) {
                println("숫자를 다시 입력하시오")
            }
        }
    }
}