/**
  * 1。给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
  * Created by luyao on 2018/12/28.
  */
object TwoSum_1 {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val re = Array[Int]()
    for(i <- 0 to nums.length-2){
      for(j <- i to nums.length-1){
        if(nums(i)+nums(j)==target){
          return Array[Int](i,j)
        }
      }
    }
    return re
  }

  def twoSumMap(nums: Array[Int], target: Int): Array[Int] = {
    import scala.collection.mutable.Map
    val data = Map[Int,Int]()
    val re = Array[Int](2)
    for(i <- 0 to nums.length-1){
      val want = target - nums(i)
      if(data.contains(want)){
        return Array[Int](i,data.get(want).get)
      }else{
        data+=(nums(i) -> i)
      }
    }
    return re
  }

  def main(args: Array[String]): Unit = {
    val re = Array[Int](2, 7, 11, 15)
    val rrr = twoSumMap(re,18)
    for(r <- rrr){
      println(r)
    }
  }

}
