/**
  * 162. 寻找峰值
  * 输入: nums = [1,2,1,3,5,6,4]
  * 输出: 1 或 5
  * Created by luyao on 2019/2/28.
  */
object findPeakElement_162_852 {


  def main(args: Array[String]): Unit = {
    val arr = Array[Int](1,2,3,1)
    println(findPeakElement(arr))
  }


  def findPeakElement(nums: Array[Int]): Int = {

    if(nums.length==0) return -1
    if(nums.length==1) return 0

    var left = 0
    if(nums(left) > nums(1)) return left
    var right = nums.length-1
    if(nums(right) > nums(right -1)) return right

    while (left <= right){
      val res:Int = (left + right) / 2
      if(nums(res) > nums(res-1) && nums(res) > nums(res + 1)) return res
      if(nums(res) > nums(res-1)){
        left = res + 1
      }else{
        right = right -1
      }
    }
    right -1
  }
}
