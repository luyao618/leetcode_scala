/**
  * Created by luyao on 2019/1/22.
  */
object uniquePaths_62 {

  def solution(m:Int,n:Int): Int ={
    val matrix = Array.ofDim[Int](n,m)

    for(i <- 0 to n-1 ){

      if(i==0){
        for(j <- 0 to m-1) matrix(i)(j) = 1
      }else{
        for(j <- 0 to m-1){
          if(j == 0){
            matrix(i)(j) = 1
          } else{
            matrix(i)(j) = matrix(i-1)(j) + matrix(i)(j-1)
          }
        }
      }
    }
    matrix(n-1)(m-1)
  }

  def main(args: Array[String]): Unit = {

    println(solution(7,3))


  }


}
