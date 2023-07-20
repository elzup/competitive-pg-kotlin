typealias Matrix = Array<Array<Int>>

fun main(args: Array<String>) {

    fun readInts() = readLine()!!.split(" ").map { it.toInt() }

    fun createLaplaceMarix(matrix: Matrix, n: Int, line: Int, col: Int): Matrix {

        val laplace_marix: Matrix = Array(n - 1) { Array(n - 1) { 0 } }
        var y = 0
        for (i in 0..n - 1) {
            if (i == col) continue
            var x = 0
            for (j in 0..n - 1) {
                if (i == line || j == col) continue
                if (j == line) continue
                laplace_marix[y][x] = matrix[i][j]
                x++
            }
            y++
        }
        return laplace_marix
    }

    fun dat(matrix: Matrix, n: Int): Int {

        if (matrix.size == 1) return matrix[0][0]
        if (matrix.size == 2) return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1]
        var sum = 0
        for (j in 0..matrix.size - 1) {
            val sign = if ((j % 2) == 0) 1 else -1
            val laplace_marix = createLaplaceMarix(matrix, n, 0, j)
            sum += sign * matrix[j][0] * dat(laplace_marix, n - 1)
        }
        return sum
    }
    fun changeColumn(matrix: Matrix, n: Int, col1: Int, col2: Int): Matrix {
        val tempMat: Matrix = Array(n) { Array(n + 1) { 0 } }
        for (i in 0..n - 1) {
            for (j in 0..n) {
                tempMat[i][j] = matrix[i][j]
            }
        }

        for (i in 0..n - 1) {
            val temp = tempMat[i][col1]
            tempMat[i][col1] = tempMat[i][col2]
            tempMat[i][col2] = temp
        }
        return tempMat
    }

    val (n, y) = readInts()

    fun solve(matrix: Matrix, d: Int): Array<Int> {
        val denominator = dat(matrix, d)
        val result = Array(d) { 0 }
        for (i in 0..d - 1) {
            val numeMat = changeColumn(matrix, d, i, d)
            result[i] = dat(numeMat, d) / denominator
        }
        return result
    }

    val maxI = y / 10000 + 1
    for (i in maxI downTo 0) {
        val matrix = arrayOf(arrayOf(5000, 1000, y - 10000 * i), arrayOf(1, 1, n - i))
        val (a, b) = solve(matrix, 2)
        if (a >= 0 && b >= 0 && i * 10000 + a * 5000 + b * 1000 == y && i + a + b == n
        ) { // 整数でのチェック
            println("$i $a $b")
            return
        }
    }

    println("-1 -1 -1")
}
