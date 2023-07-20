fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    var (n) = readInts()

    var (t, x, y) = arrayOf(0, 0, 0)
    for (i in 1..n) {
        val (t2, x2, y2) = readInts()
        val dt = t2 - t
        val dxy = Math.abs(x2 - x) + Math.abs(y2 - y)

        if (dxy > dt || dxy % 2 != dt % 2) {
            println("No")
            return
        }

        t = t2
        x = x2
        y = y2
    }
    println("Yes")
}
