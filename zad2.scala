object Zadanie2 {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List(
      "poniedziałek", 
      "wtorek",
      "środa",
      "czwartek",
      "piątek",
      "sobota",
      "niedziela")
    
    println(makeReversedCommaSeparatedStringFrom(daysOfWeek))
  }
  
  def makeCommaSeparatedStringFrom(list: List[String]) : String = {
    if (!list.tail.isEmpty)
      list.head + ", " + makeCommaSeparatedStringFrom(list.tail)
    else 
      list.head
  }
  
  def makeReversedCommaSeparatedStringFrom(list: List[String]) : String = {
    if (!list.tail.isEmpty)
      makeReversedCommaSeparatedStringFrom(list.tail) + ", " + list.head
    else 
      list.head
  }
}