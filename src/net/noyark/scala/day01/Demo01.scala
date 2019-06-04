package net.noyark.scala.day01

/**
  *学习变量和常量的声明
  * 知识点：
  * 1.scala可以自动推断出变量或常量的类型
  * 2.变量(var)可以更改，常量val一经声明，不能修改
  */
object Demo01 {

  //--变量声明用var关键字
  var v1 = 10

  //--常量声明用val关键字
  val v2 = 20

  val str = "hello,world"

  var arr = Array(1,2,3,4)

  var v5:Int = 15

  v1=20
  var str1:String = "hello"

  println("hello")

  def main(args: Array[String]): Unit = {
    println("11")
  }

}
