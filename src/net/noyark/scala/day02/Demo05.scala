package net.noyark.scala.day02

/**
  * 学习Map
  */
object Demo05 {

    val m1 = Map("tom"->23,"rose"->25)

    val m2 = scala.collection.mutable.Map("rose"->25)

    m2+=("jim"->30)

    m1.keys.foreach{println}
    m1.values.foreach{println}
    for((k,v)<-m1){
      println(k)
    }
    m1.apply("tom")
  //--此方法用于操作map类型的value，只有map类型有
    m1.mapValues{x=>x*10}

  val m3 = Map("tom"->Array(1,23),"rose"->Array(2,35))

  //--基于m3，返回新map
  m3.mapValues{
    x=>{
      x(1)
    }
  }

  m3.contains("tom")
  //  取不出来会报错
  m1.apply("jerry") //等价apply
  m1("jerry")
  //获取不到，则取null默认值
  m1.get("jerry").getOrElse("null")

  m3.filter{case(k,v)=>{v(1)>30}}

  m3.filter(x=> x._2(1) >30)

  m3.toList

}
