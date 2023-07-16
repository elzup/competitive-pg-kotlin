
fun main(args: Array<String>) {
    val (n, p, q) = readLine()!!.split(" ").map{ it.toInt() }
    var d = readLine()!!.split(" ").map{ it.toInt() }
    d += p - q
    println(d.min()!! + q)
}
