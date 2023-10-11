fun main()
{
    //implicit declaration
    val a = 5
    val b = 7
    // Explicit declaration
    val c : Double = 2.5

    val sum = a + b
    println("the sum is: $sum")

    val multiply = a * b
    println("the product is: $multiply")

    val minus = a - b
    println("the subtration is: $minus")

    val div = a / b
    println("the division is: $div")


    println(2.times(3))
    println(3.5.plus(4))
    println(2.4.div(2))

// my name
    var nishan = Alien()

    nishan.name = "Kibunja"
    nishan.name2 = "Franziska"

    println("My name is : ${nishan.name}")
    println("My name is : ${nishan.name2}")

}