/**
  *
  * @auther luyao
  * @date 20-4-28
  * @version 1.0
  */
object detectCycle_142 {
  def detectCycle(head: ListNode): ListNode = {
    var pos = -1
    var re:ListNode = null
    if(head == null) return re
    var slist:Array[ListNode] = Array()
    slist:+= head
    var pnode = head
    while (pnode.next != null && pos == -1){
      pnode = pnode.next
      for(i <- 0 to slist.length -1){
        if(pnode == slist(i)){
          pos = i
          re = slist(i)
        }
      }
      slist :+= pnode
    }
    re
  }

}
