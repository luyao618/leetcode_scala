/**
  * 238. 除自身以外数组的乘积
  * @auther luyao
  * @date 20-1-20
  * @version 1.0
  */
object productExceptSelf_238 {


  // 暴力法 - 超出内存限制
//  def productExceptSelf(nums: Array[Int]): Array[Int] = {
//
//    var result:Array[Int] = Array()
//
//    if(nums.length == 0) return result
//
//    for(i <- 0 to nums.length-1){
//      var tmp_re = 1
//      for( j <- 0 to nums.length -1){
//        if(j != i){
//          tmp_re = tmp_re * nums(j)
//        }
//        tmp_re
//      }
//      result :+= tmp_re
//    }
//    result
//
//  }

  def productExceptSelf(nums: Array[Int]): Array[Int] = {

    if(nums.length == 0 ) return Array()
    if(nums.length ==1) return nums
    var result:Array[Int] = new Array(nums.length)
    var l:Array[Int] = new Array(nums.length)
    var r:Array[Int] = new Array(nums.length)

    l(0) = 1
    for(i <- 1 to nums.length -1){
      l(i) = l(i-1) * nums(i -1)
    }

    r(nums.length-1) = 1
    for(j <- (0 to nums.length -2) .reverse){
      r(j) = r(j+1) * nums(j +1)
    }

    for(k <- 0 to nums.length -1){
      result(k) = l(k) * r(k)
    }
    result


  }


  def main(args: Array[String]): Unit = {

    val nums = Array(1,2,3,4)
    productExceptSelf(nums)


  }

}
