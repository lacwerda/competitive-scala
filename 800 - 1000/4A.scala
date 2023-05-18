import scala.io.StdIn.readInt

object Solve extends App {
    val w = readInt

    if ((w % 2 equals 0) && (w > 2)) println("YES") else println("NO")
}