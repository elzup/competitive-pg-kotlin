fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map{ it.toInt() }
    
    var (n) = readInts()
    var a: Array<Int> = arrayOf()
    for (i in 1..n) {
        a += readInts()[0]
    }
    a.distinct().size.let { println(it) }

}

