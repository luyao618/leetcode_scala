/**
  *
  * @auther luyao
  * @date 20-4-29
  * @version 1.0
  */
object isPowerOfTwo_231 {

  def isPowerOfTwo(n: Int): Boolean = {
    if(n == 0) return false
    if(n == 1) return true
    if(n % 2 != 0) return false
    isPowerOfTwo(n/2)
  }

}
