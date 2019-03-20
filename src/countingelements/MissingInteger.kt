package countingelements

class MissingInteger {

    fun solution(A: IntArray): Int {
        val fixedArray = BooleanArray(100000)
        val bigNumber = 99999
        A.sort()
        A.forEach { value ->
            // if negative number, add big number
            if (value < 0) {
                val number = value + bigNumber
                fixedArray[number] = true
            } else {
                fixedArray[value] = true
            }
        }
        fixedArray.forEachIndexed { index, element ->
            if (index != 0 && !element) {
                return index
            }
        }
        return 0
    }
}