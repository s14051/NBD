object Zadanie4 {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List(
      "poniedziałek", 
      "wtorek",
      "środa",
      "czwartek",
      "piątek",
      "sobota",
      "niedziela")
    
    println(makeCommaSeparatedStringUsingFoldl(daysOfWeek))
    println(makeCommaSeparatedStringUsingFoldr(daysOfWeek))
    println(makeCommaSeparatedStringUsingFoldlStartWithP(daysOfWeek))
  }
  
  def makeCommaSeparatedStringUsingFoldl(list: List[String]) : String = {
    list.tail.foldLeft(list.head)(_ + ", " + _)
  }
  
  def makeCommaSeparatedStringUsingFoldr(list: List[String]) : String = {
    list.dropRight(1).foldRight(list.last)(_ + ", " + _)
  }
  
  def makeCommaSeparatedStringUsingFoldlStartWithP(list: List[String]) : String = {
    list.filter(_.toUpperCase().startsWith("P")).tail.foldLeft(list.head)(_ + ", " + _)
  }
}