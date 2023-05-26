/** This problem is rated as 1000 in Codeforces.
 *  https://codeforces.com/problemset/problem/1/A
 */

import scala.io.StdIn._

object Solve extends App {
    val w = readLine

    val (n, m, a): (Long, Long, Long) = w.split(" ").map(_.toLong).toSeq match {
        case Seq(a, b, c, _*) => (a, b, c)
    }
    
    val (d, e) = ((n.toDouble/a).ceil, (m.toDouble/a).ceil)
    
    println((d*e).toLong)
}