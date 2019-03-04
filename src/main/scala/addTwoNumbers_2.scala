/**
  * Created by luyao on 2018/12/29.
  */
object addTwoNumbers_2 {
  def main(args: Array[String]): Unit = {
    val a = new ListNode(2)
    a.next = new ListNode(4)
    a.next.next = new ListNode(3)
    val b = new ListNode(5)
    b.next = new ListNode(6)
    b.next.next = new ListNode(4)
    val c = Solution(a,b)
    println(c.x)
    println(c.next.x)
    println(c.next.next.x)
  }


  def Solution(l1:ListNode,l2:ListNode): ListNode ={
    val head = new ListNode(0)
    var temp = head
    var temp1 = l1
    var temp2 = l2
    var a=0
    var flag = 0
    while(flag==0){
      if(temp1==null && temp2 == null){
        if(a!=0){
          temp.next = new ListNode(a)
        }
        flag = 1
      }

      if (null != temp2 && null == temp1) {
        var c= temp2.x + a
        a=0
        if (c >= 10) {
          c = c%10
          a =a +1
        }
        temp.next=new ListNode(c)
      }

      if (null != temp1 && null == temp2) {
        var c=temp1.x + a
        a=0
        if (c >= 10) {
          c=c%10
          a = a+1
        }
        temp.next=new ListNode(c)
      }

      if (null != temp1 && null != temp2){
        var c = temp1.x + temp2.x + a
        a=0
        if (c >= 10) {
          c=c%10;
          a = a+1
        }
        temp.next=new ListNode(c);
      }


      if (null != temp1){
        temp1 = temp1.next
      }
      if (null != temp2) {
        temp2 = temp2.next
      }
      temp=temp.next;

    }

    return head.next
  }

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }


}
