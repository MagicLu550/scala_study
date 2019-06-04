package net.noyark.scala.day02

import scala.collection.mutable.ListBuffer

/**
  * 学习List
  */

object Demo03 {

  //声明一个定长的List，并不赋初值
  val l1 = List(1,2,3,4)

  val l2=1::2::3::4::Nil

  println(l2)



  //声明一个变长List
  val l3 = ListBuffer(1,2,3,4)


  //--声明一个变长的List
  val l4 = List[Nothing]()

  l1.head
  l1.last
  l1.take(1)
  l1.tail

  l3.isEmpty
  l2.isEmpty


  val l5=List(1,2,3)
  val l6=List(4,5,6)

  val v7 = List.concat(l5,l6)

  var v8 = l5:::l6

  //用5个a填充一个数组
  var v9 = List.fill(5)("a")

  var v10 = List.tabulate(5)(_*2)

  v10 reverse

  val v11 = List(1,2,3)

  //在前面追加0，在后面追加11，返回新数组
  var l12 = 0+:v11:+11

  l12(2)//取值
  l12.apply(2)//同上，等价

  l12.contains(3)
  val a1 = new Array[Int](5)
  l12.copyToArray(a1,0,l12.length)
  //去重复
  l12.distinct
  //是否存在该条件
  l12.exists{x=>x==10}
  val l13=List(1,2,3)
  val l14=List(3,4,5)
  //交集。可以应用于文件之间的去交集数据
  val l15 = l13.intersect(l14)
  //取出所有元素，重新计算
  //--映射方法，重点掌握，可以改变集合中元素的形式
  //不会改变元素个数
  l15.map{
    x=>x*2
  }
  l15.map{
    x=>Array(x)
  }
  val l16=List(Array("tom",23),Array("rose",25))

  val l17 = l16.map{
    x=>x(0)
  }
  println(l17)

  val l18= List(Array(1,1,2,2,3),Array(2,2,3,3))

  //-- 掌握以下类型转换的技巧
  var l19 = l18.map{
    x=>x.toList.distinct.toArray
  }

  //l19.min
  //l19.max
  //l19.sum,将集合转成String，并指定分隔符
  //l19.mkString(",")

  val l20=List(2,3,1,5,4)

  //-- 重点掌握排序,如果要降序，则用前缀操作符 -
  l20.sortBy(x=> -x)//降序


  var l21=List[Array[Any]](Array("tom",35),Array("tom",30),Array("tom",27))


  l21.map{
    x=>(x(0),x(1))
  }.sortBy{
    x=>x._2.toString
  }

  for(i<-l21){
    for(j<-i){
      println(j)
    }
  }

  var l22 = List(1,2,3,4,5)
  //如同((((1+2)+3)+4)+5)
  l22.reduceLeft(_+_)

  def main(args: Array[String]): Unit = {
  }

}
