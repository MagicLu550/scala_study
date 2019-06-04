package net.noyark.scala.day01

object Test {


  for(i <- -10 to -1){
      println(-i)
  }

  def fn1(num:Double,n:Int):Double={
    if(n == 0){
      1
    }else{
      var result = 0.0
      var index = n
      if(n<0){
        index = -index
      }
      if(n%2==0) {
        result = fn1(num, index / 2) * fn1(num, index / 2)
      }else{
        result = fn1(num,index-1) * num
      }
      if(n<0){
        result = 1/result
      }
      result
    }
  }

  def fn(num:Double,n:Int) : Double = {
    var num1 = num
    //4
    //0 1 2 3 4
    var index = 0

    if(n<0){
      index = -n
    }else{
      index = n
    }
    for(i<-0 until index){
      num1 *= num
    }
    if(n>0)
      num1/2
    else if(n<0)
      1/(num1/2)
    else 1
  }

  def fn2(arr:Array[Int])={
    val range = arr.indices
    for(index <- range){
      if(index!=0){
        if((index+1) %2 == 0){
          var value = arr(index-1)
          arr(index-1)=arr(index)
          arr(index) = value
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println(fn1(2,-1))
  }

}
