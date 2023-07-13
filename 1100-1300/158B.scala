/** This problem is rated as 1100 in Codeforces.
 *  https://codeforces.com/problemset/problem/158/B
 */

import scala.io.StdIn._

object Solve extends App {
    val _ = readInt

    val numbers = readLine.split(" ").map(_.toInt).toArray

    val counter = numbers groupBy(value => value) map {case (key, value) => (key, value.length)}

    def matching

    // try to make the greatest amount of operations equal to 4
    def solve(counter: Map[Int, Int], index: Int = 4, result: Int = 0) = index match {
        case 0 => result
        case _ =>
            val diff       = 4 - index
            val newCounter = if (diff equals 0) counter else counter + (diff -> (counter(index) - ))

            solve(newCounter, index - 1, result)
    }
}
