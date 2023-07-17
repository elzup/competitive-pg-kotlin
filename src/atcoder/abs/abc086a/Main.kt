fun main() {
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    var (a, b) = readInts()
    println(arrayOf("Even", "Odd")[a * b % 2])
}
