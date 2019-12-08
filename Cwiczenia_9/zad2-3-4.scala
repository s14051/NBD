trait Maybe[A]

class No extends Maybe[Nothing] {
  def applyFunction[A,R](f: A => R) : No = {
    new No()
  }
  
  def getOrElse(elseParam: Any) = elseParam
}

class Yes[A](val x: A) extends Maybe[A] {
  def applyFunction[R](f: A => R) : Yes[R] = {
    new Yes(f(x))
  }
  
  def getOrElse(elseParam: Any) = x
}

// zad 3
val no = new No
println(no.isInstanceOf[Maybe[_]])

val yes = new Yes(1)
println(yes.isInstanceOf[Maybe[_]])


// zad 4
println(no.getOrElse("No - getOrElse test"))
println(yes.getOrElse("Yes - getOrElse test"))