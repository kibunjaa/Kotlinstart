fun main() {
    val n = 30 // Change this value to generate the first n Fibonacci numbers
    var first = 0
    var second = 1

    println("Fibonacci sequence of first $n numbers:")
    for (i in 1..n) {
        print("$first ")
        val sum = first + second
        first = second
        second = sum
    }
}
