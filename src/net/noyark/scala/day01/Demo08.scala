package net.noyark.scala.day01

import java.util

/**
  * 学习scala的匿名函数
  * 知识点：
  * 1 .匿名函数没有函数名。形式：(参数列表)=>{方法体}
  */
object Demo08 {

  //-- 普通的成员函数
  def f1(a:Int,b:Int)={a+b}

  //-- 声明一个匿名函数
  (a:Int,b:Int)=>{a+b}

  def f2(a:Int,b:Int,f:(Int,Int)=>Int)={
    var i =f(a,b)
    println(i)
  }
  f2(2,3,(a:Int,b:Int)=>{a+b})

  //方法体只有一行代码，{}可以省略
  f2(2,3,(a:Int,b:Int)=>a+b)
  //--匿名函数的参数类型如果能推断出来，类型可以省略
  f2(2,3,(a,b)=>a+b);

  //-- 定义个高阶函数，接收一个a String，和一个匿名函数f:(String)=>String

  def f3(a:String,f: String=>String): Unit ={
    var s = f(a)
    println(s)
  }

  f3("12323",a=>a.mkString(","))

  var a1 = Array(1,2,3)

  a1.foreach{a=>println(a)}

  a1.filter{num=>num%2==0}.foreach{a=>println(a)}

  //元素求和
  var sum = a1.reduceLeft{(a,b)=>a+b}
  println(util.Arrays.toString(a1))
  println(sum)

  //终极化简原则,scala可以用_来化简
  f2(2,3,_+_)

  a1.filter{_%2==0}.foreach(println(_))
  def main(args: Array[String]): Unit = {

  }
}
