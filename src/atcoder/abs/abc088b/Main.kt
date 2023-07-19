fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map{ it.toInt() }
    
    readInts()
    val a = readInts()
    val res = a.sorted().reversed().mapIndexed {
        i, v -> listOf(i, v)
    } .groupBy({ (i, v) -> i % 2 }, { (i, v) -> v })
    .values.map { it.sum() }


    println(res[0] - (res[1] ?: 0))
}

