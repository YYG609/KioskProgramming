package com.example.kioskprogramming

class Beer {
    fun bee1() {
        println("원하는 맥주를 고르시오")
        println("1. Slow IPA                | W 6.8  | The Hand and Malt")
        println("2. Gorillager              | W 6.8  | Gorilla Brewing Co, Busan")
        println("3. Shack Red™              | W 29.9 | 진하고 스파이시한 레드 와인")
        println("4. Shack White™            | W 29.9 | 맑과 상큼한 화이트 와인")
        println("5. ShackMeister™ Ale       | W 6.8  | 쉐이크쉑을 위해 핸드앤올트에서 특별히 양조한 에일 맥주")
        println("0. 뒤로가기                  | 뒤로가기")

        var bee2 = readLine()!!.toInt()

        while (true) {

            try {
                when (bee2) {
                    1 -> {
                        choice("1. Slow IPA",6.8 )
                        break
                    }
                    2 -> {
                        choice("2. Gorillager",6.8)
                        break
                    }
                    3 -> {
                        choice("3. Shack Red™", 29.9)
                        break
                    }
                    4 -> {
                        choice("4. Shack White™", 29.9)
                        break
                    }
                    5 -> {
                        choice("5. ShackMeister™ Ale", 6.8)
                    }
                    0 -> {
                        println("0. 뒤로가기")
                        return main()
                    }
                    else -> {
                        println("다시 입력하시오")
                        return bee1()
                    }
                }
            } catch (e: java.lang.NumberFormatException) {
                println("숫자를 다시 입력하시오")
            }
        }
    }
}