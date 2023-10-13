import kotlin.io.readLine as readLine1

fun main()
{
    // ask the user to enter marks
    println("Enter your marks: ")

    // read input marks from the user
    val marks = readLine1()?.toIntOrNull()

    // check if the input is an integer
    if (marks != null && marks in 0..100)

    // determine the grade of the user based on the marks entered
    {
        val grade: String =
        if (marks >= 90)
        {
            "A"
        } else if (marks >= 80)
        {
            "B"
        } else if (marks >= 70)
        {
            "C"
        } else if (marks >= 60)
        {
            "D"
        } else
        {
            "F"
        }

        // feedback based on the student's grade
        when (grade)
        {
            "A" -> println("Excellent! You got an A.")
            "B" -> println("Good job! You got a B.")
            "C" -> println("Well done! You got a C.")
            "D" -> println("You passed, but you can do better. You got a D.")
            "F" -> println("Sorry, you failed. You got an F.")
            else -> println("Invalid input.")
        }
    }
    else
    {
        println("Invalid input. Please enter a valid numeric value!!!.")
    }
}
