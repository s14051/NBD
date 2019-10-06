object HelloWorld {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List(
      "poniedziałek", 
      "wtorek",
      "środa",
      "czwartek",
      "piątek",
      "sobota")
    
    printListUsingWhileLoop(daysOfWeek)
  }
  
  def printListUsingForLoop(list: List[String]) : Unit = {
    for(elem <- list) {
      println(elem)
    }
  }
  
  def printListUsingForLoopWhereElemsStartWithP(list: List[String]) : Unit = {
    for(elem <- list.filter(_.toUpperCase().startsWith("P"))) {
      println(elem)
    }
  }
  
  def printListUsingWhileLoop(list: List[String]) : Unit = {
    val numberOfElements = list.length;
    var i = 0;
    
    while (i < numberOfElements) {
      println(list(i))
      i = i+1
    }
  }
}