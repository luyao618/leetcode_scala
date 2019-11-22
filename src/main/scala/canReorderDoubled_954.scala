/**
  *
  * @auther luyao
  * @date 19-9-27
  * @version 1.0
  */
object canReorderDoubled_954 {

  def main(args: Array[String]): Unit = {
    val testArr = Array(1,2,9,2,4,2)
    canReorderDoubled(testArr)
  }

  // 也就是说对与给定的数组,可以分成len(A)/2对数据,每对数是a,2a
  // 先排序,然后找大数

  //有个bug,是绝对值 而不是大小..
  def canReorderDoubled(A: Array[Int]): Boolean = {
    val sorted = A.sortBy(x=>x)
    var B:Array[Int] = Array()
    var flag = true
    for(i <- 0 to (sorted.length)- 2 ){
      if(!B.contains(i)){
        B :+= i
        var j = i+1
        while(j <= sorted.length-1){
          if(!B.contains(j)){
            if(sorted(j) == 2 * sorted(i)){
              B :+= j
              j = sorted.length
            }else{
              j = j+1
              if (j == sorted.length) flag = false
            }
          }else{
            j = j + 1
            if (j == sorted.length) flag = false
          }
        }
      }
    }
    return flag
  }

}
