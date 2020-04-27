/**
  *
  * 判断链表是否有环
  * @auther luyao
  * @date 20-4-27
  * @version 1.0
  */
object hasCycle_141 {

  def hasCycle(head: ListNode): Boolean = {

    var pos = -1
    if(head == null) return false
    var slist:Array[ListNode] = Array()
    slist:+= head
    var pnode = head
    var flag = false
    while (pnode.next != null && pos == -1){
      pnode = pnode.next
      for(i <- 0 to slist.length -1){
        if(pnode == slist(i)){
          pos = i
          flag = true
        }
      }
      slist :+= pnode
    }
    flag

  }

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

}


