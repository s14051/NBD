object Zadanie5 {
  
  class Osoba(val imie: String, val nazwisko: String, private var _podatek: Double) {
    def podatek: Double = _podatek
  }
  
  trait Pracownik extends Osoba {
    var pensja: Double = 5000
    override def podatek: Double = 0.2*pensja
  }
  
  trait Student extends Osoba {
    override def podatek: Double = 0
  }
  
  trait Nauczyciel extends Pracownik {
    override def podatek: Double = 0.1*pensja
  }
  
  
  def main(args: Array[String]) : Unit = {
    // pracownik
    val pracownik = new Osoba("Maciej", "Sadoś", 10) with Pracownik
    pracownik.pensja = 10000
    println("Pensja pracownika: " + pracownik.pensja)
    println("Podatek od powyższej pensji pracownika: " + pracownik.podatek)
    
    
    println(".")
    println(".")
    
    
    // student
    val student = new Osoba("Maciej", "Sadoś", 10) with Student
    println("Podatek studenta: " + student.podatek)
    
    
    println(".")
    println(".")
    
    
    // nauczyciel
    val nauczyciel = new Osoba("Maciej", "Sadoś", 10) with Nauczyciel
    nauczyciel.pensja = 3000
    println("Pensja nauczyciela: " + nauczyciel.pensja)
    println("Podatek od powyższej pensji nauczyciela: " + nauczyciel.podatek)
    
    
    println(".")
    println(".")
    
    
    // student pracownik
    val studentPracownik = new Osoba("Maciej", "Sadoś", 10) with Student with Pracownik
    studentPracownik.pensja = 2000
    println("Pensja studenta pracownika: " + studentPracownik.pensja)
    println("Podatek od powyższej pensji studenta pracownika: " + studentPracownik.podatek)
    
    
    println(".")
    println(".")
    
    
    // pracownik student
    val pracownikStudent = new Osoba("Maciej", "Sadoś", 10) with Pracownik with Student
    pracownikStudent.pensja = 2000
    println("Pensja pracownika studenta: " + pracownikStudent.pensja)
    println("Podatek od powyższej pensji pracownika studenta: " + pracownikStudent.podatek)
    
    
    // ostatni trait przesłania poprzednie
  }
}