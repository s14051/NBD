object Zadanie2 {
  def main(args: Array[String]) : Unit = {
    val konto1 = new KontoBankowe(10)
    println(konto1.stanKonta)
    
    konto1.wplata(20)
    println(konto1.stanKonta)
    
    konto1.wyplata(40)
    println(konto1.stanKonta)
    
    val konto2 = new KontoBankowe()
    println(konto2.stanKonta)
  }
  
  class KontoBankowe(private var _stanKonta: Double) {
    def this() {
      this(0)
    }
    
    def stanKonta : Double = _stanKonta
    
    def wplata(ammount: Double) : Unit = {
      this._stanKonta = this._stanKonta + ammount
    }

    def wyplata(ammount: Double) : Unit = {
      this._stanKonta = this._stanKonta - ammount
    }
  }  
}


