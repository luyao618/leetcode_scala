/**
  *
  * @auther luyao
  * @date 20-5-11
  * @version 1.0
  */
object merge_88 {

  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {

    var result:Array[Int] = Array()

    if(m==0){
      result = nums2
    }else{
      for(i <- 0 to n-1){
        nums1(m+i) = nums2(i)
      }
      result = nums1.sorted

    }

    for(j<- 0 to m+n-1){
      nums1(j) = result(j)
    }



  }



}
