fun main(args: Array<String>) {
    val words = "dream dreamer erase eraser".split(" ").map { it.reversed() }
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    var s = readLine()!!.reversed()
    while (s.isNotEmpty()) {

        val hit = words.find { s.startsWith(it) }
        if (hit == null) {
            break
        }

        s = s.substring(hit.length)
    }

    println(if (s.length == 0) "YES" else "NO")
}
