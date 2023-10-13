fun main()
{
    // Arrays in Kotlin
    val students = arrayOf("David", "Kibunja","Jeff","Hope","Maurine","Kimani")

    // changing members within the array
    students[1] = "Israel"
    students[3] = "Hamas"

    // Displaying a member of the array
    println(students[1])

    // Display the length of the array
    println(students.size)

    // Display all members of the array
   for (a in students)
   {
       println(a)
   }
}