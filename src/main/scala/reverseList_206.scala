/**
  * 反转链表
  * Created by luyao on 2019/2/12.
  */
object reverseList {


  def reverseList(head:ListNode):ListNode = {
    var p_head:ListNode = null
    if(head == null ) return p_head
    if(head.next == null) return head
    var p1 = head
    var p2:ListNode = head.next
    var p3:ListNode = null

    while(p2.next != null){
      p3 = p2.next

      p2.next = p1


      p1 = p2
      p2 = p3
      p3 = null
    }
    head.next = null
    p2.next = p1
    p_head = p2
    p_head
  }


}

class ListNode(var _x:Int = 0){
  var next:ListNode = null
  var x:Int = _x
}
