import scala.collection.mutable.ArrayBuffer

/**
  * Created by luyao on 2019/2/22.
  */
object MinStack {

}


class MinStack() {

  /** initialize your data structure here. */
  var stackData = ArrayBuffer[Int]()
  var minData = ArrayBuffer[Int]()

  def push(x: Int) {

    stackData.+=(x)
    if(minData.length==0){
      minData+=(x)
    }else{
      if(x < minData(minData.length-1)){
        minData.+=(x)
      }else{
        minData.+=(minData(minData.length-1))
      }
    }
  }

  def pop() {
    stackData = stackData.dropRight(1)
    minData = minData.dropRight(1)
  }

  def top(): Int = {
    if(stackData.length == 0) return -1 else{
      stackData(stackData.length-1)
    }


  }

  def getMin(): Int = {
    if(minData.length == 0) return -1 else{
      minData(stackData.length-1)
    }

  }

}
