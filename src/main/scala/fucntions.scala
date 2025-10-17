package scala.scala2

object intro extends App {
  def applyOperation(a: Int, b: Int, operation: (Int, Int) => Int): Int = {
    operation(a,b)
  }


  val add = (x: Int, y: Int) => { x+y }

  println(add(3,5))

  val result = applyOperation(3,4, add)
  println(result)

  val numbers = List(1,2,3,4,5)
  val newNumners = numbers.map(_*2)
  println(numbers)
  println(newNumners)

  def applyTwice(f: Int => Int, x: Int): Int = {
    f(f(x))
  }

  val inc = (x: Int) => x+1 // def inc(x: Int): Int = x+1

  println(applyTwice(inc, 5))
}