/**
  * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
  *
  * @auther luyao
  * @date 19-11-22
  * @version 1.0
  */
object mergeKLists_23 {

  class ListNode(var _x:Int = 0){
    var next :ListNode = null
    var x:Int = _x
  }


//  // 暴力法
//  def mergeKLists(lists: Array[ListNode]): ListNode = {
//    if(lists == null) return new ListNode()
//    val result:ListNode = new ListNode()
//    var result_tail:ListNode = new ListNode()
//    result.next = result_tail
//    var all_data_arr:Array[Int] = Array()
//    for(i <- 0 to lists.length -1){
//      var ls = lists(i)
//      if(ls !=null && ls.x!=null){
//        all_data_arr :+= ls.x
//        while (ls.next!=null){
//          all_data_arr :+= ls.next.x
//          ls = ls.next
//        }
//      }
//    }
//    all_data_arr = all_data_arr.sorted
//    for(j <- 0 to all_data_arr.length -1){
//      result_tail.next = new ListNode(all_data_arr(j))
//      result_tail = result_tail.next
//    }
//    result.next.next
//  }

  def mergeKLists(lists: Array[ListNode]): ListNode = {
    if(lists == null || lists.size == 0) return null
    merge(lists,0,lists.length-1)
  }

  def merge(lists: Array[ListNode],left:Int,right: Int): ListNode ={
    if(left == right) return lists(left)
    val mid = (left + right ) / 2
    val left_l = merge(lists,left ,mid)
    val right_l = merge(lists,mid + 1 ,right)
    mergeTwoLists(left_l,right_l)
  }



  //递归法合并两个链表
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode ={
    var result = new ListNode()
    if(l1 == null) return l2
    if(l2 == null) return l1
    if(l1.x <= l2.x){
      l1.next = mergeTwoLists(l1.next,l2)
      result = l1
    }else{
      l2.next = mergeTwoLists(l1,l2.next)
      result = l2
    }
    result
  }


  def main(args: Array[String]): Unit = {

    val listNode1 = new ListNode(1)
    listNode1.next = new ListNode(4)
    listNode1.next.next = new ListNode(5)

    val listNode2 = new ListNode(1)
    listNode2.next = new ListNode(3)
    listNode2.next.next = new ListNode(4)

    val listNode3 = new ListNode(2)
    listNode3.next = new ListNode(6)

    var test_arr:Array[ListNode] = Array(listNode1,listNode2,listNode3)

    mergeKLists(test_arr)

  }

}
