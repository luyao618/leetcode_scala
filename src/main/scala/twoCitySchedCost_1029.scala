/**
  * 两地调度
  *  按差值排序然后贪心算法
  * @auther luyao
  * @date 20-1-6
  * @version 1.0
  */
object twoCitySchedCost_1029 {
  def twoCitySchedCost(costs: Array[Array[Int]]): Int = {

    val costs_sorted = costs.sortBy(x=> - Math.abs(x(0)-x(1)))
    var count_A = 0
    var count_B = 0
    var money_cnt = 0
    for(p <- costs_sorted){
      if (p(0) < p(1)){
        if(count_A < costs_sorted.length/2){
          count_A = count_A + 1
          money_cnt = money_cnt + p(0)
        }else{
          count_B = count_B + 1
          money_cnt = money_cnt + p(1)
        }
      }else{
        if(count_B < costs_sorted.length/2){
          count_B = count_B + 1
          money_cnt = money_cnt + p(1)
        }else{
          count_A = count_A + 1
          money_cnt = money_cnt + p(0)
        }
      }
    }
    money_cnt
  }

  val costs: Array[Array[Int]] = Array(Array(10,20),Array(30,200),Array(400,50),Array(30,20))
}
