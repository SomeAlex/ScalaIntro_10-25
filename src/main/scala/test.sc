import scala.annotation.tailrec

var xVar: Int = 1

xVar = 2

val xVal: Int = 1

println(42.toString)

val c = {
  val a = 11
  a + 4
  2
}

def addition(n: Int): Int = {
  val b = n + 1
  b
}

addition(2)
addition(3)


val twoTimes = (x: Int) => x * 2
println(twoTimes(2))


val maxBy = (f: Int => Int) => (a: Int, b: Int) =>
  if (f(a) > f(b)) a else b
println(maxBy(x => x * x)(5, -8))


val whichOne = if (false) "Not that one" else "This one"


val fruit: List[String] = List("apples", "oranges",
  "pears")
val fruit1 = "apples" :: ("oranges" :: ("pears"
  :: Nil))
val fruit2 = List.fill(10)("apples")

val a = 1 to 10 by 2
a.foreach(println)

val c1 = 'a' to 'z'

println(c1.toList.take(3).mkString("Simple as ", ",", "!"))

val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
println("Keys in colors : " + colors.keys)
println("Values in colors : " + colors.values)
println("Check if colors is empty : " + colors.isEmpty)


{
  val a: Option[Int] = Some(5)
  val b: Option[Int] = None
  println("a.getOrElse(0): " + a.getOrElse(0))
  println("b.getOrElse(10): " + b.getOrElse(10))
}

{
  val a = 1 to 5
  val b = 1 to 5

  val ab = for {
    a1 <- a
    b1 <- b
  } yield (a1, b1)

  val ab1 = a.flatMap(
    a1 => b.map(b1 => (a1, b1))
  )
}

def factorial(n: Int): BigInt = {
  if (n > 1) n * factorial(n - 1)
  else 1
}

// factorial(100000)

@tailrec
def tailFactorial(n: Int, acc: BigInt = 1): BigInt = {
  if (n > 1) tailFactorial(n - 1, acc * n)
  else acc
}

//tailFactorial(100000)

def check(hasException: Boolean): String = {
  if (hasException) throw new RuntimeException("Exception!")
  else "Ok"
}

try {
  check(true)
} catch {
  case e: RuntimeException => println(s"RuntimeException [ $e ]")
} finally {
  println("Exception handling is over")
}

var t = (1, "hello", Console)

trait Greeting {
  def greet(name: String): Unit = {
    println(s"Hello, $name!")
  }
}

class Person(name: String) extends Greeting

object Person

val person = new Person("John")
val person2 = new Person("John")
person == person2
person.greet("Mary") // Output: Hello, Mary!
println(person)


{
  case class Person(name: String, age: Int) {
    def move(): Unit = println("")
  }


  val garry = Person("Garry", 22)
  val garry2 = Person("Garry", 22)
  garry2 == garry
  println(garry2)
  val oldGarry = garry.copy(age = 60)
}