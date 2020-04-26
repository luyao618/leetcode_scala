/**
  *
  * @auther luyao
  * @date 20-4-24
  * @version 1.0
  */
object reverseString_344 {

  def reverseString(s: Array[Char]): Unit = {
    var left = 0
    var right = s.length-1
    while (left < right){
      val tmp = s(left)
      s(left) = s(right)
      s(right) = tmp
      left = left +1
      right = right -1
    }
  }


}
