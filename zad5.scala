object Zadanie5 {
  def main(args: Array[String]) : Unit = {
    val itemsPrices = Map("czekolada" -> 5.00, "jablko" -> 1.00, "komputer" -> 6000.00)
    
    val itemsPricesAfterDiscount = getItemsWithTenPercentDiscount(itemsPrices);
    println(itemsPricesAfterDiscount)
  }
  
  def getItemsWithTenPercentDiscount(itemsPrices: Map[String, Double]) : Map[String, Double] = {
    itemsPrices.map(kv => (kv._1, 0.9*kv._2))
  }
}