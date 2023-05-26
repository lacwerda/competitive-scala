# Competitive Scala

This repository contains Accepted solutions for Codeforces problems using [Scala](https://www.scala-lang.org/).

<p align="center">
  <img width=38% alt="Screenshot 2023-05-19 at 22 35 08" src="https://github.com/lacwerda/competitive-scala/assets/43220266/0e1df39b-d014-4669-9e98-3354861f06c4">
</p>

Most of the problems solved are in the [Codeforces Problemset](https://codeforces.com/problemset).

Codeforces uses the 2.12.8 version of Scala.

Ratings range from `800` to `3200`, 800 begin the easiest problem and 3200 begin the hardest. The names of the folders containing the solutions describe these ranges.

- `800-1000`: Problems with ratings ranging from 800 to 1000 (inclusive).
- `1100-1300`: Problems with ratings ranging from 1100 to 1300 (inclusive).

Codeforces only supports Scala code that can be parsed into the regular expression `[^{}]*object\s+(\w+)`, meaning that your program needs to be written in the following format.

```scala
import scala.io.StdIn._

object Solve extends App {
    val something = readLine

    println(something)
}
 ```

--------

The problems are all highly based on recursion, since Scala is a functional language and performs much better with recursion than for loops, for example. The following list displays problems and its classifications based on content.

Problems classified by topic:
* Math
  * [1A](800-1000/1A.scala)
  * [4A](800-1000/4A.scala)
* Brute Force
  * [4A](800-1000/4A.scala)
* Strings
  * [71A](800-1000/71A.scala)
