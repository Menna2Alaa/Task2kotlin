fun main() {
    println("Enter the starting number of the range:")
    val start = readlnOrNull()?.toIntOrNull() ?: 1
    println("Enter the ending number of the range:")
    val end = readlnOrNull()?.toIntOrNull() ?: 30
    var first=start
    for(num in start..end)
    {
        if(first%3==0&&first%5==0){
            break
        }
        if(num%3==0)
        {
            continue
        }
        println(num)
    }
}

