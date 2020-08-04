//Tuples
val pair: (Int, String) = (99, "Luftballons")
println(pair._1)
println(pair._2)

import scala.collection.mutable
val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))

class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1) //auxiliary constructor

  override def toString = s"$numer/$denom"

  def add(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
}

val oneHalf = new Rational (1, 2)
val twoThirds = new Rational (2, 3)
oneHalf add twoThirds
