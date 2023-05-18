import scala.io.StdIn._

object Solve extends App {
    val n: Int = readInt

    def resolve(s: String): String = s.head + (s.length - 2).toString + s.last

    def func(n: Int): Int = n match {
        case 0 => 0
        case _ =>
            val w = readLine

            if (w.length > 10) println(resolve(w)) else println(w)
            func(n - 1)
    }

    func(n)
}