package net.noyark.scala.day01

object Demo04 {

  println("welcome to the scala worksheet")

  val v1=10

  var v2 = if(v1<20){
    println("small")
    "11"
  }else{
    println("big")
    "22"
  }
  println(v2)

  if(v1<20){
    println("small")
  }else{
    println("big")
  }

  var v = 1 to 10 by 2 //对于步长

  val l1 = List(1,2,3,4)
  var index=0

  while(index<l1.size){
    println(l1(index))
    index+=1
  }



  def main(args: Array[String]): Unit = {

  }
}
