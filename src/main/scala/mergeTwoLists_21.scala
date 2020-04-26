/**
  *
  * 合并两个有序链表
  * @auther luyao
  * @date 20-4-26
  * @version 1.0
  */
object mergeTwoLists_21 {

  class ListNode(var _x:Int = 0){
    var next :ListNode = null
    var x:Int = _x
  }


  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {

    var result = new ListNode()
    var nresult = result
    var cl1 = l1
    var cl2 = l2
    while (cl1 != null && cl2 != null){
      if(cl1.x < cl2.x){
        nresult.next = cl1
        cl1 = cl1.next
      }else{
        nresult.next = cl2
        cl2 = cl2.next
      }
      nresult = nresult.next
    }

    if(cl1 == null){
      nresult.next = cl2
    }else{
      nresult.next = cl1
    }
    result.next
  }



}
