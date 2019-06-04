package net.noyark.scala.day02

/**
  * 学习柯里化的概念
  * 柯里化的作用一时允许将接受多个参数的函数转变为接受单一参数的函数
  * 作用二允许用户自建控制结构
  */
object Demo01 {

  val v1 = 2


  //--懒值，只要真正使用时才赋值
  //--注意懒值只能修饰常量val，不能修饰变量var
  lazy val v2 = 2

  //lazy var v3 = 2 X

  def f1(a:Int,b:Int)={
    a+b
  }
  //scala底层支持柯里化技术，允许一个函数接收单一参数
  def f11(a:Int)(b:Int)={a+b}
  f1(2,3)
  var v = f11(2)(3)
  println(v)

  def f2(a:Int,b:Int,c:Int)={a+b+c}

  def main(args: Array[String]): Unit = {

  }

}
