import countingelements.MissingInteger
import countingelements.PermCheck
import iterations.Iterations
import sorting.Distinct
import timecomplexity.PermMissingElem

fun main(args: Array<String>) {

    // Lesson 1 Iterations
    // BinaryGap
    val iterations = Iterations()
//    println("\n" + iterations.solution(561892))

    // Leson 3 Time complexity
    // PermMissingElem
    val timeComlexity = PermMissingElem()
//    print("missing number: " + timeComlexity.solution(intArrayOf(1)))

    val missingInteger = MissingInteger()
//    print("missing Integer: " + missingInteger.solution(intArrayOf(1, 3, 6, 4, 1, 2)))

    // Lesson 4 Counting Elements
    // PermCheck
    val permCheck = PermCheck()
//    print(permCheck.solution(intArrayOf(1)))

    // Lesson 6 Sorting
    var distinct = Distinct()
    print("number of number distintcs: " + distinct.solution(intArrayOf(1, 2, 2, 3, 6, 9, 1, 7, 3)))
    
}