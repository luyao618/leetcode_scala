/**
  *
  * @auther luyao
  * @date 20-4-21
  * @version 1.0
  */
object longestCommonPrefix_14 {

  def longestCommonPrefix(strs: Array[String]): String = {
    var result = ""
    if(strs.size == 0) return ""
    if(strs.size == 1) return strs(0)
    result = strs(0)
    for(i <- 1 to strs.length -1){
      var result_tmp = ""
      val tmp = strs(i)
      var flag = 0
      var length = tmp.length -1
      if (result.length -1 <= length) length = result.length -1
      for(s <- 0 to length ){
        val c2 = tmp.charAt(s)
        val c1 = result.charAt(s)
        if(flag == 0 && c1 == c2){
          result_tmp = result_tmp + c1
        }else{
          flag = 1
        }
      }
      if(result_tmp == "") return "" else result = result_tmp
    }
    result
  }

  def longestCommonPrefix_w2 (strs: Array[String]): String = {
    var result = ""
    if(strs.size == 0) return ""
    if(strs.size == 1) return strs(0)




    result
  }

  def main(args: Array[String]): Unit = {

    val test_arr = Array("aac","ab")
    println(longestCommonPrefix_w2(test_arr))

  }



}
