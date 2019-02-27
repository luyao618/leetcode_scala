import scala.collection.mutable.ArrayBuffer

/**
  * Created by luyao on 2018/12/28.
  */
object plusOne_66 {

  def plusOne(digits: Array[Int]): Array[Int] = {

    var i = digits.length -1
    while (i >= 0){
      val re = if (digits(i) == 9) 0 else digits(i)+1
      if(re == 0){
        digits(i) = 0
        i = i-1
      } else {
        digits(i) = re
        return digits
      }
    }
    digits(0) = 1
    val new_digits = new Array[Int](digits.length +1)
    for(d <- 0 to digits.length -1) new_digits(d) = digits(d)
    new_digits(new_digits.length -1) = 0
    return new_digits
  }

  def addOne(v:Int):Int = {
    if (v == 9) 0 else v+1
  }

  def main(args: Array[String]): Unit = {
    val arr = Array[Int](9,9,9)
    val re = plusOne(arr)
    for (r <- re){
      println(r)
    }
  }

}
