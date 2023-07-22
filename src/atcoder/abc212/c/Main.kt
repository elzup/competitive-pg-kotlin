fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    val (n, ml) = readInts()
    val a = readInts().sorted()
    val b = readInts().sorted()

    var m = Int.MAX_VALUE

    for (v in a) {
        val i = b.binarySearch(v)
        if (i >= 0) {
            println(0)
            return
        }
        val p = -i - 1
        // println("$v $p $i")
        val b1 = b.getOrElse(p - 1) { b.first() }
        val b2 = b.getOrElse(p) { b.last() }
        val d1 = Math.abs(v - b1)
        val d2 = Math.abs(v - b2)
        // println(" $b1 $b2")
        // println("  $d1 $d2")

        m = minOf(m, d1, d2)
    }
    println(m)
}
