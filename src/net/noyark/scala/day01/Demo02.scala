package net.noyark.scala.day01

/**
  * 学习常用的字符串的方法
  * 知识点：
  * 1.scala可以无缝衔接java库的方法
  * 2. String操作，比如*复制方法，Java类库并没有，此时scala
  * 底层有一个隐式转换机制，会转成scala自身的类.String->StringOpS
  */
object Demo02 {

  println("Welcome to the scala worksheet");

  val s1 = "hello world"
  val r1 = s1.split(" ");

  println(s1*2)

  //去掉头两个元素
  s1.drop(2)
  //去掉尾部两个元素
  s1.dropRight(2)
  //取出头部两个元素
  s1.take(2)
  //取出尾部两个元素
  s1.takeRight(2)

  //取出头部元素
  s1.head
  //取出尾部元素
  s1.last
  //取出除头部以外的元素
  s1.tail

  s1.contains('h')
  //--通过指定的匿名函数规则做计数
  s1.count{x=>x.equals('o')}

  s1.exists{x=>x.equals('z')}
  //-- 匿名函数做过滤操作
  s1.filter(x=>x.equals('o'))

  s1.foreach(x=>println(x))

  s1.indexOf('h',0)
  //根据asc码比较
  s1.max
  s1.min
  //在每个字符之间添加分割符
  s1.mkString(",")

  s1.reverse

  var varInt = s1.toInt

  def main(args: Array[String]): Unit = {
    print(s1.tail)
  }

}
