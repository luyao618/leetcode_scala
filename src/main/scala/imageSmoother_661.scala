/**
  * scala100% 别人代码量怎么那么多
  * Created by luyao on 2019/3/15.
  */
object imageSmoother_661 {

  def imageSmoother(M: Array[Array[Int]]): Array[Array[Int]] = {
    //行数
    val rn = M.length
    //列数
    val cn = M(0).length
    val res_arr = Array.ofDim[Int](rn,cn)
    for(i <- 0 to rn -1){
      for(j <- 0 to cn -1){
        res_arr(i)(j) = getEvGray(M:Array[Array[Int]],i,j)
      }
    }
    res_arr
  }

  def getEvGray(M: Array[Array[Int]],r_id :Int,c_id :Int): Int ={
    var sum = 0
    var num = 0
    for(i <- r_id -1 to r_id +1){
      for(j <- c_id-1 to c_id +1){
        if(i >= 0 && j >= 0 && i<= M.length-1 && j <= M(0).length-1){
          sum = sum + M(i)(j)
          num = num + 1
        }
      }
    }
    return (sum / num).toInt
  }

  def main(args: Array[String]): Unit = {
    val arr = Array.ofDim[Int](3,3)
    arr(0) = Array[Int](1,1,1)
    arr(1) = Array[Int](1,0,1)
    arr(2) = Array[Int](1,1,1)
    val res = imageSmoother(arr)
    res
  }



}
