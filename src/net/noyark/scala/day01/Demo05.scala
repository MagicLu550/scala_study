package net.noyark.scala.day01

/**
  * 学习for循环的使用
  */

object Demo05 {

  val l1 = List[String]("1","2","3","4")

  for(i <- l1){
    println(i)
  }

  for(i<- 1 to 10){
    println(i)
  }

  for(i<- 1 to 10 by 2){
    println(i)
  }
  for(i<-1 to 10;if(i<5))println(i)

  //-- 通过scala的

  for(a<-1 to 9;b<-1 to a;val sep = if(a==b) "\r\n" else "\t" ){
    println(sep)
  }

  val m1=Map("tom"->23,"rose"->25)

  for((k,v)<-m1){
    println(k,v)
  }

  //-- for yield表达式 将for循环结果返回到一个新的集合类型中
  //-- for yield表达式，遍历的是什么集合类型，返回的就是什么类型
  //scala中的集合包含：Array，List，Range，Map，Set，Tuple
  var l2 = List(1,2,3,4)

  var l3 = for(i<-l2)yield {i*2}

  var m2 = for((k,v)<-m1)yield{(k,v+10)}
  println(m2)
  println(l3)
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 9){
      for(j <- 1 to i){
        print(s"$j*$i=${j*i}\t")
      }
      println()
    }
  }
}
