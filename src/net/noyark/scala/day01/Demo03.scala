package net.noyark.scala.day01

/**
  * 学习Int类型常用的操作方法
  * 知识点：
  * 1.scala中，都是对象和方法，没有基本类型。所以说scala是一门面向对象的语言
  * 此外也是面向函数的语言
  * 2.scala通过隐式转换，Int->RichInt,此外还有RichDouble,RichFloat
  * 3.建议初学时浏览：
  * https://www.scala-lang.org/api/2.12.8/index.html
  */
object Demo03 {

  val v1=1

  //-- 生成一个区间数组
  var r1 = 1.to(5)
  //-- 生成区间并指定步长
  //println(1.to(5,2))

  //生成区间，但不含尾元素
  var r2 = 1.until(5)

  var r3 = 1.until(5,2)

  //按操作符优先级来运算，运算级同java
  val v2 =  1+2*3
  //按方法方式调用
  val v3 = 1.+(2).*(3)

  val v4 = 1234
  v4.toString
  v4.toDouble

  val v=BigInt(10)
  v.pow(10)
  //--4种前缀操作符号，前面加空格
  val v6 = +2
  val v7 = -2
  val v8 = !true
  val v9 = ~0XFF

  val v10 = 2.unary_+ //2
  val v11 = 2.unary_- //-2
  val v12 = true.unary_!
  def main(args: Array[String]): Unit = {

  }

}
