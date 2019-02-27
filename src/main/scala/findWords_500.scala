/**
  * Created by luyao on 2019/2/19.
  */
object findWords_500 {

  def findWords(words: Array[String]): Array[String] = {
    import scala.collection.mutable.ArrayBuffer
    val res = new ArrayBuffer[String]()
    val line_index:Map[String,Int] =
      Map("Q" -> 1,"q" -> 1,"W" -> 1,"w" -> 1,"E" -> 1, "e" -> 1,"R" -> 1,"r" -> 1,"T" -> 1,"t" -> 1,"Y" -> 1,"y" -> 1,"U" -> 1,"u" -> 1, "I" -> 1,"i" -> 1, "O" -> 1,"o" -> 1,"P" -> 1, "p" -> 1,
      "A" -> 2,"a" -> 2,"S" -> 2,"s" -> 2,"D" -> 2,"d" -> 2,"F" -> 2,"f" -> 2,"G" -> 2,"g" -> 2,"H" -> 2,"h" -> 2,"J" -> 2,"j" -> 2,"K" -> 2,"k" -> 2,"L" -> 2,"l" ->2,
      "Z" -> 3,"z" -> 3,"X" -> 3,"x" -> 3,"C" -> 3,"c" -> 3,"V" -> 3,"v" -> 3,"B" -> 3,"b" -> 3,"N" -> 3,"n" -> 3,"M" -> 3,"m" -> 3)
    for(word <- words){
      val line_num = line_index.get(word(0).toString).get
      var flag = 0
      for(s <- word){
        if(line_index.get(s.toString).get!=line_num) flag = 1
      }
      if(flag == 0) res += word
    }
    res.toArray
  }

  def main(args: Array[String]): Unit = {
    val param = Array("Hello", "Alaska", "Dad", "Peace")
    val res = findWords(param)
    for (s <- res) println(s)
  }

}
