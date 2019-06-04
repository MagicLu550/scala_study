package net.noyark.scala.day02

import java.util

import scala.collection.mutable.ArrayBuffer

object Demo02 {
  //--声明一个定长数组，一经声明，数组元素个数不能改变
  val a1 = Array(1,2,3,4)

  val a2 = new Array[Int](3)

  //--声明一个变长数组，并赋初始值
  //--mutable 可变
  //--immutable 不可变
  val a3 = ArrayBuffer(1,2,3,4)

  val a4 = new ArrayBuffer[Int](3)

  for(i<-a2.indices){
    a2(i)=4
  }

  //--通过下标取值
  a2(0)
  //变长数组一百年通过append来赋值。用下标赋值也可以
  for(i<-1 to 10){
    a4.append(i)
  }

  val a5=Array(1,2,3)

  val a6=Array(2,5,6)

  //--拼接定长数组
  val a7 = Array.concat(a5,a6,a2)

  val a8 = ArrayBuffer.concat(a3,a4)

  //--生成区间数组，并指定步长。一般用于准备实验数据
  //开始，结束，步长
  var a9 = Array.range(0,5,2)

  println(util.Arrays.toString(a9));


  //创建一个 将匿名函数应用于初始值的数组
  //1 2 4 8 16 32
  //1 1*2 2*2 2*2*2 2*2*2*2
  Array.iterate(1,5)(x=>x+2)

  //--创建一个匿名的应用于下标的数组
  //1 2 3 4
  //2 4 6 8
  Array.tabulate(5)(x=>x*2)

  a2.max
  a2.min
  a2.sum

  val a10=Array(2,1,5,4,3)

  scala.util.Sorting.quickSort(a10)

  a10.filter(_%2==0)//a10.filter(x=>x%2==0)
  a10.dropRight(1)
  println("drop:"+util.Arrays.toString(a10))
  println(util.Arrays.toString(a10.dropRight(1)))

  a10.take(1)

  a10.take(2)

  a10.head



  def main(args: Array[String]): Unit = {

  }
}
