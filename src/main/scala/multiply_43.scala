import scala.collection.mutable.ArrayBuffer

/**
  * 字符串相乘
  * Created by luyao on 2019/1/21.
  */

/**
num1的第i位(高位从0开始)和num2的第j位相乘的结果在乘积中的位置是[i+j, i+j+1]
        例: 123 * 45,  123的第1位 2 和45的第0位 4 乘积 08 存放在结果的第[1, 2]位中
          index:    0 1 2 3 4

                        1 2 3
                    *     4 5
                    ---------
                          1 5
                        1 0
                      0 5
                    ---------
                      0 6 1 5
                        1 2
                      0 8
                    0 4
                    ---------
                    0 5 5 3 5
        这样我们就可以单独都对每一位进行相乘计算把结果存入相应的index中
  **/


object multiply_43 {
  def main(args: Array[String]): Unit = {
    println(multiply("2","3"))
  }


  def solution_little(num1:String,num2:String): String ={
    var tmp_a = ""
    var tmp_b = ""
    if (num1.length >= num2.length){
      tmp_a = num1
      tmp_b = num2
    }else{
      tmp_a = num2
      tmp_b = num1
    }
    val nums = new ArrayBuffer[Long]
    var add_0 = ""
    for(c <- tmp_b){
      val re = tmp_a.toLong * c.toString.toLong + add_0
      add_0 = add_0 + "0"
      nums += re.toLong
    }
    nums.sum.toString
  }


  def multiply(num1:String,num2:String):String = {
    val n1 = num1.length -1
    val n2 = num2.length -1
    if(n1 < 0 || n2 < 0 ) return ""
    if(num1 == "0" || num2 =="0") return "0"
    var mul:Array[Int] = new Array[Int](n1 + n2 + 2)
    for(i <- n1 to 0 by -1){
      for(j <- (0 to n2).reverse){
        var bitmul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
        bitmul = bitmul + mul(i + j + 1)
        mul(i + j) = mul(i + j) + bitmul / 10
        mul(i + j + 1) = bitmul % 10
      }
    }

    val sb = new StringBuilder()
    var i = 0
    while (i < mul.length && mul(i) == 0) i = i+1
    for(j <- i to mul.length-1) sb.append(mul(j))
    sb.toString()
  }

}
