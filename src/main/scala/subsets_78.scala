import scala.collection.mutable.ListBuffer

/**
  * 78. 子集
  * Created by luyao on 2019/2/20.
  */
object subsets_78 {

  def subsets(nums: Array[Int]): List[List[Int]] = {
    if(nums.length == 0) return List[List[Int]]()
    else if(nums.length == 1){
      return List[List[Int]](List[Int](),nums.toList)
    }else{
      val half = subsets(nums.dropRight(1))
      val new_half=ListBuffer[List[Int]]()
      for(arr <- half){
        val new_arr = arr:::List[Int](nums(nums.length-1))
        new_half.+=(new_arr)
      }
      half:::new_half.toList
    }

  }

  def main(args: Array[String]): Unit = {
    val test = Array(1,2,3)

    val res = subsets(test)
    for(re <- res){
      println("one arr")
      for(r <- re){
        println(r)
      }
    }


//    val test2 = test.dropRight(1)
//    for(it <- test2) println(it)
//    println(test2.length)


  }

}
