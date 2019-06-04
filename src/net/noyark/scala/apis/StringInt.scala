package net.noyark.scala.apis

object StringInt {

  //字符串
  var s1 = "hello,world"
  //1.去掉头两个元素
  s1.drop(2)
  //2.去掉尾部两个元素
  s1.dropRight(2)
  //3.取出头部两个元素
  s1.take(2)
  //4.取出尾部两个元素
  s1.takeRight(2)
  //5.取出头部元素
  s1.head
  //6.取出尾部元素
  s1.last
  //7.取出除头部以外的元素
  s1.tail
  //8.指定规则计数
  s1.count{x=>x.equals('a')}
  //9.包含指定字符
  s1.exists(x=>x.equals('a'))
  //10.过滤字符
  s1.filter{x=>x.equals('a')}
  //11.遍历字符
  s1.foreach(x=>println(x))
  //12.根据asc码比较
  s1.min
  s1.max
  //13.每个字符之间添加分隔符
  s1.mkString(",")
  //14.反转
  s1.reverse

  //整数
  //1.取区间
  1 to 10
  //2.取不含尾的区间
  1 until 10
  //3.指定步长
  1 until 10 by 2
  1 to 10 by 2

}
