package net.noyark.scala.day02

import scala.collection.mutable.ArrayBuffer

object SetListArray {

  //Set List Array normal
  var s = Set(1,2,3,4)
  var l = List(1,2,3,4)
  var a = Array(1,2,3,4)
  //求合 求最大 求最小
  s.max
  s.min
  s.sum

  l.max
  l.min
  l.sum

  a.max
  a.min
  a.sum

  //过滤元素，符合条件的留下
  a.filter(x=>x==2)
  l.filter(x=>x==2)
  s.filter(x=>x==2)

  //从后面删掉几个元素
  a.dropRight(1)
  l.dropRight(1)
  s.dropRight(1)

  //取头部的几个元素
  a.take(1)
  l.take(1)
  s.take(1)
  //取第一个元素
  a.head
  l.head
  s.head
  //获取除了头部元素的元素集合
  a.tail
  l.tail
  s.tail

  //判断是否为空
  a.isEmpty
  l.isEmpty
  s.isEmpty

  //反转数组/集合 set无
  a.reverse
  l.reverse

  //前后拼接 set无
  1+:a:+2
  1+:l:+2

  //取出值
  l(0);l.apply(0)
  a(0);a.apply(0)
  s(0);s.apply(0)

  //判断是否包含
  l.contains(1)
  a.contains(1)
  s.contains(1)

  //复制到数组
  var arr = new Array[Any](3)
  l.copyToArray(arr,0,arr.length)
  s.copyToArray(arr,0,arr.length)
  a.copyToArray(arr,0,arr.length)

  //去重复 Set无
  l.distinct
  a.distinct

  //重组集合
  l.map{x=>x}
  s.map{x=>x}
  a.map{x=>x}

  //排序
  l.sortBy{x=>x}//如果倒序就是sortBy{x=>-x}
  a.sortBy{x=>x}
  /**
    * 排序案例，排序这个数组
    * var l21=List[Array[Any]](Array("tom",35),Array("tom",30),Array("tom",27))
    *
    *
    * l21.map{
    * x=>(x(0),x(1))
    * }.sortBy{
    * x=>x._2.toString
    * }
    */

  //合并处理
  //以下如同(((1*2)*3)*4)*5
    l.reduceLeft(_*_)
    a.reduceLeft(_*_)
    s.reduceLeft(_*_)

  //Array
  /**
    * 不可变数组
    *
    */
  var a1 = Array(1,2,3)
  var a2 = Array(1,2,3)
  Array.range(0,5,2)   //产生0-5区间的数，2为步长，结果0，2，4
  Array.concat(a1,a2) //拼接数组
  //结果 1 1*2 2*2 2*2*2 ...
  Array.iterate(1,5){
    x=>x*2
  }
  //将下标*2
  Array.tabulate(5){
    x=>x*2
  }
  //ArrayBuffer
  /**
    * 可变数组
    */
  var ab1 = ArrayBuffer(1,2,3)
  var ab2 = ArrayBuffer(1,2,3)

  ArrayBuffer.concat(ab1,ab2) //拼接数组

  //List
  /**
    *
    */
  var l1 = List(1,2,3,4)
  var l2 = List(1,2,3,4)
  //同Array
  List.iterate(1,5){
    x=>x*2
  }
  //同Array
  List.tabulate(5){
    x=>x*2
  }
  //合并集合
  List.concat(l1,l2)
  l1 ::: l2
  //获得一个填充值的数组(以下为填充5个a)
  List.fill(5)("a")
  //Set
  /**
    *
    */
  var s1 = Set(1,2,2,3) //重复元素自动去重复
  var s2 = Set(1,2,2,4)
  //合并集合
  s1++s2
  //取交集
  s1&s2
  //取不同的
  s1&~s2
  //可变长度的Set集合
  scala.collection.mutable.Set(1,2,3,3)
  //根据条件求和
  s1.count{x=>x==2}
  //从指定坐标切分为元组，包含两个子集合
  s1.splitAt(4)._2
}
