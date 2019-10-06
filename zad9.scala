object Zadanie9 {
  def main(args: Array[String]) : Unit = {
    val integers = List(1, 2, 5, 0, 44, 0, 22, 12, 0, 5, 0)

    println(incrementAllBy(integers, 1))
  }
  
  def incrementAllBy(list: List[Int], incrementValue: Int) : List[Int] = {
    list.map(_ + incrementValue)
  }
}