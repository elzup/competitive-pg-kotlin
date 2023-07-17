

fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map{ it.toInt() }

    var (a) = readInts()
    var (b, c) = readInts()
    var s = readLine()!!
    println("${a+b+c} $s")
}
