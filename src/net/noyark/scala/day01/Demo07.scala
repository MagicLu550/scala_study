package net.noyark.scala.day01

/**
  * 1.scala通过def关键字来定义一个函数
  * 2.def函数名（参数列表）：返回值类型={方法体}
  * 3.scala可以自动推断出函数的返回值类型
  * 需要注意的是：使用自动推断= 否则函数的返回都是Unit(void)类型
  * 声明一个函数，默认的访问权限是public，此外可以用private或者
  * protected来修饰
  * 4:不写返回值就自动推断返回值类型
  * 5.scala中泛型的声明通过[] 比如Array[Int].不同于java的<Int>
  *
  */
object Demo07 {
  // 匿名函数
  // 本地函数
  // 高阶函数
  // 成员函数
  def f1():String = {
    println("hello")
    "123"
  }
  def f2():Unit = {
    println("hello")
  }

  protected def f4(): Unit ={

  }

  protected def f5(a:Int,b:Int):Int={
    a+b
  }

  f5(1,2)
  def f6(a:String,b:Int): String ={
    a*b
  }

  f6("Hello",3)

  def f7(a:Array[String])={
    for(i<-a){
      println(i)
    }
  }


  def f8(a:List[Int])= for(i<-a)yield{i*2}


  def main(args: Array[String]): Unit = {

  }

  val a2=f8(List(1,2,3,4))
  println(a2)
  //-- scala的默认参数机制
  def f9(a:String,b:String="[",c:String="]")={

  }

  f9("1")

  //-- scala也支持可变参数
  def f10(a:String*)={
    for(i<-a){
      println(i)
    }
  }
  f10("1","2","3")

  val p1 = new Person
  p1.eat()

}
