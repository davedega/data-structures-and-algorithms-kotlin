package iterations

class Iterations {
    fun solution(x: Int): Int {
        val binaryString = Integer.toBinaryString(x)
        var firstOne = false
        var maxZero = 0
        var currZeros = 0
        binaryString.reversed().forEachIndexed { index: Int, c: Char ->
            print(c)
            if (!c.equals('0')) {
                firstOne = true
            }
            if (firstOne) {
                if (c.equals('0')) {
                    currZeros++
                } else {
                    if (currZeros > maxZero) {
                        maxZero = currZeros
                        currZeros = 0
                    }
                }
            }
        }
        return maxZero
    }
}