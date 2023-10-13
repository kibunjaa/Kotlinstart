fun isPrime(num: Int): Boolean
{
    if (num <= 1)
    {
        return false // 0 and 1 are not prime numbers
    }
    for (i in 2..<num)
    {
        if (num % i == 0)
        {
            return false // If num is divisible by any number between 2 and num-1, it's not prime
        }
    }
    return true // If num is not divisible by any number between 2 and num-1, it's a prime number
}

fun main()
{
    println("Prime numbers between 1 and 1000 are:")
    for (i in 1..1000)
    {
        if (isPrime(i))
        {
            println(i) // Print the prime number
        }
    }
}
