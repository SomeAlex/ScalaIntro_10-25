package monad

object monad_law extends App{


  def pureO[A](a: A): Option[A] = Some(a)
  def FO(x: Int): Option[Int] = if (x >0) Some(x*2) else None
  def gO(x:Int): Option[Int] = Some(x+1)
  /* (unit(x) flatMap f) == f(x)
  *
  * A => M[B]
  * */
  assert(pureO(2).flatMap(FO) == FO(2))

  val m: Option[Int] = Some(10)

  val left = m.flatMap(x=>Some(x))
  val right = m
  println(left)
  println(right)



  val m1 = List(1,2)

  def f(x:Int): List[Int] = List(x,x+10)
  def g(x: Int): List[Int] = List(x,x*2)
  val left1 = m1.flatMap(f).flatMap(g)
  val right1 = m1.flatMap(x=>f(x).flatMap(g))
  println(left1)
  println(right1)


}