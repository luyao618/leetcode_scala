/**
  * Created by luyao on 2019/2/22.
  */
object removeDuplicates_26 {
  def removeDuplicates(nums: Array[Int]): Int = {

    if(nums.length == 0) return 0
    var i = 0
    val j = 0
    for(j <- 0 to nums.length-1){
      if(nums(j)!=nums(i)){
        i = i + 1
        nums(i) = nums(j)
      }
    }
    return i+1


  }

}
