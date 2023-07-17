fun main() {
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    val (_n) = readInts()
    val a = readInts()

    var min = Int.MAX_VALUE
    for (v in a) {
        val res = Integer.toBinaryString(v).reversed().indexOfFirst { it == '1' }
        min = minOf(min, res)
    }
    println(min)
}
