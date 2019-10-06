object Zadanie7 {
  def main(args: Array[String]) : Unit = {
    val itemsPrices = Map("czekolada" -> 5.00, "jablko" -> 1.00, "komputer" -> 6000.00)

    println(searchValueByKeyInMap[String, Double](itemsPrices, "komputer"))
    println(searchValueByKeyInMap[String, Double](itemsPrices, "asdf"))
  }
  
  def searchValueByKeyInMap[K,V](map : Map[K, V], key : K) : Any = {
    map.get(key).getOrElse("Podany klucz nie istnieje w dostarczonej mapie")
  }
}