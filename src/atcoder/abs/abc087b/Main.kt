fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map{ it.toInt() }
    
    val (a) = readInts()
    val (b) = readInts()
    val (c) = readInts()
    val (x) = readInts()
    var t = 0
    for (i in 0..a) {
        for (j in 0..b) {
            for (k in 0..c) {
                if (500*i + 100*j + 50*k == x) {
                    t++
                }
            }
        }
    }

    println(t)
}

