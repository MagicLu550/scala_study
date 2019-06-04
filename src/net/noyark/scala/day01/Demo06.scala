package net.noyark.scala.day01

import scala.util.control.Breaks.{break, breakable}

object Demo06 {
  val s1 = "hello"
  //--等价于java的switch。此外scala的match可以有返回值
  var i = s1 match{
    case "hello"=>{
      //方法体代码
      println("yes")
      "yes"
    }
    case "world"=>{
      println("no")
      "no"
    }

    case _=>{
      println("other")
      "other"
    }
  }
  println(i)



  def main (args: Array[String]): Unit = {
    //break
    breakable {
      for (i <- 1 to 10) {
        println(i)
        if (i == 8) {
          break
        }
      }
    }
    //continue
    println("continue")
    for(i<-1 to 10){
      breakable {
        if (i == 8) {
          break
        } else {
          println(i)
        }
      }
    }
  }

  //-- scala的异常处理机制同Java，不同的是catch中需要通过case
  //来匹配异常
  try{

  }catch {
    case t:NullPointerException=>{
      //--处理异常代码
      println("null")
    }
    case t:Exception=>{
      println("other")
    }
  }finally {

  }

}
