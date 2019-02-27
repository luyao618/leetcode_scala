/**
  * 7. 整数反转
  * Created by luyao on 2019/2/20.
  */
object reverse_7 {


  def reverse(x: Int): Int = {
    var flag = ""
    var index = 0
    var res = ""
    if(x == Integer.MIN_VALUE || x == 0) return 0
    else{
      var x_str = x.toString
      if(x_str.startsWith("-")){
        flag="-"
        x_str = x_str.replace("-","")
      }
      var i = x_str.length -1
      while (i >=0 && x_str.charAt(i).toString == "0"){
        index = index + 1
        i = i -1
      }
      for(i <- (0 to x_str.length - 1 -index ).reverse ){
        res = res + x_str.charAt(i).toString
      }
      res = flag + res
    }
    if(res.length > 11) return 0
    if(res.toLong > 2147483647 || res.toLong < -2147483648) return 0 else return res.toInt
  }

  def main(args: Array[String]): Unit = {
    println(reverse(-2147483412))

  }


}
