/**
  *
  * @auther luyao
  * @date 20-5-14
  * @version 1.0
  */
object search_33 {


  def search(nums: Array[Int], target: Int): Int = {
    var right = nums.length -1
    var left = 0
    if(nums.length == 0) return -1
    if(target == nums(0)) return 0
    while (left <= right){

      val tmp_index = (left + right) / 2
      if(target == nums(tmp_index)){
        return tmp_index
      }else{
        if(nums(tmp_index) >= nums(0)){
          // 在左区
          if(nums(tmp_index) < target){
            left = tmp_index + 1
          }else{
            if(target > nums(0)){
              right = tmp_index -1
            }else{
              left = tmp_index + 1
            }
          }
        }else{
          // 在右区
          if(nums(tmp_index) < target){
            if(target > nums(0)){
              right = tmp_index -1
            }else{
              left = tmp_index +1
            }
          }else{
            right = tmp_index -1
          }
        }
      }
    }
    -1
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(1,3)
    val target = 3
    println(search(nums,target))
  }

}
