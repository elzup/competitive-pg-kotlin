fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    val (a, b) = readInts()
    fun check(a: Int, b: Int) =
            when {
                a == 0 -> "Silver"
                b == 0 -> "Gold"
                else -> "Alloy"
            }

    check(a, b).let(::println)
}
