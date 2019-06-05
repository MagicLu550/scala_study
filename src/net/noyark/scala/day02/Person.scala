package net.noyark.scala.day02

/**
  * 知识点
  * 1.scala的类声明同java，通过class关键字定义
  * 2.成员变量和成员方法默认是public.可以通过private或者protected修饰
  * 3.scala类的主构造器需要在类上声明
  */
class Person(v1:String,v2:Int){



  private var name = v1
  private var age = v2

  //--构造辅助构造器，要求必须显式的调用同类的其他构造器(一般调用主构造器)
  def this(var1:String){
    this(var1,0)
  }


  def this(var1:Int){
    this("",var1)
  }

  def this(){
    this("",0)
  }

  def eat()={
    println("eat food")
  }

  def getName() ={
    name
  }
  def setName(name:String)={
    this.name = name
  }

  def getAge()={
    this.age
  }

  def setAge(age:Int)={
    this.age = age
  }

}

/**
  * 当把一个object单例对象和一个class写在同一个文件里
  * 并且名字一致，此时单例对象和类产生一个绑定关系
  *
  * 术语:称object->class 伴生对象
  *     class-> object 伴生类
  */
object Person{
  def say(): Unit ={
    println(11)
  }
}
