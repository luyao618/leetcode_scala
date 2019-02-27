/**
  * Created by luyao on 2018/12/29.
  */
object majorityElement_169 {

  def majorityElement(nums: Array[Int]): Int = {

    var mode = nums(0)
    var cnt = 1
    for (i <- 1 to nums.length){
      if(nums(i) == mode){
        cnt = cnt +1
      }else{
        cnt = cnt -1
        if(cnt < 0){
          mode = nums(i)
          cnt = 1
        }
      }
    }
    mode
  }


}
