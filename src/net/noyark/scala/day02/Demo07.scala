package net.noyark.scala.day02

/**
  * 常用集合类型操作
  * 1.take(n)
  * 2.takeRight(n)
  * 3.drop(n)
  * 4.dropRight(n)
  * 5.head
  * 6.last
  * 7.tail(drop(1))
  * 8.mkString(sep)
  * 9.sum
  * 10.max
  * 11.min
  * 12.distinct
  * 13.sortBy
  * 14.filter
  * 15.map
  * 16.mapValues(只有map类型有，操作map值)
  * 17.reduceLeft(等价reduce)
  * 18.flatMap 扁平化map方法(一般用于读取文件后，操作行数据)
  * 19.groupBy
  */
object Demo07 {

  val l1=List("hello,world","hello,hadoop","hello 1804")

  l1.map{x => x.split(",")}
  //扁平化map方法，buf
  l1.flatMap{x=>x.split(",")}

  //-- List（("hello",1),("word",1))
  //拆分的不会转化为数组
  l1.flatMap{line=>line.split(" ").map{line=>(line,1)}}

  val l2 = List(("tom",300),("rose",300))
  //-- 按指定字段做聚合，返回类型Map[key,List[Tuple]]
  //根据第一个名字进行分组
  val m1 = l2.groupBy{x=>x._1}

  m1.mapValues{
    list=>list.map{
      x=>x._2
    }
  }

  //hello world.Thanks you
  val l3 = List(("hello world hello world",1),("hello world",2))



  var word_sum = l3.flatMap {
    x => x._1.split(" ")
  }.groupBy{
    x => x
  }.map{
    case(k,v) => (k,v.size)
  }

  println(word_sum)

}
