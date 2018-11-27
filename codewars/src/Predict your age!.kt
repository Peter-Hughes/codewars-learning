import kotlin.math.sqrt

fun main (args: Array<String>) {
    println(predictAge(65, 60, 75, 55, 60, 63, 64, 45))
}

fun predictAge(vararg ages: Int) = sqrt(ages.map { it * it }.sum().toDouble()).toInt() / 2
