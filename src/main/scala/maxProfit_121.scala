/**
  * 买卖股票的最佳时机
  * Created by luyao on 2019/1/22.
  */
object maxProfit_121 {

  def solution(prices: Array[Int]): Int ={
    //最大收入
    var max_value = 0
    //最便宜价格
    var min_price = prices(0)
    for(p <- prices){
      if(p < min_price){
        min_price = p
      }

      if((p - min_price) > max_value){
        max_value = p - min_price
      }
    }
    max_value
  }

  def main(args: Array[String]): Unit = {
    val a = Array[Int](7,6,4,3,1)
    println(solution(a))
  }

}
