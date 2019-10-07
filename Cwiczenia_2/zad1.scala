object Zadanie1 {
  val weekdays = List("poniedziałek", "wtorek", "środa", "czwartek", "piątek")
  val nonWorkingDays = List("sobota", "niedziela")
  
  def main(args: Array[String]) : Unit = {
    println(checkDay("poniedziałek"))
    println(checkDay("wtorek"))
    println(checkDay("środa"))
    println(checkDay("czwartek"))
    println(checkDay("piątek"))
    println(checkDay("sobota"))
    println(checkDay("niedziela"))
    println(checkDay("coś innego"))
  }
  
  def checkDay(str: String) : String = {
    str match {
      case x: String if weekdays.contains(x) => "Praca"
      case x: String if nonWorkingDays.contains(x) => "Weekend"
      case _ => "Nie ma takiego dnia"
    }
  }
}