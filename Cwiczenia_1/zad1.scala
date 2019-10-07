object Zadanie1 {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List(
      "poniedziałek", 
      "wtorek",
      "środa",
      "czwartek",
      "piątek",
      "sobota",
      "niedziela")
    
    println(createStringUsingForLoop(daysOfWeek))
    println(createStringUsingForLoopWhereElemsStartWithP(daysOfWeek))
    println(createStringUsingWhileLoop(daysOfWeek))
  }
  
  def createStringUsingForLoop(list: List[String]) : String = {
    var result = ""
    var i = 0
    
    for(elem <- list) {
      if(i == 0) 
        result = elem
      else
        result = result + ", " + elem  
      
      i = i + 1
    }
    
    result
  }
  
  def createStringUsingForLoopWhereElemsStartWithP(list: List[String]) : String = {
    var result = ""
    var i = 0
    
    for(elem <- list.filter(_.toUpperCase().startsWith("P"))) {
      if(i == 0) 
        result = elem
      else
        result = result + ", " + elem  
      
      i = i + 1
    }
    
    result
  }
  
  def createStringUsingWhileLoop(list: List[String]) : String = {
    val numberOfElements = list.length;
    var i = 0;
    var result = ""
    
    while (i < numberOfElements) {
      if(i == 0) 
        result = list(i)
      else
        result = result + ", " + list(i)  
      i = i+1
    }
    
    result
  }
}