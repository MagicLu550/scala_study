package net.noyark.scala.others

/**
  * A <: Test 类似于Java的 A extends Test
  * A >: Test 类似于Java的 A super Test
  * +A :类似java的 ? extends A
  * -A :类似java的 ? super A
  * @tparam A
  */
class Test[+A]{
  def a[A >:Int](a:A): A={
    a
  }
}
object Test{
  def main(args: Array[String]): Unit = {
    var test = new Test[Long]
    test.a(1)
  }
}
