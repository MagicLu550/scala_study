package net.noyark.scala.others

import java.io.File
;

/**
 * 还差些小算法，等zk看完再看这些算法
 */
object Test2 {

    def func1(): Unit ={
      var s1 = "abc"
      var s2 = "def"

      var arrAll = new Array(s1.size+s2.size)
      var arr1 = s1.toCharArray
      var arr2 = s2.toCharArray
      var index = 0
      var str = arr2.map{
        x=>{
          val result = x+""+arr1(index)
          index+=1
          result
        }
      }.reduceLeft(_+""+_)

      println(str)
    }
  func1()

  def values(fun:Int=>Int,low:Int,high:Int) ={
    for(i <- low to high){
      println((i,fun(i)))
    }
  }

  def max(arr:Array[Int]) ={
    arr.reduceLeft{
      (x1,x2)=>{
        if(x1>x2)
          x1
        else
          x2
      }
    }
  }

  def sum(i:Int) =(1 to i).reduceLeft(_*_)

  def largest(fun:Int=>Int,inputs:Seq[Int]) ={
    inputs.map{x=>fun(x)}.reduceLeft((x1,x2)=>if(x1>x2)x1 else x2)
  }



  def main(args: Array[String]): Unit = {
    var i = new File("1")
    println(largest(x=>10*x-x*x,1 to 10))
  }


}
