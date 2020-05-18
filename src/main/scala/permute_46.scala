/**
  *
  * @auther luyao
  * @date 20-5-18
  * @version 1.0
  */
object permute_46 {

  def permute(nums: Array[Int]): List[List[Int]] = {
    var result: Array[List[Int]] = Array()
    if(nums.size == 1 || nums.size == 0) {
      result :+= nums.toList
      return result.toList
    }else{
      val num_1 = nums.splitAt(1)._2
      val it = nums(0)
      val result_1 = permute(num_1)
      for(re <- result_1){
        for(i <- 0 to re.length){
          val re1 = re.splitAt(i)._1 ::: List(it) ::: re.splitAt(i)._2
          result:+= re1
        }
      }
      return result.toList
    }
  }

}
