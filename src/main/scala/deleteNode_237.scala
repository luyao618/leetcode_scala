/**
  *
  * 这题有病
  * @auther luyao
  * @date 20-4-26
  * @version 1.0
  */
object deleteNode_237 {

  def deleteNode(node: ListNode): Unit = {
    node.x = node.next.x
    node.next = node.next.next

  }


}


class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
