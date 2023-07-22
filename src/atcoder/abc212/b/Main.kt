fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    val s = readLine()!!.chunked(1).map { it.toString().toInt() }

    fun isStep(a: Int, b: Int) = (a + 1) % 10 == b
    fun isWeek(s: List<Int>) =
            s[0] == s[1] && s[1] == s[2] && s[2] == s[3] ||
                    isStep(s[0], s[1]) && isStep(s[1], s[2]) && isStep(s[2], s[3])

    println(
            if (isWeek(s)) {
                "Weak"
            } else "Strong"
    )
}
