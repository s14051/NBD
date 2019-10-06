object HelloWorld {
  def main(args: Array[String]) : Unit = {
    val integers = List(1, 2, 5, 0, 44, 0, 22, 12, 0, 5, 0)

    println(getListWithoutZeros(integers))
  }
  
  def getListWithoutZeros(list: List[Int], acc: List[Int] = List.empty): List[Int] = {
    list match {
       case Nil => acc
       case 0::tail => getListWithoutZeros(tail, acc)
       case head::tail => getListWithoutZeros(tail, acc:+head)
    }
  }
}