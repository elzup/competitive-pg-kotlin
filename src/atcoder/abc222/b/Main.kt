fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    var (n, p) = readInts()
    var a = readInts()
    a.count { it < p }.let { println(it) }
}
