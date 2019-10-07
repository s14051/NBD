object Zadanie3 {
  def main(args: Array[String]) : Unit = {
    println(greetPerson(new Osoba("Maciej", "Sadoś")))
    println(greetPerson(new Osoba("Tomasz", "Pieciukiewicz")))
    println(greetPerson(new Osoba("Jan", "Kowalski")))
  }
  
  case class Osoba(val imie: String, val nazwisko: String) {}  
  
  def greetPerson(osoba: Osoba) = osoba match {
    case Osoba("Maciej", _) => "Witaj Macieju"
    case Osoba("Tomasz", "Pieciukiewicz") => "Witaj Pietia"
    case Osoba(imie, _) => s"Witaj $imie"
  }
}