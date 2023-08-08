fun main() {
    println("Enter the starting number:")
    val start = readlnOrNull()?.toIntOrNull() ?: 1
    println("Enter the ending:")
    val end = readlnOrNull()?.toIntOrNull() ?: 98
    val result = divided(start, end)
    println("Number of numbers are: $result")
}
fun divided(start: Int, end: Int): Int {
    return end / 7 - (start - 1) / 7
}
//another solution
/*fun main() {
    println("Enter the starting number:")
    val start = readlnOrNull()?.toIntOrNull() ?: 1
    println("Enter the ending:")
    val end = readlnOrNull()?.toIntOrNull() ?: 98
    var count = 0
    for (num in start until end)
    {
        if(num%7==0)
        {
            count++
        }
    }
    println("Number of numbers are: $count")
}*/