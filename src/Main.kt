import countingelements.PermCheck
import iterations.Iterations

fun main(args: Array<String>) {

    // Lesson 1 Iterations
    // BinaryGap
    val iterations = Iterations()
    println("\n"+iterations.solution(561892))

    // Lesson 4 Counting Elements
    // PermCheck
    val permCheck = PermCheck()
    val test = intArrayOf(1)
    print(permCheck.solution(test))
}