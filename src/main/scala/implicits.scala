package scala2

object ImplicitObjectsExample extends App {

  trait Show[A] {
    def show(a: A): String
  }

  implicit object IntShow extends Show[Int] {
    def show(a: Int): String = s"Int: $a"
  }

  implicit object StringShow extends Show[String] {
    def show(a: String): String = s"String: $a"
  }


  def printShow[A](a: A)(implicit s: Show[A]): Unit = {
    println(s.show(a))
  }


  printShow(42)
  printShow("42")
}


object Implicits extends App {
  def greet(name: String) (implicit greeting: String): Unit = {
    println(s"$greeting $name")
  }

  implicit val hello: String = "test"
  greet("test1")


  implicit  def intToString(x: Int): String = x.toString

  val s: String = "42"

  implicit class RichInt(val x: Int) {
    def square: Int = x*x
  }

  println(5.square)
}