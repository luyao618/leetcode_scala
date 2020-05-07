/**
  *
  * @auther luyao
  * @date 20-5-7
  * @version 1.0
  */
object getIntersectionNode_160 {

  // 暴力发，一个个比呗
//  def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
//
//    var anode = headA
//    var bnode = headB
//    var flag:ListNode = null
//    while(anode != null){
//      while (bnode != null){
//        if(anode == bnode){
//          flag = anode
//          return flag
//        }
//        bnode = bnode.next
//      }
//      bnode = headB
//      anode = anode.next
//    }
//    return flag
//  }


  def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
    if(headA == null || headB == null) return  null
    var anode = headA
    var bnode = headB
    var flag = 0
    while (anode != bnode ){
      if(anode.next!=null) anode = anode.next else if (flag == 0) {
        anode = headB
        flag = 1
      }else{
        return null
      }
      if(bnode.next!=null) bnode = bnode.next else bnode = headA
    }
    anode
  }

}
