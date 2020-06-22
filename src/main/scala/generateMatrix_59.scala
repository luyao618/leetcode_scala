/**
  * Created by luis on 2020/6/22.
  */
object generateMatrix_59 {

  def generateMatrix(n: Int): Array[Array[Int]] = {
    import Array._
    var result:Array[Array[Int]] = ofDim[Int](n,n)
    var x,y = 0
    for(i <- 1 to n*n ){
      result(x)(y)=i
      if((y+1 <= n-1 && result(x)(y+1)== 0 && result(x+1)(y)==0 && x+1 <= n-1) || (y+1 <= n-1 && result(x)(y+1)==0 && x-1>=0 && result(x-1)(y)!=0)){
        y = y +1
      }else if( x+1 <= n-1 && result(x+1)(y)==0){
        x = x + 1
      }else if(y-1 >= 0 && result(x)(y-1) == 0){
        y = y-1
      }else{
        x = x-1
      }

    }
    result
  }

  def main(args: Array[String]): Unit = {
    generateMatrix(3)
  }

}
