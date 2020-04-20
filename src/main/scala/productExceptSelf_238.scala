/**
  * 238. 除自身以外数组的乘积
  * @auther luyao
  * @date 20-1-20
  * @version 1.0
  */
object productExceptSelf_238 {

  def productExceptSelf(nums: Array[Int]): Array[Int] = {

    var result:Array[Int] = new Array(nums.length)
    result(0) = 1

    for(i <- 1 to nums.length-1){
      result(i) = result(i-1) * nums(i-1)
    }

    var R = 1
    for(i <- (1 to nums.length-1).reverse){
      result(i) = result(i) * R
      R = R * nums(i)

    }
    result

  }


  def main(args: Array[String]): Unit = {

    val nums = Array(1,2,3,4)
    productExceptSelf(nums)


  }

}
