object HelloWorld {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List(
      "poniedziałek", 
      "wtorek",
      "środa",
      "czwartek",
      "piątek",
      "sobota",
      "niedziela")
    
    println(tailrecCommaSeparatedString(daysOfWeek))
  }
  
  def tailrecCommaSeparatedString(list: List[String]) : String = {
    @tailrec
    def tailrecHelper(list: List[String], result: String) : String = {
      if(list.isEmpty)
        result
      else 
        tailrecHelper(list.tail, result + ", " + list.head)
    }
    
    tailrecHelper(list.tail, list.head)
  }
}