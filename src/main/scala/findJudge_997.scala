/**
  * Created by luyao on 2019/3/13.
  */
object findJudge_997 {

  def findJudge(N: Int, trust: Array[Array[Int]]): Int = {
    val res = new Array[Int](N)
    for(t <- trust){
      res(t(0)-1) = - N -1
      res(t(1)-1) = res(t(1)-1) + 1
    }
    var flag = 0
    var result = 0
    for(r <- 0 to N-1){
      if(res(r) == N -1){
        flag = flag + 1
        result = r + 1
      }
    }
    if(flag == 1){
      result
    }else -1
  }

  def main(args: Array[String]): Unit = {
    val test = new Array[Int](10)
    test(0) = 1
    test(2) = 3
    for (i <- test){
      println(i)
    }
  }


}
