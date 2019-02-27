/**
  * Created by luyao on 2019/2/22.
  */
object hammingDistance_461 {
  def hammingDistance(x: Int, y: Int): Int = {
    var re = x ^ y
    if (re == 0) return 0
    var cnt = 1
    while(re > 1){
      val i = re % 2
      if(i == 1) cnt = cnt +1
      re = re / 2
    }
    cnt
  }

}
