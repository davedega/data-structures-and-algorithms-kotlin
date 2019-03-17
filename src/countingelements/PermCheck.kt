package countingelements

class PermCheck {

    fun solution(A: IntArray): Int {
        if (A.size == 1) {
            return 1
        }
        val occurences = BooleanArray(A.size + 1)
        occurences[0] = true
        var isPerm = true
        A.sort()
        // if max value is equal to array size continue
        if (A[A.size - 1] == A.size) {
            A.forEachIndexed { index, value ->
                occurences[value] = true
            }
            occurences.forEach { element ->
                if (!element) {
                    isPerm = false
                }
            }
            if (isPerm) return 1 else 0
        } else {
            return 0
        }
        return 0
    }
}