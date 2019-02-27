
/**
  * Created by luyao on 2018/12/28.
  */
object longestPalindrome_5_9 {
  def main(args: Array[String]): Unit = {
    val st = "abcyaskwbb"
    println(longestPalindrome(st))
  }

//
//  def longestPalindrome(str:String): String ={
//    if(str.length == 0) return ""
//    else if(str.length == 1) return str
//    else{
//      var longest:String = str(0).toString
//      var longest_s_e = (0,0)
//      for(i <- 1 to str.length -1){
//        if(longest_s_e._2 == i-1 && longest_s_e._1!=0){
//          if(isPalindrome(str(longest_s_e._1-1)+longest+str(i))){
//            longest = str(longest_s_e._1-1)+longest+str(i)
//            longest_s_e = (longest_s_e._1-1,i)
//          }
//        }else{
//          if(longest.length <= i-1){
//            if(isPalindrome(str.substring(i-longest.length-1,i+1))){
//              longest = str.substring(i-longest.length-1,i+1)
//              longest_s_e = (i+1-longest.length,i)
//            } else if(isPalindrome(str.substring(i-longest.length,i+1))){
//              longest = str.substring(i-longest.length,i+1)
//              longest_s_e = (i+1-longest.length,i)
//            } else if(isPalindrome(longest+str(i))){
//              longest = longest+str(i)
//              longest_s_e = (longest_s_e._1,i)
//            }
//          }
//        }
//
//      }
//      longest
//    }
//
//  }

  def longestPalindrome(str:String): String ={
    if(str.length == 0) return ""
    else if(str.length == 1) return str
    else{
      var longest:String = str(0).toString
      var longest_s_e = (0,0)
      for(i <- 0 to str.length -1){
        for(j <- i+1 to str.length){
          if(isPalindrome(str.substring(i,j))){
            if(str.substring(i,j).length>longest.length)
              longest = str.substring(i,j)
          }
        }
      }
      longest
    }

  }


  def isPalindrome(str:String): Boolean ={
    var i = 0
    var j = str.length -1
    while (i <= j){
      if(str(i)==str(j)){
        i = i+1
        j = j-1
      }else{
        return false
      }
    }
    return true

  }

}
