object Zadanie6 {
  def main(args: Array[String]) : Unit = {
    val tuple = ("jakiś string", 22, true)
    printTuple(tuple)
  }
  
  def printTuple(tuple : Tuple3[String, Int, Boolean]) : Unit = {
    println(tuple._1 + ", " + tuple._2 + ", " + tuple._3)
  }
}