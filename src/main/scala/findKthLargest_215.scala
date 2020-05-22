/**
  *
  * @auther luyao
  * @date 20-5-20
  * @version 1.0
  */
object findKthLargest_215 {

//  // 排序查询
//  def findKthLargest(nums: Array[Int], k: Int): Int = {
//
//    var num_sort = nums.sorted
//    num_sort(nums.length-k)
//
//  }

  // 堆排序
  def findKthLargest(nums: Array[Int], k: Int): Int = {

    import scala.collection.mutable.PriorityQueue
    val heap = scala.collection.mutable.PriorityQueue.empty[Int]
    nums.foreach(x => heap.enqueue(x))
    val result_arr = (0 until k).map(x => heap.dequeue()).toArray
    result_arr(k-1)



  }


  def getLeastNumbers(arr: Array[Int], k: Int): Array[Int] = {
    val heap = scala.collection.mutable.PriorityQueue.empty[Int].reverse
    arr.foreach(x => heap.enqueue(x))
    (0 until k).map(x => heap.dequeue()).toArray
  }








}
