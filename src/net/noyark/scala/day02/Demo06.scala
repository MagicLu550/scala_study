package net.noyark.scala.day02

/**
  * 学习元组tuple
  */
object Demo06 {

  val t1 = ("tom","rose","jerry")

  val t2=(("tom",23),("rose",25),("jerry",30))

  //--取值
  t1._1
  t2._2
  t2._2._2

  val l1 = List("hello","world","hadoop","hello")

  var m2 = l1.map(x=>(x,1))

  //---基于l2 变成List("hello","world")

  val l3 = m2.map{x=>x._1}

  var l4=m2.map{case(word,count)=>word}


}
