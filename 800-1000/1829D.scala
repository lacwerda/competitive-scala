/** This problem is rated as 1000 in Codeforces.
 *  https://codeforces.com/problemset/problem/1829/D
 */

import scala.io.StdIn._

object Solve extends App {
    val memoization: Map[Int, (Int, Int)] = Map()

    def func(n: Int): Unit = n match {
        case 0 => return
        case _ =>
            val (n, m) = readLine.split(" ").map(_.toInt).toSeq match {
                Seq(a, b, _*) => (a, b)
            }

            func(n - 1)
    }

    def solve(number: Int, z: Int) = number match {
        case z => return 
    }

    loop(readInt)
}