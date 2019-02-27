/**
  * 4. 寻找两个有序数组的中位数
  * Created by luyao on 2019/2/18.
  */
object findMedianSortedArrays_4 {

  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    var res:Double = 0.0
    if(nums1.length == 0){
      if(nums2.length % 2 ==0){
        val res1 = nums2(nums2.length/2)
        val res2 = nums2(nums2.length/2 -1)
        res = ( res1 + res2 ) / 2.0
        return res
      }else{
        return nums2((nums2.length-1)/2)
      }
    }
    if(nums2.length == 0){
      if(nums1.length % 2 ==0){
        res = (nums1(nums1.length/2) + nums1(nums1.length/2 -1))/2.0
        return res
      }else{
        return nums1((nums1.length-1)/2)
      }
    }

    //两个数据的总数
    val all_cnt = nums1.length + nums2.length
    var mid_index = 0
    //基数 中位数是从小到大 第
    if(all_cnt % 2 ==1){
      mid_index = (all_cnt + 1) / 2
      var node = 0
      var node_1 = 0
      var node_2 = 0
      while(node < mid_index -1){
        if(node_1 > nums1.length-1){
          node_2 = node_2 + 1
        }else if(node_2 > nums2.length-1){
          node_1 = node_1 + 1
        }else{
          if(nums1(node_1) <= nums2(node_2)){
            node_1 = node_1 + 1
          }  else {
            node_2 = node_2 + 1
          }
        }
        node = node + 1
      }
      if(node_1 > nums1.length-1) return nums2(node_2)
      if(node_2 > nums2.length-1) return nums1(node_1)
      if(nums1(node_1) <= nums2(node_2)) return nums1(node_1) else return nums2(node_2)
    }else{
      mid_index = all_cnt / 2
      var res1 = 0.0
      var res2 = 0.0
      var node = 0
      var node_1 = 0
      var node_2 = 0
      while(node < mid_index -1){
        if(node_1 > nums1.length-1){
          node_2 = node_2 + 1
        }else if(node_2 > nums2.length-1){
          node_1 = node_1 + 1
        }else{
          if(nums1(node_1) <= nums2(node_2)){
            node_1 = node_1 + 1
          }  else {
            node_2 = node_2 + 1
          }
        }
        node = node + 1
      }
      if(node_1 > nums1.length-1){
        res1 = nums2(node_2)
        node_2 = node_2 + 1
      }else if(node_2 > nums2.length-1){
        res1 = nums1(node_1)
        node_1 = node_1 + 1
      }else{
        if(nums1(node_1) <= nums2(node_2)){
          res1 = nums1(node_1)
          node_1 = node_1 + 1
        }else{
          res1 = nums2(node_2)
          node_2 = node_2 + 1
        }
      }

      if(node_1 > nums1.length-1){
        res2 = nums2(node_2)
      }else if(node_2 > nums2.length-1){
        res2 = nums1(node_1)
      }else{
        if(nums1(node_1) <= nums2(node_2)){
          res2 = nums1(node_1)
        }else{
          res2 = nums2(node_2)
        }
      }
      val res:Double = (res1+res2) /2
      return res
    }
  }


  def main(args: Array[String]): Unit = {
    val num1:Array[Int] = Array(2,3)
    val num2:Array[Int] = Array()
    println(findMedianSortedArrays(num1,num2))
  }


}
