fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map{ it.toInt() }
    
    val (n, a, b) = readInts()

    fun sum_digits(x: Int): Int {
        return x.toString().map{ it.toString().toInt() } .sum()
    }
    var t = 0
    for (x in 1..n) {
        val sum = sum_digits(x)
        if (a <= sum && sum <= b) {
            t += x
        }
    }
    println(t)
}

