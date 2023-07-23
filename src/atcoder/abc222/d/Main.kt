fun main(args: Array<String>) {
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    val (n) = readInts()
    val a = readInts()
    val b = readInts()
    val mod = 998244353
    val max = 3000

    val dp = Array(n + 1) { IntArray(max + 1) { 0 } }
    dp[0].fill(1)

    for (i in 0..(n - 1)) {
        for (j in a[i]..b[i]) {
            dp[i + 1][j] += dp[i][j]
            dp[i + 1][j] %= mod
        }
        for (j in 0..(max - 1)) {
            dp[i + 1][j + 1] += dp[i + 1][j]
            dp[i + 1][j + 1] %= mod
        }
    }
    // print(dp.map { it.toList() }.toList())
    println(dp[n][max])
}
