package timecomplexity

class PermMissingElem {

    fun solution(A: IntArray): Int {
        if (A.size == 1) {
            if(A[0] == 0){
                return 1
            }
        }
        A.sort()
        A.forEachIndexed { index, value ->
            if (value - 1 != index) {
                return value - 1
            }
        }
        return 0
    }
}