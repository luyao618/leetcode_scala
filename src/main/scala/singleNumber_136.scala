/**
  * 看起来很简单的一题居然要位异或运算 无语
  * @auther luyao
  * @date 20-4-23
  * @version 1.0
  */
object singleNumber_136 {

//  def singleNumber(nums: Array[Int]): Int = {
//    var result1 = nums(0)
//    val last = if(nums(0)== nums(nums.length-1)) nums.length -2 else nums.length -1
//    var result2 = nums(last)
//    var flag1 = 1
//    var flag2 = 1
//    for(i <- 1 to nums.length -1 ){
//      if (flag1 == 0){
//        result1 = nums(i)
//      }else{
//        if (nums(i) == result1){
//          flag1 = 0
//        }
//      }
//    }
//
//    for(j <- (0 to last).reverse){
//      if (flag2 == 0){
//        result2 = nums(j)
//      }else{
//        if (nums(j) == result2){
//          flag2 = 0
//        }
//      }
//    }
//    if(flag1 !=0 ) result1 else result2
//  }


  def singleNumber(nums: Array[Int]): Int = {

    var result = 0
    for (i <- nums){
      result = result ^ i
    }
    result

  }

}
