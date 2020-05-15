import scala.collection.mutable

/**
  *
  * @auther luyao
  * @date 20-5-15
  * @version 1.0
  */
object movingCount_m13 {
  def movingCount(m: Int, n: Int, k: Int): Int = {
    val set:mutable.Set[(Int,Int)] = mutable.Set()
    fun(0,m,0,n,k,set)
  }

  def fun(i: Int, m: Int, j: Int, n: Int, k: Int,set:mutable.Set[(Int,Int)]): Int = {
    if (i >= m || j >= n || canWalk(i,j,k)==0 || set.contains((i,j)) ){
      return 0
    }
    set.add((i,j))
    fun(i+1,m,j,n,k,set) + fun(i,m,j+1,n,k,set) + 1
  }


  def canWalk(index_m: Int, index_n: Int, k: Int): Int = {
    var result = 0
    for (c <- index_m.toString) result = result + c.toString.toInt
    for (c <- index_n.toString) result = result + c.toString.toInt
    if (result <= k) return 1 else return 0
  }


}
