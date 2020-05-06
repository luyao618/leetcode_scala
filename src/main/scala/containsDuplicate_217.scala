/**
  *
  * @auther luyao
  * @date 20-5-6
  * @version 1.0
  */
object containsDuplicate_217 {


  // 面试中根本不会考吧
  def containsDuplicate(nums: Array[Int]): Boolean = {

    if(nums.toSet.size!= nums.length) true else false


  }

}
