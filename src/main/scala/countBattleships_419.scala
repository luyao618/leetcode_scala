/**
  * 甲板上的战舰
  *   关键点：计算每个战舰的左上角
  * @auther luyao
  * @date 20-1-6
  * @version 1.0
  */
object countBattleships_419 {

  def countBattleships(board: Array[Array[Char]]): Int = {
    var count = 0
    val ship:Char = "X".charAt(0)
    for(h <- 0 to board.length-1){
      for(l <- 0 to board(0).length -1){
        if(board(h)(l) == ship){
          if(h>0 && l >0){
            if (board(h)(l-1) != ship && board(h-1)(l) != ship){
              count = count +1
            }
          }else if(h>0 && l==0){
            if (board(h-1)(l) != ship){
              count = count +1
            }
          }else if(h==0 && l>0){
            if (board(h)(l-1) != ship){
              count = count +1
            }
          }else{
            count = count +1
          }
        }
      }
    }
    count
  }

}
