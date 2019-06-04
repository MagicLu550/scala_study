package net.noyark.scala.day02

/**
  * 学习Set，不包含重复的集合
  */
object Demo04 {
  val s1 = Set(1,2,3,3)

  val s2=scala.collection.mutable.Set(1,2,3,3)

  val s3=Set(1,2,3,4)
  val s4 = Set(3,4,5,6)

  //--交集
  s3&s4


  //--取差集
  s3&~s4
  s3.diff(s4)
  //合并集合
  s3++s4

  s3.count{x=>x%2==0}

  val s5 = Set(1,2,3,4,5)
  //--返回的是两个自Set，可以通过tuple取值
  s5.splitAt(4)._2


}
