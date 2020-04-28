/**
  *
  * @auther luyao
  * @date 20-4-28
  * @version 1.0
  */
object reverseWords_557 {

  def reverseWords(s: String): String = {
    var result = ""
    for(word <- s.split(" ")){
      result = result + " " +  reverseWord(word)
    }
    result.trim()

  }

  def reverseWord(s:String):String ={
    var result = ""
    for(c <- s) result = c + result
    result
  }

}
