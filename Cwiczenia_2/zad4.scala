object Zadanie4 {
  def main(args: Array[String]) : Unit = {
    println(manipulateInt(2, n => n*2))
  }
  
  def manipulateInt(someInt: Int, intFun: Int => Int) : Int = {
    var i = 0
    
    def helper(v: Int, i: Int) : Int = {
      if(i < 3) 
        helper(intFun(v), i + 1)
      else 
        v
    }
    
    helper(someInt, i)
  }
}


