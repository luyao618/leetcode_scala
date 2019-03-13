/**
  * 时间和空间均是100% 开心
  * Created by luyao on 2019/3/13.
  */
object numberOfArithmeticSlices_413 {

//  def numberOfArithmeticSlices(A: Array[Int]): Int = {
//    var res = 0
//    if(A.length <= 2) return res
//    else if(A.length == 3){
//      if((A(2) - A(1)) == (A(1) - A(0))){
//        return 1
//      }else return 0
//    }else{
//      var res1 = 0
//      var num = 0
//      val cha = A(A.length-1) - A(A.length -2)
//      for(i <- A.length -2 to 1 by -1){
//        if((A(i) - A(i-1)) == cha) num = num + 1
//      }
//      res1 = res1 + num
//      res = res1 + numberOfArithmeticSlices(A.dropRight(1))
//      return res
//    }
//  }

  def numberOfArithmeticSlices(A: Array[Int]): Int = {
    var res = 0
    if(A.length <= 2) return res
    else if(A.length == 3){
      if((A(2) - A(1)) == (A(1) - A(0))){
        return 1
      }else return 0
    }else{
      var dp = 0
      var cha = A(1) -A(0)
      for(i <- 2 to A.length -1){
        if( ( A(i) - A(i-1) ) == cha ){
          dp = dp + 1
          cha = A(i) - A(i-1)
        }else{
          cha = A(i) - A(i-1)
          res = res + countDP(dp)
          dp = 0
        }
      }
      res = res + countDP(dp)
      res
    }
  }

  def countDP(dp:Int):Int={
    var res = 0
    for(i <- 0 to dp){
      res = res + i
    }
    res
  }

  def main(args: Array[String]): Unit = {
    val A = Array[Int](1,2,3,8,9,10)
    numberOfArithmeticSlices(A)
  }



}
