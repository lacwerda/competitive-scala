/** This problem is rated as 800 in Codeforces.
 *  https://codeforces.com/problemset/problem/4/A
 */

import scala.io.StdIn.readInt

object Solve extends App {
    val w = readInt

    if ((w % 2 equals 0) && (w > 2)) println("YES") else println("NO")
}