fun main(args: Array<String>) {

    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    val (n, price) = readInts()

    val maxI = price / 10000 + 1
    val (a, b, c, d) = listOf(5000, 1000, 1, 1)
    val deno = a * d - b * c
    for (x in maxI downTo 0) {
        val (p, q) = listOf(price - 10000 * x, n - x)
        val y = (p * d - q * b) / deno
        val z = (a * q - c * p) / deno
        // println("$x $y $z ")
        if (y >= 0 && z >= 0 && x * 10000 + y * 5000 + z * 1000 == price && x + y + z == n
        ) { // 整数でのチェック
            println("$x $y $z")
            return
        }
    }

    println("-1 -1 -1")
}
