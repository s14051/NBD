object Zadanie10 {
  def main(args: Array[String]) : Unit = {
    val realNumbers = List(1.0, -2.0, -5.0, 10.0, -44.0, 0.0, 22.0, 12.0, -22.0, 13.0, 5.0)

    println(getAbsoluteValues(realNumbers))
  }
  
  def getAbsoluteValues(list: List[Double]) : List[Double] = {
    val isBetweenMinusFiveAndTwelveInclusive : Double => Boolean = v => v >= -5.0 && v <= 12.0;
    
    list.filter(isBetweenMinusFiveAndTwelveInclusive).map(_.abs):::list.filter(!isBetweenMinusFiveAndTwelveInclusive(_))
  }
}