class Container[A](x: A){
  def getContent() : A = x
  
  def applyFunction[R](f: A => R) : R = f(x)
}

val con = new Container("1");
println(con.getContent())
println(con.applyFunction((a: String) => Integer.parseInt(a)+2))


val con2 = new Container("test");
println(con2.getContent())
println(con2.applyFunction((a: String) => a+"_Działa"))

val con3 = new Container(22);
println(con3.getContent())
println(con3.applyFunction((a: Int) => a - 2))