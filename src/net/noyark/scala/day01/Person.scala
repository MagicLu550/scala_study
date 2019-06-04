package net.noyark.scala.day01

class Person {

  def eat()={
    println("eat")
    //-- 定义到函数内部的函数称为本地函数
    def cook()={
      println("cook food")
    }
  }

}
