fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    val (_n, m) = readInts()
    val n = _n * 2

    class Person(var p: Int, val k: Int, val hands: String, var rank: Int) {}
    val s = Array(n) { readLine()!! }

    var persons = (0..(n - 1)).map { Person(0, it, s[it], 0) }

    for (i in 0..(m - 1)) {
        for (j in 0..(n / 2 - 1)) {
            val p1 = persons.get(j * 2)
            val p2 = persons.get(j * 2 + 1)

            val h1 = p1.hands.substring(i, i + 1)
            val h2 = p2.hands.substring(i, i + 1)
            val c = "$h1$h2"

            when {
                c in "GC,CP,PG" -> {
                    p1.p += 1
                }
                c in "GP,CG,PC" -> {
                    p2.p += 1
                }
            }
        }
        persons = persons.sortedBy { -it.p * 1000 + it.k }
    }
    // persons = persons.sortedBy { it.k }
    for (i in 0..(n - 1)) {
        println(persons.get(i).k + 1)
    }
}
