package net.noyark.scala.day02

/**
  * 1.scala继承用extends
  * 2.混入用with
  * 3.单继承多混入
  * 4.scala要求必须有且仅有一个extends关键字
  */
class ZhangTeacher extends Teacher with Drive with Dance with Serializable {

  def teach(): Unit = ???

  def makeNote(): String = ???

  def say(word: String): Unit = ???

  def run(): Unit = ???

  override def cook(): Unit = ???

  def drive():Unit = ???

  def balei(): Unit = ???

  def floor(): Unit = ???

}
