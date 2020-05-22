/**
  *
  * @auther luyao
  * @date 20-5-22
  * @version 1.0
  */
object threeSum_15_X {

  def threeSum(nums: Array[Int]): List[List[Int]] = {
    if(nums.length<3) return List()
    if(nums.length==3){
      if(nums(0)+ nums(1)+ nums(2)==0) return List(nums.toList) else List(List())
    }
    var result:List[List[Int]] = List()
    val nums_sorted = nums.sorted
    var i = 0
    val test1 = nums(i) < 1
    val test2 = i < nums_sorted.length-1
    while (( nums_sorted(i) < 1) && (i < nums.length-1)){
      if(!(i>0 && nums_sorted(i)==nums_sorted(i-1))){
        result = result:::(twoSum(nums_sorted.drop(i+1),-nums_sorted(i)).map(ls=> List(nums_sorted(i))::: ls))
      }
      i = i+1
    }
    result.distinct
  }


  def twoSum(nums:Array[Int],k:Int): List[List[Int]] ={
    var result:Array[List[Int]] = Array()
    var L = 0
    var R = nums.length-1
    while (L < R){
      if(nums(L) + nums(R) < k){
        L = L + 1
      }else if(nums(L) + nums(R) > k ){
        R = R - 1
      }else{
        result :+= List(nums(L),nums(R))
        L = L + 1
      }
    }
    result.toList
  }


  def main(args: Array[String]): Unit = {

    var arr = Array(1,-1,-1,0)
    threeSum(arr).foreach(x=>x.foreach(x => println(x)))


  }



}
