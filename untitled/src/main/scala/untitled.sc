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