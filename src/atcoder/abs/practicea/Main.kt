
fun readInts() = readLine()!!.split(" ").map{ it.toInt() }

fun main(args: Array<String>) {
    var (a) = readInts()
    var (b, c) = readInts()
    var s = readLine()!!
    println("${a+b+c} $s")
}
