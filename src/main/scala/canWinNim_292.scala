/**
  * 292. Nim游戏
  *
  * 这题真智障
  * Created by luyao on 2019/2/27.
  */
object canWinNim_292 {

  def main(args: Array[String]): Unit = {
    println(canWinNim(4))
    println(canWinNim(5))
  }


  def canWinNim(n: Int): Boolean = {
    n % 4 != 0
  }

}
