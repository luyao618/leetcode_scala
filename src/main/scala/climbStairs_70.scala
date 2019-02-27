/**
  * Created by luyao on 2019/2/21.
  */
object climbStairs_70 {

  def main(args: Array[String]): Unit = {
    println(fblq(1))
    println(fblq(2))
    println(fblq(3))
    println(fblq(4))
    println(fblq(5))
    println(fblq(6))
    println(fblq(7))


  }

  def climbStairs(n: Int): Int = {

    n match {
      case 1 => return n
      case 2 => return n
      case 3 => return n
      case _ => fblq(n)
    }

  }

  def fblq(n:Int):Int={
    var k = 0
    var n1 = 0
    var n2 = 1
    while (k <= n -1){
      val tmp = n2
      n2 = n1 + n2
      n1 = tmp
      k = k + 1
    }
    return n2
  }

}
