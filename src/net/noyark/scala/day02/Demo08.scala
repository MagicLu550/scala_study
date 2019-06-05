package net.noyark.scala.day02
object Demo08{

  val p1 = new Person("11",1)

  p1 setAge 0
  p1 setName "11"

  println(p1)

  val i1=Item

  def f1(a:Int,b:Int):Option[Int]={
    if(b == 0){
      Some(a/b)
    }else{
      None
    }
  }
  f1(4,0).getOrElse(0)
}
