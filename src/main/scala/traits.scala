package scala.scala2

trait Logger {
  def log(mag: String): Unit
}

class ConsoleLogger extends Logger {
  override def log(mag: String): Unit = ???
}

trait TimestampLogger extends Logger {
  override def log(mag: String): Unit = ???
}

class MyClass extends ConsoleLogger with TimestampLogger

trait ShortLogger extends Logger {
  override def log(mag: String): Unit = ???
}

class AppLogger extends Logger with ShortLogger


trait HasLegs {
  def walk(): Unit = println("walking on the legs")
}

trait HasWings {
  def fly(): Unit
}

class Animal(val name: String) {
  def makeSound(): Unit = {
    println("generic sound")
  }
}

class Dog(name: String) extends Animal(name) with HasLegs {
  override def makeSound(): Unit = println("gav")
}

class Bird(name: String) extends Animal(name) with HasWings {
  override def fly(): Unit = println(s"$name is flying")
}

object main extends App {
  val dog = new Dog("test")
  dog.makeSound()
  dog.walk()

  val bird = new Bird("Tweety")
  bird.makeSound()
  bird.fly()
}