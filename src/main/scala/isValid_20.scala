import com.sun.tools.javac.util.ListBuffer

import scala.collection.mutable.ArrayBuffer

/**
  * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
  * Created by luyao on 2019/1/21.
  */
object isValid_20 {


  def sulution(s:String):Boolean = {

    val z = new ArrayBuffer[String]
    for(str <- s){
      val c = str.toString
      c.toString match {
        case ")" => if(z.length!=0 && z(z.length-1) == "(") z.trimEnd(1) else return false
        case "]" => if(z.length!=0 && z(z.length-1) == "[") z.trimEnd(1) else return false
        case "}" => if(z.length!=0 && z(z.length-1) == "{") z.trimEnd(1) else return false
        case "(" => z += c.toString
        case "[" => z += c.toString
        case "{" => z += c.toString
        case _ => return false
      }
    }
    if(z.length == 0) true else false
  }

  def main(args: Array[String]): Unit = {
    println(sulution("()"))
    println(sulution("()[]{}"))
    println(sulution("(]"))
    println(sulution("([)]"))
    println(sulution("{[]}"))

  }



}
