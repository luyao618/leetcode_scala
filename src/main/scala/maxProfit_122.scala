/**
  * Created by luyao on 2019/3/12.
  */
object maxProfit_122 {

  def maxProfit(prices: Array[Int]): Int = {
    //总收益
    var total = 0
    //是否持有股票
    var hasFlag = 0
    //买入价格
    var min = 0
    //脚标
    var index = 0
    while (index <= prices.length-1){
      if(hasFlag == 0 ){
        if(index != prices.length-1){
          if(prices(index) < prices(index + 1)){
            //未持有 并且非最后一天 价格小于第二天 买
            min = prices(index)
            hasFlag = 1
            index = index +1
          }else{
            //未持有 并且非最后一天 价格大于第二天 等
            index = index +1
          }
        }else{
          //未持有 并且是最后一天
          index = index +1
        }
      }else{

        if(index == prices.length-1){
          //持有并且是最后一天 卖
          total = total + (prices(index) - min)
          hasFlag = 0
        }else{
          //持有 非最后一天
          if(prices(index) > prices(index + 1)){
            //下一天降价了 卖
            total = total + (prices(index) - min)
            hasFlag = 0
          }else{
            //未降价 继续等
            index = index + 1
          }
        }
      }
    }
    total
  }

}
