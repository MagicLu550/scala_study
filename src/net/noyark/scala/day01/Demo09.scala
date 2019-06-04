package net.noyark.scala.day01

object Demo09 {

  //斐波那契数列
  //2 3 5 8 13 21
  //递归函数找两样东西
  //找函数关系
  // f(n)=f(n-1)+f(n-2)
  //找结束条件
  //f(0)==2,f(1)==3

  def f1(n:Int):Int={
    if(n==0)return 2
    if(n==1)return 3
    else f1(n-1)+f1(n-2)
  }

  def f2(n:Int):Int={
    if(n==0)return 2
    if(n==1) return 3
    if(n%2==0) {
      f2(n-2)*2
    }else{
      f2(n-3)*3
    }
  }

  def f3(n:Int):Int={
    if(n == 0)return 2
    if(n == 1)return 3
    f3(n-2)*f3(n-2)
  }


  def main(args: Array[String]): Unit = {
    println(f3(6))
  }
}
